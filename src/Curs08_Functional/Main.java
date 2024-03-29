package Curs08_Functional;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

    String adresa = "C:\\Users\\Roxana\\IdeaProjects\\AtelierulDigitalGoogle\\src\\functional\\text.txt";
    BufferedReader reader = new BufferedReader(new FileReader(adresa));

    long count = reader
            .lines()
            .flatMap(line -> {
                return Stream.of(line.split(" "));
                //System.out.println(line);
            })
            .count();
       //System.out.println(flatMap);

    }
    }
