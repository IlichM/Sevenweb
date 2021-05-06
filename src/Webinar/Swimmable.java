package Webinar;

public interface Swimmable {
    default void swim() {
        System.out.println("Swimming");
    }
}
