import services.Intros;
import services.Notifications;

import java.util.Scanner;

public class MainMenu {
    public static void showMenu() {
        int choice;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                Intros.intro2();
                Notifications.titleSelectManagement();
                choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> MainAccount.accountMenu();
                    case 2 -> MainRoom.mainRoom();
                    case 3 -> MainReceipt.mainReceipt();
                    case 4 -> MainLogIn.MainLogIn();
                    case 0 -> {
                        Notifications.alertEnding();
                        Intros.intro3();
                        System.exit(0);
                    }
                    default -> Notifications.alertDefaultSwitchCase();
                }
            } catch (Exception e) {
                Notifications.alertTryCatch();
            }
        }
    }
}
