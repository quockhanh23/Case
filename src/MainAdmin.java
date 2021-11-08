import models.Admin;
import models.Regex;
import services.AdminManagement;
import services.Intros;
import services.Notifications;

import java.util.Scanner;

public class MainAdmin {

    public static void account() {
        AdminManagement adminManagement = new AdminManagement();
        adminManagement.add(new Admin("khanh", "123", "khanh", 18, "353413219", "khangaquay1@yahoo.com"));
        Notifications.titleWellCome();
        System.out.println("Please Login: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String user = scanner.nextLine();
        System.out.println("Enter password: ");
        String pass = scanner.nextLine();
        boolean check = adminManagement.findUserAndPass(user, pass);
        if (check) {
            Notifications.alertSuccess();
            MenuMain.showMenu();
        } else {
            System.out.println("Wrong username or password!. ");
            System.out.println("Please log in again: ");
        }
    }

    public static void showAdmin() {
        AdminManagement adminManagement = new AdminManagement();
        adminManagement.add(new Admin("khanh", "123", "khanh", 18, "353413219", "khangaquay1@yahoo.com"));
        int choice = -1;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                Notifications.titleAdmin();
                choice = scanner.nextInt();
            } catch (Exception e) {
                Notifications.alertTryCatch();
            }
            switch (choice) {
                case 1 -> adminManagement.printList();
                case 2 -> {
                    adminManagement.add(creat());
                    Notifications.alertSuccess();
                }
                case 3 -> MenuMain.showMenu();
                case 0 -> {
                    Notifications.alertEnding();
                    Intros.intro3();
                    System.exit(0);
                }
                default -> Notifications.alertDefaultSwitchCase();
            }
        }
    }

    public static Admin creat() {
        Scanner scanner = new Scanner(System.in);

        String useName = inputClientAccount();
        String pass = inputClientPassword();
        System.out.print("Enter client name: ");
        String name = scanner.nextLine();
        String email = inputEmail();
        System.out.print("Enter client age: ");
        int age = scanner.nextInt();
        String phone = inputPhoneNumber();
        return new Admin(useName, pass, name, age, phone, email);
    }

    private static String inputPhoneNumber() {
        Scanner scanner = new Scanner(System.in);
        String clientPhoneNumber;
        boolean invalidPhoneNUmber;
        do {
            System.out.print("Enter client phone number: ");
            clientPhoneNumber = scanner.nextLine();
            invalidPhoneNUmber = !Regex.validate(clientPhoneNumber, Regex.PHONE_NUMBER_REGEX);
            if (invalidPhoneNUmber) System.out.println("Wrong format of phone number. ");
        } while (invalidPhoneNUmber);
        return clientPhoneNumber;
    }

    public static String inputClientAccount() {
        Scanner scanner = new Scanner(System.in);
        String clientAccount;
        boolean invalidAccount;
        do {
            System.out.print("Enter new account: ");
            clientAccount = scanner.nextLine();
            invalidAccount = !Regex.validate(clientAccount, Regex.USER_NAME_REGEX);
            if (invalidAccount) System.out.println("Wrong format of account. ");
        } while (invalidAccount);
        return clientAccount;
    }

    public static String inputClientPassword() {
        Scanner scanner = new Scanner(System.in);
        String clientPassword;
        boolean invalidPassword;
        do {
            System.out.print("Enter client password: ");
            clientPassword = scanner.nextLine();
            invalidPassword = !Regex.validate(clientPassword, Regex.PASSWORD_REGEX);
            if (invalidPassword) System.out.println("Wrong format of password. ");
        } while (invalidPassword);
        return clientPassword;
    }

    public static String inputEmail() {
        Scanner scanner = new Scanner(System.in);
        String clientEmail;
        boolean invalidEmail;
        do {
            System.out.print("Enter client email: ");
            clientEmail = scanner.nextLine();
            invalidEmail = !Regex.validate(clientEmail, Regex.LICENSE_REGEX);
            if (invalidEmail) System.out.println("Wrong format of email. ");
        } while (invalidEmail);
        return clientEmail;
    }
}
