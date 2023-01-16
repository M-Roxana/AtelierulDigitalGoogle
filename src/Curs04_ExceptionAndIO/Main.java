package Curs04_ExceptionAndIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void readAndWrite() throws IOException {
        FileInputStream input = new FileInputStream("./src/curs04_exception_and_io/in.txt");
        FileOutputStream output = new FileOutputStream("./src/curs04_exception_and_io/out.txt", true);
        int c;
        while( (c = input.read()) != -1){
            output.write(c);
        }
    }

    public static void main(String[] args) {
        try{
            readAndWrite();
        } catch(IOException e){
            e.printStackTrace();

        }
    }
}
