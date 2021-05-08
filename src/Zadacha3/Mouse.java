package Zadacha3;

public abstract class Mouse implements Movable, Edible {

    public void beEat() {
        System.out.println("Тебя съедят");

    }

    public void move() {
        System.out.println("Двигай быстрее");

    }
}
