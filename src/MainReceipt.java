import models.Receipt;
import file.FireReceipt;
import services.ReceiptManagement;

import java.util.Scanner;

public class MainReceipt {
    public static void mainReceipt() {
        ReceiptManagement receiptManagement = new ReceiptManagement();
        receiptManagement.add(new Receipt(1, "2", "2", "2", " 2", 100));
        receiptManagement.add(new Receipt(2, "2", "2", "2", " 2", 100));
        receiptManagement.add(new Receipt(3, "2", "2", "2", " 2", 100));
        int choice = -1;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Wellcome to The Continental hotel!. ");

                System.out.println("Select number: ");
                System.out.println("1. Print the list receipt. ");
                System.out.println("2. Add receipt. ");
                System.out.println("3. Edit receipt. ");
                System.out.println("4. Write file. ");
                System.out.println("5. Read file. ");
                System.out.println("6. Back to main menu. ");
                System.out.println("0. End program. ");
                choice = scanner.nextInt();

            } catch (Exception e) {
                System.out.println("Wrong input!. ");
            }
            switch (choice) {
                case 1:
                    receiptManagement.printList();
                    break;
                case 2:
                    receiptManagement.add(receiptManagement.creat());
                    try {
                        FireReceipt.write2("fileReceipt.csv", receiptManagement.getReceiptList());
                        System.out.println("Receipt saved. ");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("Enter Id change: ");
                    int editInForById = scanner.nextInt();
                    receiptManagement.edit(editInForById, receiptManagement.creat());
                    try {
                        FireReceipt.write2("fileReceipt.csv", receiptManagement.getReceiptList());
                        System.out.println("Receipt saved. ");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    try {
                        FireReceipt.write2("fileReceipt.csv", receiptManagement.getReceiptList());
                        System.out.println("Receipt saved. ");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    try {
                        FireReceipt.read2("fileReceipt.csv");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    receiptManagement.getTotalMoney();
                    break;
                case 7:
                    BigMain.showMenu();
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
