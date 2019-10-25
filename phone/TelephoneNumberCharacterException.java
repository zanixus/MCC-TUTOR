public class TelephoneNumberCharacterException extends Exception {
    public TelephoneNumberCharacterException() {
        super("Exception: chars in phone number!");
    }

    public TelephoneNumberCharacterException(String message) {
        super(message);
    }
}