package curs06_collections.hashmap;

import java.util.Objects;

public class Student {
    private String CNP;
    private String name;

    public Student(String CNP, String name) throws CNPSizeException {
        this.CNP = CNP;
        this.name = name;
        if(CNP.length() != 10 ){
            throw new CNPSizeException();
        }
    }

    public String getCnp() {
        return CNP;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "CNP='" + CNP + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(CNP, student.CNP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CNP);
    }

    public static class CNPSizeException extends Exception{
        public CNPSizeException(){
            super("CNP does not respect the requirements.");
        }
    }
}
