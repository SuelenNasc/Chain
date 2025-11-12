import java.util.ArrayList;
import java.util.List;

public class InfoHandler extends AbstractLogHandler {

    private List<LogMessage> logsArmazenados = new ArrayList<>();

    public InfoHandler() {
        super("INFO");
    }

    @Override
    protected void handle(LogMessage log) {
        logsArmazenados.add(log);
        System.out.println("(Log INFO armazenado em memória)");
    }

    public void imprimirLogsInfo() {
        System.out.println("\n--- Logs INFO Armazenados ---");
        if (logsArmazenados.isEmpty()) {
            System.out.println("(Nenhum log INFO recebido)");
        }
        for (LogMessage log : logsArmazenados) {
            System.out.println(log.toString());
        }
        System.out.println("------------------------------");
    }
}