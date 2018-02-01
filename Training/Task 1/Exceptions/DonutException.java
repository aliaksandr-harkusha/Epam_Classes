package test.EPAM_Task1.Exceptions;

public class DonutException extends RuntimeException {
    // Parameterless Constructor
    public DonutException() {
    }

    // Constructor that accepts a message
    public DonutException(String stringMessage) {
        super(stringMessage);
    }

    public DonutException(Throwable throwable) {
        super(throwable);
    }

    public DonutException(String stringMessage, Throwable throwable) {
        super(throwable);
    }

}
