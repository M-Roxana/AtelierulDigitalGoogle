package generics.ch2_pairs;

public class Heels implements Shoe{

    private String color;
    int size;

    public Heels(String color, int size)
    {
        this.color = color;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getColor() {
        return color;
    }
}
