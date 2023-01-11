package curs02_oo.ex1;

import java.lang.reflect.Field;
public class Main {
    public static Integer primitive2( Integer i1) {
        i1 = 2;
        System.out.println("inside" + i1);
        return i1;
    }

    public static void primitive3( Integer i1) throws NoSuchFieldException, IllegalAccessException {
        Field field = i1.getClass().getDeclaredField(  "value" );
        field.set(i1,2);

    }

public static void main(String[] args) {
       /* try {
            new Integer(2);
            Integer p1 = 200;
            primitive3(p1);

            System.out.println(p1);
        } catch(Exception e) {
         e.printStackTrace() ;
        }
        }

        */
}
}