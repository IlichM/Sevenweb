package Webinar;

import java.util.ArrayList;
import java.util.List;

public class Sedan extends Car {
    Luggage luggage = new Luggage();
    public Sedan(String brand, int horsePower, boolean isAwd, float accelertion) {
        super(brand, horsePower, isAwd, accelertion);
    }

    @Override
    void start() {
        System.out.println("Sedan started");
    }

    static class Luggage{
        List<Object> items;

        public Luggage() {
            this.items = new ArrayList<>();
        }
        void addItem(Object item){
            items.add(item);
        }

        Object addItem(int i){
            return items.get(i);
        }

    }

}
