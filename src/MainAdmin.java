import models.Admin;
import services.AdminManagement;
import services.Intros;
import services.Notifications;

import java.util.Scanner;

public class MainAdmin {

    public static void account() {
        AdminManagement adminManagement = new AdminManagement();
        adminManagement.add(new Admin("khanh", "123", "khanh", 18, 353413219, "khangaquay1@yahoo.com"));
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
        adminManagement.add(new Admin("khanh", "123", "khanh", 18, 353413219, "khangaquay1@yahoo.com"));
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
        System.out.println("Enter new account: ");
        String useName = scanner.nextLine();
        System.out.println("Enter password: ");
        String pass = scanner.nextLine();
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        System.out.println("Enter numbers phone: ");
        int phone = scanner.nextInt();
        return new Admin(useName, pass, name, age, phone, email);
    }
}
