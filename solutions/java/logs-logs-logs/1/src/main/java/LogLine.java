public class LogLine {
    private final LogLevel level;
    private final String message;

    public LogLine(String logLine) {
        String code = "";
        String msg = "";
        int start = logLine.indexOf('[');
        int end = logLine.indexOf(']');
        if (start != -1 && end != -1 && end > start) {
            code = logLine.substring(start + 1, end);
        }
        int sep = logLine.indexOf("]:");
        if (sep != -1) {
            msg = logLine.substring(sep + 2).stripLeading();
        }

        switch (code) {
            case "TRC": this.level = LogLevel.TRACE; break;
            case "DBG": this.level = LogLevel.DEBUG; break;
            case "INF": this.level = LogLevel.INFO; break;
            case "WRN": this.level = LogLevel.WARNING; break;
            case "ERR": this.level = LogLevel.ERROR; break;
            case "FTL": this.level = LogLevel.FATAL; break;
            default:    this.level = LogLevel.UNKNOWN; break;
        }
        this.message = msg;
    }

    public LogLevel getLogLevel() {
        return this.level;
    }

    public String getOutputForShortLog() {
        return this.level.number() + ":" + this.message;
    }
}
