import java.util.Scanner;

public class QualityRate {
    public static void service() {
        System.out.println("Service quality rating. ");
        int choice;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choice. ");
            System.out.println("1. Good service. ");
            System.out.println("2. Not good. ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Thanks for using. ");
                    MainLogIn.logIn();
                    break;
                case 2:
                    System.out.println("Shut up. ");
                    break;
            }
        }
    }
}
