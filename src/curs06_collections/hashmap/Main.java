package curs06_collections.hashmap;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Student.CNPSizeException {
        List students = new ArrayList<Student>();

        Student stud = new Student("1234567890", "Ana Maria");

        students.add(new Student("1234567890", "Ana Maria"));
        students.add(new Student("1234567895", "Andrei Popescu"));
        students.add(new Student("1234567891", "Ana Maria2"));
        students.add(stud);
        students.add(stud);
        students.add(stud);

        StudentDatabase sd = new StudentDatabase(students);

        String name = sd.findStudentName("1234567895");
        System.out.println(name);

        String name1 = sd.findStudentName("1234567890");

        System.out.println(students);

    }
}
