package Tsss.Bum;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       // System.out.println("wybrano: " + MenuLogIn.menuLogIn());
        ArrayList<Dish> dishes = new ArrayList<>();
        dishes.add(new Dish(1,"Makaron", 20.20));
        dishes.add(new Dish(2,"Pomidorowa", 17.60));
        dishes.add(new Dish(3,"Pyry", 13.50));
        dishes.add(new Dish(4,"Kopytka", 9.90));
        dishes.add(new Dish(5,"Frytki", 9.95));
        dishes.add(new Dish(6,"Kotlet", 44.30));
        dishes.add(new Dish(7,"Kuciak", 48.45));

        MenuUser.menuUser(dishes);

    }
}
