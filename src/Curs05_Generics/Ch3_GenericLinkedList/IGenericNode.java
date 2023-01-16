package Curs05_Generics.Ch3_GenericLinkedList;

public interface IGenericNode <T>{

   T getValue();
   void setValue( T value);
   IGenericNode<T> getNext();
   void setNext(IGenericNode<T> next);

}

