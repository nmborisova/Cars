package bg.smg;

public abstract class Vehicle implements Comparable<Vehicle> {

    private String make;
    private String model;
    private int yearProduction;

    abstract public void drive(double speed);

    @Override
    public int compareTo(Vehicle v) {
        if(this.getYearProduction()>v.getYearProduction())
            return 1;
        else if(this.getYearProduction()<v.getYearProduction())
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", yearProduction=" + yearProduction +
                '}';
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }
}
