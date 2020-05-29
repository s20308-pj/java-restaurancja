package Tsss.Bum;

import java.util.ArrayList;

public class RestaurantAPI {
    static void drowDish(ArrayList<Dish> dishes) {
        System.out.println("Dzis w menu: \n");
        for (int i = 0; i < dishes.size(); i++) {
            System.out.println(i + 1 + ". " + dishes.get(i).getNameDish() + " w cenie " + dishes.get(i).getPriseDish());
        }
    }
}
