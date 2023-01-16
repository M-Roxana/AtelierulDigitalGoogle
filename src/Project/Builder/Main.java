package Project.Builder;

import Curs03_DesignPatterns.Ex_Builder.Computer;

public class Main {
    public static void main(String[] args) {

        CreateATshirt.Builder createMyTshirt = new CreateATshirt.Builder("Female");
        createMyTshirt
                .setSize("Small")
                .setType(Types.WithPocket)
                .setColor("Pink")
                .setPrint(true)
                .addPrint("Animal Print on the Pocket")
                .setText("Viva la vida loca");

        CreateATshirt myTshirt = createMyTshirt.build();

        System.out.println(myTshirt);

    }

}
