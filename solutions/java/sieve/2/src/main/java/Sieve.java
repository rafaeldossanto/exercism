import java.util.ArrayList;
import java.util.List;

class Sieve {

    private final List<Integer> primes;

    public Sieve(int limit) {
        this.primes = sieveOfEratosthenes(limit);
    }

    public List<Integer> getPrimes() {
        return primes;
    }

    private List<Integer> sieveOfEratosthenes(int limit) {
        if (limit < 2) {
            return new ArrayList<>();
        }

        boolean[] isPrime = new boolean[limit + 1];

        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= limit; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }
}
