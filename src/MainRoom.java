import models.Room;

import file.FireRoom2;
import services.RoomManagement;
import services.Titles;

import java.io.IOException;
import java.util.Scanner;

public class MainRoom {
    public static void mainRoom() throws IOException {
        RoomManagement roomManagement = new RoomManagement();
        roomManagement.add(new Room(1, 100, 1, 1, 1));
        roomManagement.add(new Room(2, 100, 1, 1, 1));
        roomManagement.add(new Room(3, 100, 1, 1, 1));
        roomManagement.add(new Room(4, 200, 2, 2, 2));
        roomManagement.add(new Room(5, 200, 3, 2, 2));
        roomManagement.add(new Room(6, 200, 3, 2, 2));
        roomManagement.add(new Room(7, 200, 2, 2, 2));
        roomManagement.add(new Room(8, 200, 2, 2, 2));
        roomManagement.add(new Room(9, 500, 1, 10, 10));
        roomManagement.add(new Room(10, 500, 2, 10, 10));
        int choice = -1;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                Titles.titleRoom();
                choice = scanner.nextInt();
            } catch (Exception e) {
                Titles.titleTryCatch();
            }
            switch (choice) {
                case 1 -> roomManagement.printList();
                case 2 -> roomManagement.add(roomManagement.creat());
                case 3 -> {
                    System.out.println("Enter id want change: ");
                    int edit = scanner.nextInt();
                    roomManagement.edit(edit, roomManagement.creat());
                }
                case 4 -> {
                    System.out.println("Choice: ");
                    System.out.println("Status = 1: Clear room. ");
                    System.out.println("Status = 2: Ready room. ");
                    System.out.println("Status = 3: Fixing room. ");
                    int status = scanner.nextInt();
                    roomManagement.checkRoomByStatus(status);
                }
                case 5 -> {
                    System.out.println("Enter id to find: ");
                    int find = scanner.nextInt();
                    roomManagement.findById2(find);
                }
                case 6 -> {
                    System.out.println("Enter price to find: ");
                    int price = scanner.nextInt();
                    roomManagement.findRoomByPrice(price);
                }
                case 7 -> FireRoom2.write("demo2.csv", roomManagement.getRoomList());
                case 8 -> FireRoom2.read("demo2.csv");
                case 9 -> MenuMain.showMenu();
                case 0 -> {
                    System.out.println("You just chose number: " + choice + " --> Ending!...");
                    System.exit(0);
                }
                default -> Titles.titleDefault();
            }
        }
    }
}
