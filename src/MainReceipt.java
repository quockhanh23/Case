import models.Receipt;
import services.FireReceipt;
import services.FireRoom2;
import services.ReceiptManagement;

import java.io.IOException;
import java.util.Scanner;

public class MainReceipt {
    public static void mainReceipt() {
        ReceiptManagement receiptManagement = new ReceiptManagement();
        receiptManagement.add(new Receipt(1, "2", "2", "2", " 2", 1));
        int choice = -1;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Main menu: ");
                System.out.println("1. Print. ");
                System.out.println("2. Add. ");
                System.out.println("3. Edit. ");
                System.out.println("4. write. ");
                System.out.println("5. read. ");
                choice = scanner.nextInt();

            } catch (Exception e) {
                System.out.println("Wrong!. ");
            }
            switch (choice) {
                case 1:
                    receiptManagement.printList();
                    break;
                case 2:
                    receiptManagement.add(receiptManagement.creat());
                    break;
                case 3:
                    break;
                case 4:
                    try {
                        FireReceipt.write2("demo3.txt", receiptManagement.getReceiptList());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    try {
                        FireReceipt.read2("demo3.txt");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("This option is not available. ");
                    System.out.println("_________________________________");
                    break;

            }
        }
    }
}
