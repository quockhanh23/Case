package models;

import java.util.Date;

public class Receipt {
    private int receiptId;
    private String customerName;
    private String staffName;
    private Date checkIn;
    private Date checkOut;
    private double receiptPrice;

    public Receipt(int receiptId, String customerName, String staffName, Date checkIn, Date checkOut, double receiptPrice) {
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

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
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
