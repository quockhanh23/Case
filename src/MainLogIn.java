import services.Notifications;

import java.util.Scanner;

public class MainLogIn {
   public static void MainLogIn() {
        MainAccount mainAccount = new MainAccount();
        int choice = -1;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                Notifications.titleLogin();
                choice = scanner.nextInt();
            } catch (Exception e) {
                Notifications.alertTryCatch();
            }
            switch (choice) {
                case 1 -> mainAccount.login();
                case 2 -> mainAccount.register();
                case 3 -> QualityRate.service();
                case 0 -> System.exit(0);
                default -> Notifications.alertDefaultSwitchCase();
            }
        }
    }

    public static void main(String[] args) {
       MainLogIn.MainLogIn();
    }
}

