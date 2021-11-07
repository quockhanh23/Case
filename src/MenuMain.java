import services.Intros;
import services.Titles;

import java.util.Scanner;

public class MenuMain {
    public static void showMenu() {
        int choice = -1;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                Intros.intro2();
                Titles.titleSelectManagement();
                choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> MainAdmin.showAdmin();
                    case 2 -> MainRoom.mainRoom();
                    case 3 -> MainReceipt.mainReceipt();
                    case 4 -> MenuLogIn.logIn();
                    case 0 -> {
                        Titles.titleEnding();
                        System.exit(0);
                    }
                    default -> Titles.titleDefaultSwitchCase();
                }
            } catch (Exception e) {
                Titles.titleTryCatch();
            }
        }
    }
}
