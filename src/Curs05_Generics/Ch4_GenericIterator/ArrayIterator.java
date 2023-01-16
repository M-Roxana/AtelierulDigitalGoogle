package Curs05_Generics.Ch4_GenericIterator;

import Curs05_Generics.Ch3_GenericLinkedList.IGenericList;
import Curs05_Generics.Ch3_GenericLinkedList.IGenericNode;

public class ArrayIterator<T> implements IArrayIterator<T>{

    T[] array;
    int index;

    IGenericList<T> list;
    IGenericNode node;

    public ArrayIterator(T[] array) {
        this.array = array;
        this.list = null;
        this.node = null;
        index = 0;
    }

    public ArrayIterator(IGenericList<T> list) {
        this.list = list;
        this.node = list.getRoot();
        this.array = null;
    }

    @Override
    public boolean hasNext() {
        if(this.list == null) {
            if (index >= array.length)
                return false;
            return (array[index] != null);
        }

        if (node == null) {
            return false;
        }
        return (node != null);
    }


    @Override
    public T next() {
        if(this.list == null) {
            T toReturn = array[index];
            index++;
            return toReturn;
        }
        T toReturn = (T) node.getValue();
        node = node.getNext();
        return toReturn;
    }
}
