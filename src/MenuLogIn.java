import services.IntrosManagement;
import services.TitlesManagement;

import java.util.Scanner;

public class MenuLogIn {
    public static void logIn() {
        while (true) {
            try {
                int choice = -1;
                Scanner scanner = new Scanner(System.in);
                IntrosManagement.intro1();
                IntrosManagement.intro2();
                TitlesManagement.titleLogin();
                choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> MainAdmin.account();
                    case 2 -> {
                        MainAdmin.creat();
                        MenuMain.showMenu();
                    }
                    case 0 -> System.exit(0);
                    default -> TitlesManagement.titleDefault();
                }

            } catch (Exception e) {
                System.err.println("Please choice 1 or 2. ");
                TitlesManagement.titleTryCatch();
            }
        }
    }
}
