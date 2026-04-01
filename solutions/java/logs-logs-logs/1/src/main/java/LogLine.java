public class LogLine {
    private final LogLevel logLevel;
    private final String message;

    public LogLine(String logLine) {
        // Example: "[ERR]: Stack Overflow"
        int open = logLine.indexOf('[');
        int close = logLine.indexOf(']');
        int colon = logLine.indexOf(':');

        if (open == -1 || close == -1 || colon == -1) {
            this.logLevel = LogLevel.UNKNOWN;
            this.message = logLine;
        } else {
            String levelCode = logLine.substring(open + 1, close);
            this.logLevel = LogLevel.fromShortCode(levelCode);
            this.message = logLine.substring(colon + 1).trim();
        }
    }

    public LogLevel getLogLevel() {
        return logLevel;

    }

    public String getOutputForShortLog() {
        return logLevel.getCode() + ":" + message;
    }
}
