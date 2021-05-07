package Zadacha2;

public class Orc implements Playable{
    public static void main(String[] args) {
        Orc orc = new Orc();
      //  orc.move();
        System.out.println(orc.move());
        System.out.println(orc.attack());
        System.out.println(orc.defence());

    }

    public String move() {
        return "run";
    }

    public String attack() {
        return "ax blow";
    }

    public String defence() {
        return "block";
    }
}
