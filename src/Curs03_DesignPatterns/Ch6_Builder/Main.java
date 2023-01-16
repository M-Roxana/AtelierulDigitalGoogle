package Curs03_DesignPatterns.Ch6_Builder;

public class Main {
    public static void main(String[] args) {

        Person.Builder personBuilder = new Person.Builder("Roxana");
        personBuilder
                .setJob("Programmer")
                .setUniversity("Dunarea de Jos, Galati")
                .setDrivingLicense(true)
                .setIsMaried(false);

        Person person1 = personBuilder.build();

        personBuilder.setIsMaried(true);
        Person person2 = personBuilder.build();

        System.out.println(person1);
        System.out.println(person2);

        Person.Builder personBuilder1 = new Person.Builder("Alina");
        personBuilder1
                .setIsMaried(true)
                .setDrivingLicense(true);
        Person person3 = personBuilder1.build();
        System.out.println(person3);
    }
}
