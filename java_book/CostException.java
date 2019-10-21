public class CostException extends Exception {
    public CostException(){
        super("Exception: incorrect cost entered..");
    }

    public CostException(String message){
        super(message);
    }
}