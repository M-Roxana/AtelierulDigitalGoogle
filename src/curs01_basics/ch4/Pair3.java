package curs01_basics.ch4;

import java.util.Objects;

public class Pair3 {
    private int value1;
    private int value2;
    private int value3;

    public Pair3(int v1, int v2, int v3){
        value1 = v1;
        value2 = v2;
        value3 = v3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair3 pair = (Pair3) o;
        return value1 == pair.value1 && value2 == pair.value2 && value3 == pair.value3;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value1, value2, value3);
    }

    @Override

    public String toString(){
        return "[" + value1 + "," + value2 + ", " + value3 + "]" ;
    }

}