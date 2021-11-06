import services.AccountLogIn;
import services.Intros;
import services.Titles;

import java.util.Scanner;

public class BigMain {
    public static void main(String[] args) {
        AccountLogIn accountLogIn = new AccountLogIn();
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                int choice = -1;
                Intros.intro1();
                Titles.title1();
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        accountLogIn();
                        break;
                    case 2:
                        MainAdmin.creat();
                        showMenu();
                        break;
                    case 3:
                        String name = scanner.nextLine();
                        accountLogIn.find(name);
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("This option is not available. ");
                        System.out.println("___________________________________");
                        break;
                }
            } catch (Exception e) {
                System.err.println("Wrong input!. ");
                System.err.println("Please choice 1 or 2. ");
                System.out.println("___________________________________");
            }
        }
    }

    public static void accountLogIn() {
        AccountLogIn accountLogIn = new AccountLogIn();
        System.out.println("Wellcome to The Continental hotel!. ");
        System.out.println("Please Login: ");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter user name: ");
            String userName = scanner.nextLine();
            System.out.println("Enter pass word: ");
            String passWord = scanner.nextLine();
            boolean check = accountLogIn.login(userName, passWord);
            if (check) {
                showMenu();
            } else {
                System.out.println("Wrong username and password!. ");
                System.out.println("Please log in again: ");
            }
        }
    }

    public static void showMenu() {
        int choice = -1;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                Titles.title2();
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        MainAdmin.admin();
                        break;
                    case 2:
                        MainRoom.mainRoom();
                        break;
                    case 3:
                        MainReceipt.mainReceipt();
                        break;
                    case 0:
                        System.out.println("You just chose number: " + choice + " --> Ending!...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("This option is not available. ");
                        System.out.println("___________________________________");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Wrong input!. ");
            }
        }
    }
}
