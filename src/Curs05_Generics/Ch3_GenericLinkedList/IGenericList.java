package Curs05_Generics.Ch3_GenericLinkedList;

public interface IGenericList <T>{
    void insert( T element );
    void println();
    IGenericNode getRoot();
}
