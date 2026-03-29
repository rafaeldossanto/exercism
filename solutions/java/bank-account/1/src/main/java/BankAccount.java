class BankAccount {
    public boolean status;
    public int saldo;

    void open() throws BankAccountActionInvalidException {
        if(status){
            throw new BankAccountActionInvalidException("Account already open");
        } else status = true; saldo = 0;
    }

    void close() throws BankAccountActionInvalidException {
        if (!status) {
            throw new BankAccountActionInvalidException("Account not open");
        }
        status = false;
        saldo = 0;
    }

    synchronized int getBalance() throws BankAccountActionInvalidException {
        if (!status) {
            throw new BankAccountActionInvalidException("Account closed");
        }
        return saldo;
    }

    synchronized void deposit(int amount) throws BankAccountActionInvalidException {
        if (!status) {
            throw new BankAccountActionInvalidException("Account closed");
        } else if (amount < 0) {
            throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        }
        saldo += amount;
    }

    synchronized void withdraw(int amount) throws BankAccountActionInvalidException {
        if (!status) {
            throw new BankAccountActionInvalidException("Account closed");
        } else if (amount < 0) {
            throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        } else if (amount > saldo) {
            throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account");
        }
        saldo -= amount;
    }

}