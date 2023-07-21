package OOP_java_sem1;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class main {
    public static void main(String[] args) {
        ArrayList <Product> my_list = new ArrayList<>();
        my_list.add(new Food("Twix", 80, 10, new GregorianCalendar(2026, 10, 15, 0, 0),80));
        my_list.add(new Food("Mars", 90, 9, new GregorianCalendar(2026, 10,0, 0, 0), 150));
        my_list.add(new Food("Snickers", 60, 15, new GregorianCalendar(2026, 10,0, 0, 0),150));
        my_list.add(new Food("Bounty", 85, 18, new GregorianCalendar(2026, 9, 13, 0, 0, 0), 120));
        my_list.add(new Beverage("Coca-Cola", 150, 7, new GregorianCalendar(2026, 3, 8, 0, 0, 0), 0.33));
        my_list.add(new Hot_beverage("Nesсafe", 150, 35, 
                    new GregorianCalendar(2024, 5, 12, 0, 0, 0), 0.33, 25));
        my_list.add(new Hot_beverage("Jacobs", 120, 3, 
                    new GregorianCalendar(2024, 6, 07, 0, 0, 0), 0.33, 20));
        my_list.add(new Hot_beverage("Bushido", 170, 12, 
                    new GregorianCalendar(2024, 03, 11, 0, 0, 0), 0.33, 25));


        Automat list = new Automat();
        list.initProduct(my_list);

        Hot_automat hot_list = new Hot_automat();
        hot_list.initProduct(my_list);

        String name = "Bushido";
        double volume = 0.33;
        int temperature = 25;
        //System.out.println(list.getProduct(name).toString());
        //System.out.println(my_list.toString());
        System.out.println(hot_list.getProduct(name,volume,temperature)); 

    }

    
}
