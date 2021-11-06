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
        for (Room room : roomList) {
            System.out.println(room);
        }
    }

    public void findRoomByPrice(int price) {
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getRoomId() == price) {
                System.out.println(roomList.get(i));
            }
        }
    }

    public int checkRoomByStatus(int status) {
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getStatus() == status) {
                return i;
            }
        }
        return -1;
    }

    public void printRoomByStatus(int status) {
        for (int i = 0; i < roomList.size(); i++) {
            if (checkRoomByStatus(status) != -1) {
                System.out.println(roomList.get(i).getStatus());

            }
        }
    }

    public Room creat() {
        Scanner scanner = new Scanner(System.in);
        int numberRoom = scanner.nextInt();
        int price = scanner.nextInt();
        int status = scanner.nextInt();
        int numberOfBedRoom = scanner.nextInt();
        int numberOfToiLet = scanner.nextInt();
        return new Room(numberRoom, price, status, numberOfBedRoom, numberOfToiLet);

    }

    public int size() {
        return roomList.size();
    }
}



