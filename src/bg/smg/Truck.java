package bg.smg;

public class Truck extends Vehicle  {

    private int weight;

    @Override
    public void drive(double speed) {
        System.out.println("We are driving " + toString() + " with speed " + speed);
    }

//    @Override
//    public int compareTo(Truck t) {
//        if(this.getWeight()>t.getWeight())
//            return 1;
//        else if(this.getWeight()<t.getWeight())
//            return -1;
//        else
//            return 0;
//    }

//    @Override
//    public int compareTo(Truck t) {
//        return this.toString().compareTo(t.toString());
//    }

    @Override
    public String toString() {
        return "Truck{" +
                super.toString() +
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
