import models.Receipt;
import files.FileReceipt;
import services.ReceiptManagement;
import services.Titles;

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
                Titles.titleReceipt();
                choice = scanner.nextInt();
            } catch (Exception e) {
                Titles.titleTryCatch();
            }
            switch (choice) {
                case 1:
                    receiptManagement.printList();
                    break;
                case 2:
                    receiptManagement.add(receiptManagement.creat());
                    try {
                        FileReceipt.write2("fileReceipt.csv", receiptManagement.getReceiptList());
                        Titles.titleSuccess();
                        System.out.println("Receipt saved. ");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("Enter Id receipt want find: ");
                    int id = scanner.nextInt();
                    Titles.titleReceiptFormat();
                    receiptManagement.findIndexById2(id);
                    break;
                case 4:
                    System.out.println("Enter Id receipt change: ");
                    int editInForById = scanner.nextInt();
                    receiptManagement.edit(editInForById, receiptManagement.creat());
                    try {
                        FileReceipt.write2("fileReceipt.csv", receiptManagement.getReceiptList());
                        Titles.titleSuccess();
                        System.out.println("Receipt saved. ");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    try {
                        FileReceipt.write2("fileReceipt.csv", receiptManagement.getReceiptList());
                        System.out.println("Receipt saved. ");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    try {
                        FileReceipt.read2("fileReceipt.csv");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    Titles.title____();
                    receiptManagement.getTotalMoney();
                    break;
                case 8:
                    System.out.println("Enter Id receipt want delete: ");
                    int deleteById = scanner.nextInt();
                    receiptManagement.delete2(deleteById);
                    break;
                case 9:
                    MenuMain.showMenu();
                    break;
                case 0:
                    Titles.titleEnding();
                    System.exit(0);
                    break;
                default:
                    Titles.titleDefaultSwitchCase();
                    break;
            }
        }
    }
}
