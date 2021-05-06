package Webinar;

public class Boat implements Rideable, Swimmable {

    @Override
    public void ride() {
        System.out.println("Riding Boat " + MAX_DISTANCE);

    }
}
