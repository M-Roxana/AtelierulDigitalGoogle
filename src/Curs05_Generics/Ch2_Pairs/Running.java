package Curs05_Generics.Ch2_Pairs;

public class Running implements Shoe{

   private int size;
   private String color;

   public Running (String color, int size){
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
