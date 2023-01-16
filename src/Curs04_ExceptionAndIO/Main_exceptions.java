package Curs04_ExceptionAndIO;

public class Main_exceptions {
    public int test( int i){
        try{
            System.out.println("Try");
            if(i > 2)
               throw new ClassCastException();
            System.out.println("Try 2");
            return 0;
        }catch(Exception e){
            System.out.println("catch");
            //throw e;
           return 1;
        }finally{
            System.out.println("finally");
            return 2;
        }
    }
    public static void main(String[] args) {
        System.out.println(new Main_exceptions().test(5));
    }
}
