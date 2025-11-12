public class ErrorHandler extends AbstractLogHandler {

    public ErrorHandler() {
        super("ERROR");
    }

    @Override
    protected void handle(LogMessage log) {
        System.out.println("=============================================");
        System.out.println("ALERTA! SIMULANDO ENVIO DE E-MAIL (ERROR):");
        System.out.println("Para: admin@sistema.com");
        System.out.println("Assunto: Erro Crítico Detectado!");
        System.out.println("Mensagem: " + log.toString());
        System.out.println("=============================================");
    }
}