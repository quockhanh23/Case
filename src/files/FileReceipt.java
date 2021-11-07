package files;

import models.Receipt;
import services.ReceiptManagement;

import java.io.*;
import java.util.List;

public class FileReceipt {
    public static void write2(String path, List<Receipt> list) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String str = "Receipt id,Customer Name,Staff Name,Check in day,Check out day,Total money (USD)";
        for (Receipt receipt : list) {
            str += "\n";
            str += receipt.getReceiptId() + ",";
            str += receipt.getCustomerName() + ",";
            str += receipt.getStaffName() + ",";
            str += receipt.getCheckIn() + ",";
            str += receipt.getCheckOut() + ",";
            str += receipt.getReceiptPrice();
        }
        bufferedWriter.write(str);
        bufferedWriter.close();
        fileWriter.close();
    }

    public static List<Receipt> read2(String patch) throws IOException {
        ReceiptManagement receiptManagement = new ReceiptManagement();
        FileReader fileReader = new FileReader(patch);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.split(",");
            int id = Integer.parseInt(arr[0]);
            String customerName = arr[1];
            String staffName = arr[2];
            String checkIn = arr[3];
            String checkOut = arr[4];
            double money = Double.parseDouble(arr[5]);
            receiptManagement.add(new Receipt(id, customerName, staffName, checkIn, checkOut, money));
        }
        receiptManagement.printList();
        bufferedReader.close();
        return null;
    }

}
