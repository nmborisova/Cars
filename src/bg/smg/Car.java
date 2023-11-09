package bg.smg;

public class Car extends Vehicle{

    private int hp;

    @Override
    public void drive(double speed) {
        System.out.println("We are driving a car " + this.toString() + " with speed " + speed);
    }

//    @Override
//    public int compareTo(Car c) {
//        if(this.getYearProduction()>c.getYearProduction())
//            return 1;
//        else if(this.getYearProduction()<c.getYearProduction())
//            return -1;
//        else
//            return 0;
//    }

//    @Override
//    public int compareTo(Car c) {
//        return this.toString().compareTo(c.toString());
//    }

    @Override
    public String toString() {
        return "Car{" +
                "make=" + getMake() + " " +
                "model=" + getModel() + " " +
                "yearProduction=" + getYearProduction() + " " +
                "hp=" + getHp() +
                '}';
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
