package curs04_exception_and_io.ch2_secretMessage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {

        BufferedReader reader;
        String line;
        String message = "";

        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader("./src/curs04_exception_and_io/ch2_secretMessage/input.txt")));
            while (scanner.hasNext()){
                line = scanner.next();
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (Character.isUpperCase(c)) {
                        message += c;
                    }
                }
            }
        }catch(Exception e){
            System.out.println("An error occurred.");
        }
        String finalMessage = message.replace('X', ' ');
        System.out.println("Final Message: " + finalMessage);
    }
}
