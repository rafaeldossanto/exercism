static class LogLine
{
    public static string Message(string logLine)
    {
        string[] logs = logLine.Split(':', 2);
        return logs.Last().Trim();
    }

    public static string LogLevel(string logLine)
    {
        string level = logLine.Split(':')[0];
        return level.Trim('[', ']').ToLower();
    }

    public static string Reformat(string logLine)
    {
        return $"{Message(logLine)} ({LogLevel(logLine)})";
    }
}
