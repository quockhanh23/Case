import models.Admin;
import services.AdminManagement;
import services.Titles;

import java.util.Scanner;

public class MainAdmin {

    public static void account() {
        AdminManagement adminManagement = new AdminManagement();
        adminManagement.add(new Admin("khanh", "123", "khanh", 18, 353413219, "khangaquay1@yahoo.com"));
        Titles.wellCome();
        System.out.println("Please Login: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String user = scanner.nextLine();
        System.out.println("Enter password: ");
        String pass = scanner.nextLine();
        boolean check = adminManagement.findUserAndPass(user, pass);
        if (check) {
            System.out.println("Successful login.");
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
                Titles.titleAdmin();
                choice = scanner.nextInt();
            } catch (Exception e) {
                Titles.titleTryCatch();
            }
            switch (choice) {
                case 1 -> adminManagement.printList();
                case 2 -> adminManagement.add(creat());
                case 3 -> MenuMain.showMenu();
                case 0 -> {
                    System.out.println("You just chose number: " + choice + " --> Ending!...");
                    System.exit(0);
                }
                default -> Titles.titleDefault();
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
