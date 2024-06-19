package pl.sda.springboot101.model.error;

public class SpecificSdaException extends SdaException {
    public SpecificSdaException(final String message) {
        super(message);
    }
}
