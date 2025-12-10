class Bob {
    String hey(String input) {
        String s = input.trim();

        if (s.isEmpty()) return "Fine. Be that way!";

        boolean question = s.endsWith("?");
        boolean yelling = s.matches(".*[A-Z].*") && s.equals(s.toUpperCase());

        if (question && yelling) return "Calm down, I know what I'm doing!";
        if (yelling) return "Whoa, chill out!";
        if (question) return "Sure.";

        return "Whatever.";
    }
}