public enum LogLevel {
    UNKNOWN(0, "UNK"),
    TRACE(1, "TRC"),
    DEBUG(2, "DBG"),
    INFO(4, "INF"),
    WARNING(5, "WRN"),
    ERROR(6, "ERR"),
    FATAL(42, "FTL");

    private final int code;
    private final String shortCode;

    LogLevel(int code, String shortCode) {
        this.code = code;
        this.shortCode = shortCode;
    }

    public int getCode() {
        return code;
    }

    public static LogLevel fromShortCode(String shortCode) {
        for (LogLevel level : values()) {
            if (level.shortCode.equalsIgnoreCase(shortCode)) {
                return level;
            }
        }
        return UNKNOWN;
    }
}
