import java.time.LocalDateTime;

public class LogMessage {
    private String nivel;
    private String mensagem;
    private LocalDateTime timestamp;

    public LogMessage(String nivel, String mensagem) {
        this.nivel = nivel;
        this.mensagem = mensagem;
        this.timestamp = LocalDateTime.now();
    }

    public String getNivel() {
        return nivel;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "[" + timestamp + "] " + nivel + ": " + mensagem;
    }
}