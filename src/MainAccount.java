import models.Admin;
import services.AccountManagement;
import services.FormatCreatAccount;
import services.Intros;
import services.Notifications;

import java.util.Scanner;

public class MainAccount {

    public static void account() {
        AccountManagement accountManagement = new AccountManagement();
        accountManagement.add(new Admin("khanh", "123", "khanh", 18, "353413219", "khangaquay1@yahoo.com"));
        Notifications.titleWellCome();
        System.out.println("Please Login: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String user = scanner.nextLine();
        System.out.println("Enter password: ");
        String pass = scanner.nextLine();
        boolean check = accountManagement.findUserAndPass(user, pass);
        if (check) {
            Notifications.alertSuccess();
            MainManagement.showMenu();
        } else {
            System.out.println("Wrong username or password!. ");
            System.out.println("Please log in again: ");
        }
    }

    public static void accountMenu() {
        AccountManagement accountManagement = new AccountManagement();
        accountManagement.add(new Admin("khanh", "123", "khanh", 18, "353413219", "khangaquay1@yahoo.com"));
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
                case 1 -> accountManagement.printList();
                case 2 -> {
                    accountManagement.add(creat());
                    Notifications.alertSuccess();
                }
                case 3 -> MainManagement.showMenu();
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
        String useName = FormatCreatAccount.inputClientAccount();
        String pass = FormatCreatAccount.inputClientPassword();
        System.out.print("Enter client name: ");
        String name = scanner.nextLine();
        String email = FormatCreatAccount.inputEmail();
        System.out.print("Enter client age: ");
        int age = scanner.nextInt();
        String phone = FormatCreatAccount.inputPhoneNumber();
        return new Admin(useName, pass, name, age, phone, email);
    }
}
