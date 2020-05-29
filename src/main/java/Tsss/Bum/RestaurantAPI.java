package Tsss.Bum;

import java.util.ArrayList;

public class RestaurantAPI {
    static void drowDish(ArrayList<Dish> dishes) {
        System.out.println("Dzis w menu: \n");
        for (int i = 0; i < dishes.size(); i++) {
            System.out.println(i + 1 + ". " + dishes.get(i).getNameDish() + " w cenie " + dishes.get(i).getPriseDish());
        }
    }
    public static int tip(double price){
        int tip;
        if (price < 100){
            tip = (int) (price * 0.15);
        }else {
            tip = (int) (price * 0.1 );
        }

        return tip;
    }
}
