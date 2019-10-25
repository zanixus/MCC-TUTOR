public class TelephoneNumberLengthException extends Exception {
    public TelephoneNumberLengthException() {
        super("Exception: phone number not equal to 10 numbers!.");
    }

    public TelephoneNumberLengthException(String message) {
        super(message);
    }
}