package bg.smg;

public class Car extends Vehicle{

    @Override
    public void drive(double speed) {
        System.out.println("We are driving a car " + make + "with model " + model + " from " + yearProduction);
    }
//
//    @Override
//    public int compareTo(Car o) {
//        return 0;
//    }
}
