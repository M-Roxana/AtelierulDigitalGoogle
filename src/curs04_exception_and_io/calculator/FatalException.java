package curs04_exception_and_io.calculator;

public class FatalException extends RuntimeException{
    public FatalException(){
        super("Fatal exception");
    }
}
