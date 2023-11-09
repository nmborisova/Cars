package bg.smg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Truck[] trucks = new Truck[2];
        Truck t1 = new Truck();
        t1.setMake("Citroen");
        t1.setModel("Berlingo");
        t1.setYearProduction(2020);
        t1.setWeight(1000);
        trucks[0]=t1;

        Truck t2 = new Truck();
        t2.setMake("Honda");
        t2.setModel("H3");
        t2.setYearProduction(2021);
        t2.setWeight(1700);
        trucks[1]=t2;

        Arrays.sort(trucks);
        for(Truck t : trucks) {
            System.out.println(t.toString());
        }
    }
}
