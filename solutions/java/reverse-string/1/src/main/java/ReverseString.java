class ReverseString {
    StringBuilder builder = new StringBuilder();

    String reverse(String inputString) {
        return builder.subSequence(0, inputString.length()).toString();
    }
  
}
