public class LogLevels {

    public static String message(String line) {
        int idx = line.indexOf(':');
        if (idx < 0) {
            return line.trim();
        }
        return line.substring(idx + 1).trim();
    }

    public static String logLevel(String line) {
        int start = line.indexOf('[');
        int end = line.indexOf(']');
        if (start < 0 || end < 0 || end <= start + 1) {
            return "";
        }
        return line.substring(start + 1, end).toLowerCase();
    }

    public static String reformat(String line) {
        return message(line) + " (" + logLevel(line) + ")";
    }
}
