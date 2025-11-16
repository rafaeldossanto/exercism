class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        String numberStr = String.valueOf(numberToCheck);
        int numDigits = numberStr.length();
        int sum = 0;

        for (int i = 0; i < numDigits; i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            sum += (int) Math.pow(digit, numDigits);
        }

        return sum == numberToCheck;
    }
}
