package java_interpreter;

abstract class AbstractAccount {
    private Logger logger = Logger.info();
    
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
    
    // o logger é delegado ao seu Implementador
    protected void operate(String message, boolean result) {
        logger.log(message + " result " + result);
    }
}