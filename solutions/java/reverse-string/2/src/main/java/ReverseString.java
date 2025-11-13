class ReverseString {
    StringBuilder builder = new StringBuilder();

    String reverse(String inputString) {
        return new StringBuilder(inputString).reverse().toString();
    }
  
}
