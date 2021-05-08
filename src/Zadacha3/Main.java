package Zadacha3;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.beEaten();
        cat.move();
        System.out.println("");
        Dog dog = new Dog();
        dog.eat();
        dog.move();
    }
}
