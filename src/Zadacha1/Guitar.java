package Zadacha1;

class Guitar implements Soundable {
    public static void main(String[] args) {

        Guitar guitar = new Guitar();
        guitar.makeSound();

        Transport transport = new Transport();
        transport.makeSound();

        Cat cat = new Cat();
        cat.makeSound();
    }

    @Override
    public void makeSound() {
        System.out.println("tree struniiiii!!!");
    }
}
