public class Main {
    
    private static LogHandler construirCadeia() {
        LogHandler debug = new DebugHandler();
        LogHandler info = new InfoHandler();
        LogHandler warning = new WarningHandler();
        LogHandler error = new ErrorHandler();

        debug.setNext(info);
        info.setNext(warning);
        warning.setNext(error);

        return debug;
    }

    public static void main(String[] args) {
        LogHandler logger = construirCadeia();

        System.out.println("Enviando logs para a cadeia...\n");

        logger.processarLog(new LogMessage("INFO", "O sistema foi iniciado."));
        logger.processarLog(new LogMessage("DEBUG", "Conexão com o banco de dados estabelecida."));
        logger.processarLog(new LogMessage("ERROR", "Falha fatal! Não foi possível carregar o módulo A."));
        logger.processarLog(new LogMessage("WARNING", "O disco está com 85% de capacidade."));
        logger.processarLog(new LogMessage("INFO", "Usuário 'admin' logado com sucesso."));
        logger.processarLog(new LogMessage("FATAL", "O sistema explodiu."));

        if (logger instanceof DebugHandler) {
            InfoHandler infoHandler = (InfoHandler) ((AbstractLogHandler) logger).nextHandler;
            infoHandler.imprimirLogsInfo();
        }
    }
}