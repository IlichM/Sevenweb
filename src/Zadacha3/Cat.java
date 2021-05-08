package Zadacha3;

public class Cat implements Movable, Eat, Edible {

    @Override
    public void eat() {
        System.out.println("Съем любого");

    }

    @Override
    public void beEaten() {
        System.out.println("Опасно, могут сожрать");

    }

    @Override
    public void move() {
        System.out.println("Быстрее");

    }
}
