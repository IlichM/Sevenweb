package Webinar;

public class Car extends Transport implements Rideable, Swimmable {
    String brand;
    int horsePower;
    boolean isAwd;
    float acceleration;

    Car() {
        this("Mazda", 197, false, 10 );

    }

    public Car(String brand, int horsePower, boolean isAwd, float acceleration) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.isAwd = isAwd;
        this.acceleration = acceleration;
        this.type = "Car";
    }

    void setAcceleration(float acceleration){
        this.acceleration = acceleration;
    }

    void start(){
        System.out.println("Wrrrr");
    }

    public float countSpeed(float time){
        return (100/acceleration)*time;
    }

    @Override
    public void ride() {
        System.out.println("Riding Car " + MAX_DISTANCE);
        protectedType = "ddd";


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return brand != null ? brand.equals(car.brand) : car.brand == null;
    }

    @Override
    public int hashCode() {
        return brand != null ? brand.hashCode() : 0;
    }
}
