public interface LogHandler {
    void setNext(LogHandler next);
    void processarLog(LogMessage log);
}