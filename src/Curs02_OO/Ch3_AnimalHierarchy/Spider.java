package Curs02_OO.Ch3_AnimalHierarchy;

public class Spider extends Animal{

    protected Spider(){
        super(8);
    }

    public void eat(){
        System.out.println("Paianjenul mananca");
    }
}
