package generics.ch2_pairs;

public class Pair <T extends Shoe> {

    private T first;
    private T second;

    public Pair( T firstElement, T secondElement){

        first = firstElement;
        second = secondElement;
        if(first.getSize()!=second.getSize()) throw new SizeDoNotMatchException();
        if(!first.getColor().equals(second.getColor())) throw new ColorsDoNotMatchException();
    }

    public T getFirst(){
        return first;
    }

    public T getSecond(){
        return second;
    }

}
