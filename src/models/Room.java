package models;

public class Room {
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
        return "Room{" +
                "roomId=" + roomId +
                ", price=" + price +
                ", status=" + status +
                ", NumberOfBedRoom=" + NumberOfBedRoom +
                ", NumberOfToilet=" + NumberOfToilet +
                '}';
    }
}
