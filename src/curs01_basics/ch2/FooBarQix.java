package curs01_basics.ch2;
import static java.lang.Character.getNumericValue;

public class FooBarQix {

    private static String contain (int number){
        String text = "";
        char[] digitsFromNumber = String.valueOf(number).toCharArray();
        for( char digit : digitsFromNumber ){

          if ( digit == '3' ) {
              text +=  "Foo";
          }
          if(digit == '5' ) {
              text +=  "Bar";
          }
          if(digit == '7' ) {
              text +=  "Qix";
          }
      }
            return(text);
    }

    public static void main(String[] args) {

        int nr = 21 ;
        for ( int i = 1; i <= nr; i++ ){
            String result = "";
              if(i % 3 == 0 ) {
                  result += "Foo";
              }

              if(i % 5 == 0 ) {
                  result += "Bar";
              }

              if(i % 7 == 0) {
                  result += "Qix";
              }

              result += contain(i);

              if (result.equals("") )
                  System.out.println(i);
                  else{
                System.out.println(result);
                  }
        }
    }
}
