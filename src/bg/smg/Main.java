package bg.smg;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];

        Truck t1 = new Truck();
        t1.setMake("Citroen");
        t1.setModel("Berlingo");
        t1.setYearProduction(2020);
        t1.setWeight(1000);
        vehicles[0]=t1;

        Truck t2 = new Truck();
        t2.setMake("Honda");
        t2.setModel("H3");
        t2.setYearProduction(2021);
        t2.setWeight(700);
        vehicles[1]=t2;

        Car c1 = new Car();
        c1.setMake("Toyota");
        c1.setModel("Yaris");
        c1.setYearProduction(2023);
        c1.setHp(110);
        vehicles[2]=c1;


        Car c2 = new Car();
        c2.setMake("WV");
        c2.setModel("Golf");
        c2.setYearProduction(2010);
        c2.setHp(140);
        vehicles[3]=c2;

        Arrays.sort(vehicles);
        for(Vehicle v : vehicles) {
            System.out.println(v.toString());
        }
    }
}
