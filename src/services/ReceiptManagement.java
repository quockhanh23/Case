package services;

import models.Receipt;
import models.Room;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ReceiptManagement implements Management<Receipt> {
    List<Receipt> receiptList = new ArrayList<>();

    public ReceiptManagement(List<Receipt> receiptList) {
        this.receiptList = receiptList;
    }

    public ReceiptManagement() {
        receiptList = new ArrayList<>();
    }

    public List<Receipt> getReceiptList() {
        return receiptList;
    }

    public void setReceiptList(List<Receipt> receiptList) {
        this.receiptList = receiptList;
    }

    ;


    @Override
    public void add(Receipt receipt) {
        receiptList.add(receipt);


    }

    @Override
    public void edit(int id, Receipt receipt) {
        int index = findIndexById(id);
        receiptList.set(index, receipt);

    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        receiptList.remove(index);

    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < receiptList.size(); i++) {
            if (receiptList.get(i).getReceiptId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void printList() {
        for (Receipt receipt : receiptList) {
            System.out.println(receipt);
        }

    }

    public Receipt creat() {
        Scanner scanner = new Scanner(System.in);
        String customerName = scanner.nextLine();
        String staffName = scanner.nextLine();
        String checkIn = scanner.nextLine();
        String checkOut = scanner.nextLine();
        int receiptId = scanner.nextInt();
        double receiptPrice = scanner.nextDouble();
        return new Receipt(receiptId, staffName, checkIn, checkOut, customerName, receiptPrice);
    }

    public void getMonthTotalMoney() {
        int sum = 0;
        for (int i = 0; i < receiptList.size(); i++) {
            sum++;
        }
        System.out.println(sum);
    }
}
