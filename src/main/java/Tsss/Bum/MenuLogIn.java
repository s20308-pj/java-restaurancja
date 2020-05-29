package Tsss.Bum;

import java.util.Scanner;

public class MenuLogIn {
    static Scanner scanner = new Scanner(System.in);
    static protected int menuLogIn() {
        int choice = 0;
        do {
            System.out.println("Logowanie: \n1. -user\n2. -admin\n");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    choice = 1;
                    break;
                case "2":
                    if (logIn()) {
                        choice = 2;
                    }
                    break;
                default:
                    System.out.println("wybierz 1 lub 2");
            }
        } while (choice != 1 && choice != 2);
        return choice;
    }

    static private boolean logIn() {
        System.out.println("podaj haslo: ");
        String input = scanner.nextLine();
        if (input.equals("admin")) {
            System.out.println("Logowanie udane");
            return true;
        } else {
            System.out.println("Logowaie nieudane");
            return false;
        }
    }
}
