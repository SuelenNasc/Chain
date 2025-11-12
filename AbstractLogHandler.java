public abstract class AbstractLogHandler implements LogHandler {
    
    protected LogHandler nextHandler;
    protected String nivelResponsavel;

    public AbstractLogHandler(String nivelResponsavel) {
        this.nivelResponsavel = nivelResponsavel;
    }

    @Override
    public void setNext(LogHandler next) {
        this.nextHandler = next;
    }

    @Override
    public void processarLog(LogMessage log) {
        if (this.nivelResponsavel.equals(log.getNivel())) {
            handle(log);
        } else if (nextHandler != null) {
            nextHandler.processarLog(log);
        }
    }

    protected abstract void handle(LogMessage log);
}