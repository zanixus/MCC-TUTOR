public class CategoryException extends Exception {
    public CategoryException(){
        super("Exception: incorrect category entered.");
    }

    public CategoryException(String message){
        super(message);
    }
}