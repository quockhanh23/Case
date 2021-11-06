import services.IntrosManagement;
import services.TitlesManagement;

import java.util.Scanner;

public class MenuMain {
    public static void showMenu() {
        int choice = -1;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                IntrosManagement.intro2();
                TitlesManagement.titleSelectManagement();
                choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> MainAdmin.showAdmin();
                    case 2 -> MainRoom.mainRoom();
                    case 3 -> MainReceipt.mainReceipt();
                    case 4 -> MenuLogIn.logIn();
                    case 0 -> {
                        System.out.println("You just chose number: " + choice + " --> Ending!...");
                        System.exit(0);
                    }
                    default -> TitlesManagement.titleDefault();
                }
            } catch (Exception e) {
                TitlesManagement.titleTryCatch();
            }
        }
    }
}
