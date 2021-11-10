import services.AccountManagement;
import services.Intros;
import services.Notifications;

import java.util.Scanner;

public class MainLogIn {
    public static void logIn() {
        int choice;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                Intros.intro1();
                Intros.intro2();
                Notifications.titleLogin();
                choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> MainAccount.account();
                    case 2 -> {
                        AccountManagement.create();
                        Notifications.alertSuccess();
                        System.out.println("Waiting for activation 2 days. ");
                        MainMenu.showMenu();
                    }
                    case 3 -> QualityRate.service();
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
