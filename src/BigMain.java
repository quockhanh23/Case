import java.util.Scanner;

public class BigMain {
    public static void main(String[] args) {
        showMenu();

    }

    public static void showMenu() {
        int choice = -1;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Menu: ");
                System.out.println("1. Main admin. ");
                System.out.println("2. Main room. ");
                System.out.println("3. Main receipt. ");
                System.out.println("0. Exit. ");
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
                        System.exit(0);

                }
            } catch (Exception e) {
                System.out.println("Wrong input!. ");


            }
        }
    }
}
