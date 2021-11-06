import models.Receipt;
import file.FireReceipt;
import services.ReceiptManagement;
import services.TitlesManagement;

import java.util.Scanner;

public class MainReceipt {
    public static void mainReceipt() {
        ReceiptManagement receiptManagement = new ReceiptManagement();
        receiptManagement.add(new Receipt(1, "Phạm Văn Lâm", "Nguyễn Quốc Khánh", "1", "2", 100));
        receiptManagement.add(new Receipt(2, "Lê Văn Luyện", "Nguyễn Quốc Khánh", "5", "6", 100));
        receiptManagement.add(new Receipt(3, "Trần Thị Kim Cương", "Nguyễn Quốc Khánh", "5", "6", 100));
        int choice = -1;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                TitlesManagement.titleReceipt();
                choice = scanner.nextInt();

            } catch (Exception e) {
                TitlesManagement.titleTryCatch();
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
                    System.out.println("___________________________________");
                    receiptManagement.getTotalMoney();
                    break;
                case 7:
                    MenuMain.showMenu();
                    break;
                case 0:
                    System.out.println("You just chose number: " + choice + " --> Ending!...");
                    System.exit(0);
                    break;
                default:
                    TitlesManagement.titleDefault();
                    break;
            }
        }
    }
}
