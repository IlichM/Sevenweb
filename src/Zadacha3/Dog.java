package Zadacha3;

public class Dog implements Movable, Eat{
    @Override
    public void eat() {
        System.out.println("dog - ам ам");

    }

    @Override
    public void move() {
        System.out.println("dog - бегом");

    }
}
