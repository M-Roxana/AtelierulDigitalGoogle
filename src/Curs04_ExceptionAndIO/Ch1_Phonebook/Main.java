package Curs04_ExceptionAndIO.Ch1_Phonebook;

public class Main {
    public static void main(String[] args) {

    PhoneBook phoneBook = new PhoneBook("./src/curs04_exception_and_io/ch1_phonebook/input.txt");

        System.out.println("Abbey: " + phoneBook.getByName("Abbey"));
        System.out.println("Abdul: " + phoneBook.getByName("Abdul"));

}
}