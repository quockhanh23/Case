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

    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        roomList.remove(index);

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
        System.out.println("This price range is not available. ");
    }

    public void findRoomByPrice2(int price) {
        int index = findRoomByPrice(price);
        if (index != -1) {
            System.out.println(roomList.get(index));
        }
        System.out.println("This price range is not available. ");
    }

    public void findById2(int id) {
        int index = findIndexById(id);
        if (index != -1) {
            System.out.println(roomList.get(index));
        }
    }

    public void checkRoomByStatus(int status) {
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getStatus() == status) {
                System.out.println(roomList.get(i));
            }
        }
    }

    public Room creat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new Id: ");
        int numberRoom = scanner.nextInt();
        System.out.println("Enter price: ");
        int price = scanner.nextInt();
        System.out.println("Enter status: ");
        int status = scanner.nextInt();
        System.out.println("Enter bedrooms: ");
        int numberOfBedRoom = scanner.nextInt();
        System.out.println("Enter toilets: ");
        int numberOfToiLet = scanner.nextInt();
        return new Room(numberRoom, price, status, numberOfBedRoom, numberOfToiLet);
    }

    public int size() {
        return roomList.size();
    }
}



