package Tsss.Bum;

import java.util.ArrayList;
import java.util.Scanner;


public class MenuUser {

    static void menuUser(ArrayList<Dish> dishes) {
        RestaurantAPI.drowDish(dishes);
        Scanner scanner = new Scanner(System.in);
        String order = scanner.nextLine();
        double price = 0;
        String[] orderTab = order.split(",");
        for (int i = 0; i < orderTab.length; i++) {
           System.out.println("zamowiono: " + dishes.get(Integer.parseInt(orderTab[i])-1).getNameDish());
           price += dishes.get(Integer.parseInt(orderTab[i])-1).getPriseDish();
        }
        System.out.println("cena: " + price + " napiwek: " + RestaurantAPI.tip(price));
        System.out.println();
    }

}
