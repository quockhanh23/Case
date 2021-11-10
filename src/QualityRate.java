import services.Notifications;

import java.util.Scanner;

public class QualityRate {
    public static void service() {
        System.out.println("Service quality rating. ");
        int choice;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Notifications.titleUnderLine();
            System.out.println("1. Good service. ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Thanks for using. ");
                    MainLogIn.MainLogIn();
                    break;
            }
        }
    }
}
