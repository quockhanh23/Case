import models.Room;

import services.FireRoom2;
import services.RoomManagement;

import java.io.IOException;
import java.util.Scanner;

public class MainRoom {
    public static void mainRoom() throws IOException {
        RoomManagement roomManagement = new RoomManagement();
        roomManagement.add(new Room(1, 1, 1, 1, 1));
        roomManagement.add(new Room(2, 2, 1, 1, 1));
        roomManagement.add(new Room(3, 1, 1, 1, 1));
        roomManagement.add(new Room(4, 1, 2, 2, 2));
        roomManagement.add(new Room(5, 1, 2, 2, 2));
        int choice = -1;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Main menu: ");
                System.out.println("1. Print. ");
                System.out.println("2. Add. ");
                System.out.println("3. Edit. ");
                System.out.println("4. Find the room by id room. ");
                System.out.println("5. Find the room by price. ");
                System.out.println("6. Check room. ");
                System.out.println("6. write file. ");
                System.out.println("7. Print file");
                System.out.println("0. End program. ");
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Wrong!. ");
            }
            switch (choice) {
                case 1:
                    roomManagement.printList();
                    break;
                case 2:
                    roomManagement.add(roomManagement.creat());
                    break;
                case 3:
                    int edit = scanner.nextInt();
                    boolean check = (roomManagement.findIndexById(edit)) < roomManagement.size() &&
                            roomManagement.findIndexById(edit) > -1;
                    if (check) {
                        roomManagement.edit(edit, roomManagement.creat());
                    }
                    break;
                case 4:
                    int find = scanner.nextInt();
                    System.out.println(roomManagement.findIndexById(find));
                    break;
                case 5:
                    int price = scanner.nextInt();
                    roomManagement.findRoomByPrice(price);
                    break;
                case 6:
                    int status = scanner.nextInt();
                    roomManagement.printRoomByStatus(status);
                    break;
                case 7:
                    FireRoom2.write("demo2.txt", roomManagement.getRoomList());
                    break;
                case 8:
                    FireRoom2.read("demo2.txt");
                    break;
                case 0:
                    System.out.println("You just chose number: " + choice + " --> Ending!...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("This option is not available. ");
                    System.out.println("_________________________________");
                    break;
            }
        }
    }
}
