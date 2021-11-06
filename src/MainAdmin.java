import models.Admin;
import services.AdminManagement;
import services.Titles;

import java.util.Scanner;

public class MainAdmin {
    public static void admin() {
        AdminManagement adminManagement = new AdminManagement();
        adminManagement.add(new Admin("khanh", "123", "khanh", 18, 353413219, "khangaquay1@yahoo.com"));
        adminManagement.add(new Admin("khanh1", "123", "khanh", 21, 555553219, "khangaquay2@yahoo.com"));
        adminManagement.add(new Admin("khanh2", "123", "khanh", 24, 987654321, "khangaquay3@yahoo.com"));
        int choice = -1;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                Titles.titleAdmin();
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Wrong input!. ");
            }
            switch (choice) {
                case 1:
                    adminManagement.printList();
                    break;
                case 2:
                    adminManagement.add(creat());
                    break;
                case 9:
                    BigMain.showMenu();
                    break;
                default:
                    System.out.println("This option is not available. ");
                    System.out.println("___________________________________");
                    break;
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
