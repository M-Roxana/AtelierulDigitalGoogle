package Curs05_Generics.Ch3_GenericLinkedList;

public class GenericNode<T> implements IGenericNode<T>{

    T value  ;
    IGenericNode<T> next;

    @Override
    public T getValue( ) {
        return value ;
    }

    @Override
    public IGenericNode getNext() {
        return next;
    }

    @Override
    public void setValue(T value) {
        this.value = value;
    }
    @Override
    public void setNext(IGenericNode<T> next) {
        this.next = next;
    }
}
