package models;

import java.io.Serializable;

public class Room implements Serializable {
    private int roomId;
    private int price;
    private int status;
    private int NumberOfBedRoom;
    private int NumberOfToilet;

    public Room(int roomId, int price, int status, int numberOfBedRoom, int numberOfToilet) {
        this.roomId = roomId;
        this.price = price;
        this.status = status;
        NumberOfBedRoom = numberOfBedRoom;
        NumberOfToilet = numberOfToilet;
    }

    public Room() {
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int isStatus() {
        return status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getNumberOfBedRoom() {
        return NumberOfBedRoom;
    }

    public void setNumberOfBedRoom(int numberOfBedRoom) {
        NumberOfBedRoom = numberOfBedRoom;
    }

    public int getNumberOfToilet() {
        return NumberOfToilet;
    }

    public void setNumberOfToilet(int numberOfToilet) {
        NumberOfToilet = numberOfToilet;
    }

    @Override
    public String toString() {
        return String.format("%-12s%-10s%-12s%-12s%-5s",
                getRoomId(), getPrice(), getStatus(), getNumberOfBedRoom(), getNumberOfToilet());
    }
}
