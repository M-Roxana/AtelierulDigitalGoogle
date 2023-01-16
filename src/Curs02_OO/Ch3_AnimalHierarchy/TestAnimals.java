package Curs02_OO.Ch3_AnimalHierarchy;

public class TestAnimals {
    public static void main(String[] args) {

        Fish d = new Fish();
        Animal a = new Fish(); //se face upcasting automat
        Cat c = new Cat("Fluffy");
        Pet p = new Cat();
        Animal ac = new Cat();
        Animal e = new Spider();


        d.eat();
        d.walk();
        d.setName("Pestisorul de aur");
        System.out.println(d.getName());
        System.out.println();

        a.eat();
        a.walk();
        System.out.println();

        c.setName("Tommy");
        System.out.println(c.getName());
        c.eat();
        c.walk();
        c.play();
        System.out.println();

        p.setName("Jimmy");
        System.out.println(p.getName());
        p.play();
        System.out.println();

        ac.walk();
        ac.eat();
        System.out.println();

        e.eat();
        e.walk();
        System.out.println();

    }
}
