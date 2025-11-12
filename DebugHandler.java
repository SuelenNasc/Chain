public class DebugHandler extends AbstractLogHandler {

    public DebugHandler() {
        super("DEBUG");
    }

    @Override
    protected void handle(LogMessage log) {
        System.out.println("CONSOLE (DEBUG): " + log.toString());
    }
}