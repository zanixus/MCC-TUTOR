public class PageException extends Exception {
    public PageException(){
        super("Exception: incorrect page entered.");
    }

    public PageException(String message){
        super(message);
    }
}