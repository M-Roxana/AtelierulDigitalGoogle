package Curs04_ExceptionAndIO.Ex_Calculator;

public class FatalException extends RuntimeException{
    public FatalException(){
        super("Fatal exception");
    }
}
