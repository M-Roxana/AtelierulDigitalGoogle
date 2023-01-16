package Curs05_Generics.Ch4_GenericIterator;

public interface IArrayIterator <T>{
    boolean hasNext();
    T next();
}
