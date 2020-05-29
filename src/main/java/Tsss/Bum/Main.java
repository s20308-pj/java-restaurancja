package Tsss.Bum;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       // System.out.println("wybrano: " + MenuLogIn.menuLogIn());
        ArrayList<Dish> dishes = new ArrayList<>();
        dishes.add(new Dish(1,"Makaron", 20.20));
        dishes.add(new Dish(2,"Pomidorowa", 17.60));
        dishes.add(new Dish(3,"Pyry", 13.50));
        dishes.add(new Dish(4,"Kopytka", 9.90));
        dishes.add(new Dish(5,"Frytki", 9.90));
        dishes.add(new Dish(6,"Kotlet", 44.90));
        dishes.add(new Dish(7,"Kuciak", 48.90));

        System.out.println("0: " + dishes.get(0).getNameDish());
        MenuUser.menuUser(dishes);



    }
}
