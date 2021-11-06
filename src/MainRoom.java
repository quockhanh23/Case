import models.Room;

import file.FireRoom2;
import services.RoomManagement;

import java.io.IOException;
import java.util.Scanner;

public class MainRoom {
    public static void mainRoom() throws IOException {
        RoomManagement roomManagement = new RoomManagement();
        roomManagement.add(new Room(1, 100, 1, 1, 1));
        roomManagement.add(new Room(2, 100, 1, 1, 1));
        roomManagement.add(new Room(3, 100, 1, 1, 1));
        roomManagement.add(new Room(4, 100, 2, 2, 2));
        roomManagement.add(new Room(5, 100, 2, 2, 2));
        roomManagement.add(new Room(6, 200, 2, 2, 2));
        roomManagement.add(new Room(7, 200, 2, 2, 2));
        roomManagement.add(new Room(8, 200, 2, 2, 2));
        roomManagement.add(new Room(9, 500, 1, 10, 10));
        roomManagement.add(new Room(10, 500, 2, 10, 10));
        int choice = -1;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Wellcome to The Continental hotel!. ");
                System.out.println("Select number: ");
                System.out.println("1. Print list rooms. ");
                System.out.println("2. Add room. ");
                System.out.println("3. Edit room. ");
                System.out.println("4. Find the room by id room. ");
                System.out.println("5. Find the room by price. ");
                System.out.println("6. Check room. ");
                System.out.println("7. write file. ");
                System.out.println("8. Print file. ");
                System.out.println("9. Back to main menu. ");
                System.out.println("0. End program. ");
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Wrong input!. ");
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
                    FireRoom2.write("demo2.csv", roomManagement.getRoomList());
                    break;
                case 8:
                    FireRoom2.read("demo2.csv");
                    break;
                case 9:
                    BigMain.showMenu();
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
