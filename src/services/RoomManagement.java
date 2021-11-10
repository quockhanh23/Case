package services;

import models.Room;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomManagement implements Management<Room>, Serializable {
    private List<Room> roomList = new ArrayList<>();

    public RoomManagement(List<Room> roomList) {
        this.roomList = roomList;
    }

    public RoomManagement() {
        roomList = new ArrayList<>();
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    @Override
    public void add(Room room) {
        roomList.add(room);

    }

    @Override
    public void edit(int id, Room room) {
        int index = findIndexById(id);
        roomList.set(index, room);
        Notifications.alertSuccess();

    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        roomList.remove(index);
        Notifications.alertSuccess();
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getRoomId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void printList() {
        Notifications.titleRoomFormat();
        for (Room room : roomList) {
            System.out.println(room);
        }
    }

    public boolean booleanCheckRoomById(int id) {
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getRoomId() == id) {
                return true;
            }
        }
        return false;
    }

    public int findRoomByPrice(int price) {
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getPrice() == price) {
                return i;
            }
        }
        return -1;
    }

    public void findRoomByPrice3(int price) {
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getPrice() == price) {
                System.out.println(roomList.get(i));
            }
        }
    }

    public void findRoomById2(int id) {
        int index = findIndexById(id);
        if (index != -1) {
            System.out.println(roomList.get(index));
        } else {
            Notifications.alertCantFind();
        }
    }

    public void checkRoomByStatus(int status) {
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getStatus() == status) {
                System.out.println(roomList.get(i));
            }
        }
    }

    public int booleanCheckRoomById2() {
        Scanner scanner = new Scanner(System.in);
        int id;
        System.out.print("Enter new ID: ");
        while (true) {
            id = scanner.nextInt();
            if (booleanCheckRoomById(id) == false && id > 0) {
                return id;
            }
            System.out.println("ID already exist. ");
            System.out.print("Enter new ID: ");
        }
    }

    public Room create() {
        int numberRoom = booleanCheckRoomById2();
        int price = FormatCreates.priceRoom();
        int status = FormatCreates.statusRoom();
        System.out.print("Bedrooms. ");
        int numberOfBedRoom = FormatCreates.inputRoomNumbersToiletAndBed();
        System.out.print("Toilets. ");
        int numberOfToiLet = FormatCreates.inputRoomNumbersToiletAndBed();
        return new Room(numberRoom, price, status, numberOfBedRoom, numberOfToiLet);
    }
}



