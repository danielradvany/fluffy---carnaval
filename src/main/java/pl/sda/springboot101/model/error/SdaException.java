package pl.sda.springboot101.model.error;

public class SdaException extends RuntimeException {
    public SdaException(final String message) {
        super(message);
    }
}
