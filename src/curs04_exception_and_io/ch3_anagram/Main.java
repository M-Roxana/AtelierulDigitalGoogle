package curs04_exception_and_io.ch3_anagram;

import java.io.*;
import java.util.*;

    public class Main {
        public static void main(String[] args) {
            getAnagrams("./src/curs04_exception_and_io/ch3_anagram/list.txt", "listen");
        }
        public static void getAnagrams(String fromFilename, String forWord) {
            String word;
            ArrayList<String> list = new ArrayList<>();
            boolean add = true;
            try {
                FileWriter output = new FileWriter("./src/curs04_exception_and_io/ch3_anagram/output.txt", true);
                Scanner scanner = new Scanner(new BufferedReader(new FileReader(fromFilename)));

                while (scanner.hasNext()) {
                    word = scanner.next();
                    if (isAnagramFor(forWord, word) == true){
                        add = true;
                        for( String element : list){
                            if( element.equals(word)){
                                add =  false;
                                break;
                            }
                        }
                        if ( add == true) {
                            list.add(word);
                        }
                    }
                }
                output.write(String.valueOf(list));
                output.flush();
                System.out.println(list);

            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        private static boolean isAnagramFor(String word, String reference) {
            if (word.length() != reference.length())
                return false;
            char[] wordArray = word.toLowerCase().toCharArray();
            char[] referenceArray = reference.toLowerCase().toCharArray();
            Arrays.sort(wordArray);
            Arrays.sort(referenceArray);
            if (Arrays.equals(wordArray, referenceArray) == true) {
                return true;
            }
            return false;
        }
    }

