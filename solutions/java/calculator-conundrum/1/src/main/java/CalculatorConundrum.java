class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        return switch (operation) {
            case "+" -> operand1 + " + " + operand2 + " = " + (operand1 + operand2);
            case "/" -> {
                if (operand2 == 0) {
                    throw new IllegalOperationException("Division by zero is not allowed",
                            new ArithmeticException());
                }
                yield operand1 + " / " + operand2 + " = " + (operand1 / operand2);
            }
            case "*" -> operand1 + " * " + operand2 + " = " + (operand1 * operand2);
            case "" -> throw new IllegalArgumentException("Operation cannot be empty");
            case "-" -> throw new IllegalOperationException("Operation '-' does not exist");
            default -> throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        };
    }
}
