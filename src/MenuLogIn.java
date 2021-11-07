import services.Intros;
import services.Titles;

import java.util.Scanner;

public class MenuLogIn {
    public static void logIn() {
        while (true) {
            try {
                int choice = -1;
                Scanner scanner = new Scanner(System.in);
                Intros.intro1();
                Intros.intro2();
                Titles.titleLogin();
                choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> MainAdmin.account();
                    case 2 -> {
                        MainAdmin.creat();
                        Titles.titleSuccess();
                        MenuMain.showMenu();
                    }
                    case 0 -> {
                        Titles.titleEnding();
                        System.exit(0);
                    }
                    default -> Titles.titleDefaultSwitchCase();
                }

            } catch (Exception e) {
                System.err.println("Please choice 1 or 2. ");
                Titles.titleTryCatch();
            }
        }
    }
}
