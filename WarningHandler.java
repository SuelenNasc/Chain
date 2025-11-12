import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class WarningHandler extends AbstractLogHandler {
    
    private static final String FILE_NAME = "warning_logs.txt";

    public WarningHandler() {
        super("WARNING");
    }

    @Override
    protected void handle(LogMessage log) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true);
             PrintWriter pw = new PrintWriter(fw)) {
            
            pw.println(log.toString());
            System.out.println("(Log WARNING escrito em " + FILE_NAME + ")");

        } catch (IOException e) {
            System.err.println("Falha ao escrever log WARNING no arquivo: " + e.getMessage());
        }
    }
}