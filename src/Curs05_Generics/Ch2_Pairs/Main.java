package Curs05_Generics.Ch2_Pairs;

public class Main {

    public static void main(String[] args) {
        Running runningShoe1 = new Running ("Red", 41);
        Running runningShoe2 = new Running ("Red", 42);
        Pair <Running> pairOK = new Pair<>(runningShoe1, runningShoe2 );

        //Running runningShoe1 = new Running("Red", 41);
        //Boot bootShoe = new Boot("BLACK", 41);
        //Pair <Running> pairKO = new Pair <>(runningShoe1, bootShoe);

    }
}
