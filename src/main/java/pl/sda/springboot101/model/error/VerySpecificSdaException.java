package pl.sda.springboot101.model.error;

public class VerySpecificSdaException extends SpecificSdaException {
    public VerySpecificSdaException(final String message) {
        super(message);
    }
}
