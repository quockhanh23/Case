import services.AccountLogIn;

import java.util.ArrayList;
import java.util.Scanner;

public class BigMain {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                int choice = -1;

                System.out.println("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
                System.out.println("000000000000000000000  00000000000000000000000000000000000  000000000000000000000000000000000000000000000000000000000");
                System.out.println("0000000000000000                                              0000000000000  0000000000000000000000000000000000000000");
                System.out.println("0000000000000000                                                 0000000   000000000000000000000000000000000000000000");
                System.out.println("000000000000000000000000000000000000000                                 000000000000000000000000000000000000000000000");
                System.out.println("000000000000000000000000000000000000000                                       000000000000000000000000000000000000000");
                System.out.println("0000000000000000000000000000000000000000000000000000000000000000000                0000000000000000000000000000000000");
                System.out.println("0000000000000000000000000000000000000000000000000000      @@     000                 00000000000000000000000000000000");
                System.out.println("0000000000000000000000000000000000000000000000000000     @@      00000                 000000000000000000000000000000");
                System.out.println("00000000000000000000000000000000000000000000000000000000000000000000000                 00000000000000000000000000000");
                System.out.println("000000000000000000000000000000000000000000000000000000000000000000000000                 0000000000000000000000000000");
                System.out.println("000000000000000000000000000000000000000000000000000000000000000000000000                  000000000000000000000000000");
                System.out.println("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
                System.out.println("___________________________________");
                System.out.println("Wellcome to The Continental hotel!. ");
                System.out.println("Select number 1, if your already have an account: ");
                System.out.println("Select number 2, if your don't have account: ");
                System.out.println("1. Login. ");
                System.out.println("2. Register. ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        accountLogIn();
                        break;
                    case 2:
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
                System.out.println("Wellcome to The Continental hotel!. ");
                System.out.println("My name is John Khánh Wick. Please follow me!. ");
                System.out.println("Select number: ");
                System.out.println("1. Admin manager. ");
                System.out.println("2. Room manager. ");
                System.out.println("3. Receipt manager. ");
                System.out.println("0. Exit. ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        break;
                    case 2:
                        MainRoom.mainRoom();
                        break;
                    case 3:
                        MainReceipt.mainReceipt();
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
                System.out.println("Wrong input!. ");

            }
        }
    }
}
