package Curs02_OO.Ch3_AnimalHierarchy;

public abstract class Animal {

    protected int legs;
    protected Animal( int legs){
        this.legs = legs;
    }

    abstract public void eat();
    public void walk() {
        System.out.println("Animalul merge cu cele " + legs + " picioare");
    }
}
