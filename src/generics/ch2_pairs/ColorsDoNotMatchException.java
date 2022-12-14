package generics.ch2_pairs;

public class ColorsDoNotMatchException extends RuntimeException{
    public ColorsDoNotMatchException() {
        super("Colors do not match Exception");
    }
}
