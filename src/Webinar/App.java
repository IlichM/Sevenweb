package Webinar;

public class App {
    public static void main(String[] args) {
        Rideable mazda = new Car("Mazda", 198, false, 10);
        Rideable boat = new Boat();
        boat.ride();
        mazda.ride();
        Transport transport = new Transport();
        transport.publicType = "Transport";
        transport.protectedType = "eee";
public class Object {

}

//        System.out.println(mazda.countSpeed(5));
//        System.out.println(mazda.type);
//        mazda.ride();
//        mazda.swim();
//        System.out.println(mazda.brand);
//        System.out.println(mazda.horsePower);
//        System.out.println(mazda.isAwd);
//        System.out.println(mazda.acceleration);

    }
}
