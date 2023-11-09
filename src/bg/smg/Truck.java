package bg.smg;

public class Truck extends Vehicle implements Comparable<Truck> {

    private int weight;

    @Override
    public void drive(double speed) {
        System.out.println("We are driving " + this.toString() + " with speed " + speed);
    }

    @Override
    public int compareTo(Truck t) {
        if(this.getWeight()>t.getWeight())
            return 1;
        else if(this.getWeight()<t.getWeight())
            return -1;
        else
            return 0;
    }

//    @Override
//    public int compareTo(Truck t) {
//        return this.toString().compareTo(t.toString());
//    }

    @Override
    public String toString() {
        return "Truck{" +
                "make=" + getMake() + " " +
                "model=" + getModel() + " " +
                "yearProduction=" + getYearProduction() + " " +
                "weight=" + getWeight() +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
