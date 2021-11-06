package models;

import java.io.Serializable;
import java.util.Date;

public class Receipt implements Serializable {
    private int receiptId;
    private String customerName;
    private String staffName;
    private String checkIn;
    private String checkOut;
    private double receiptPrice;

    public Receipt(int receiptId, String customerName, String staffName, String checkIn, String checkOut, double receiptPrice) {
        this.receiptId = receiptId;
        this.customerName = customerName;
        this.staffName = staffName;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.receiptPrice = receiptPrice;
    }

    public Receipt() {
    }

    public int getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(int receiptId) {
        this.receiptId = receiptId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public double getReceiptPrice() {
        return receiptPrice;
    }

    public void setReceiptPrice(double receiptPrice) {
        this.receiptPrice = receiptPrice;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "receiptId=" + receiptId +
                ", customerName='" + customerName + '\'' +
                ", staffName='" + staffName + '\'' +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                ", receiptPrice=" + receiptPrice +
                '}';
    }
}
