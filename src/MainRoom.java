import models.Room;

import files.FileRoom2;
import services.Intros;
import services.RoomManagement;
import services.Notifications;

import java.io.IOException;
import java.util.Scanner;

public class MainRoom {
    public static void mainRoom() throws IOException {
        RoomManagement roomManagement = new RoomManagement();
        roomManagement.add(new Room(1, 100, 1, 1, 1));
        roomManagement.add(new Room(2, 100, 1, 1, 1));
        roomManagement.add(new Room(3, 200, 1, 2, 2));
        roomManagement.add(new Room(4, 200, 2, 2, 2));
        roomManagement.add(new Room(5, 300, 3, 2, 2));
        roomManagement.add(new Room(6, 300, 3, 2, 2));
        roomManagement.add(new Room(7, 400, 2, 8, 8));
        roomManagement.add(new Room(8, 400, 2, 8, 8));
        roomManagement.add(new Room(9, 500, 1, 10, 10));
        roomManagement.add(new Room(10, 500, 2, 10, 10));
        int choice = -1;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                Notifications.titleRoom();
                choice = scanner.nextInt();
            } catch (Exception e) {
                Notifications.alertTryCatch();
            }
            switch (choice) {
                case 1 -> roomManagement.printList();
                case 2 -> {
                    roomManagement.add(roomManagement.create());
                    Notifications.alertSuccess();
                }
                case 3 -> {
                    Notifications.alertEditId();
                    int edit = scanner.nextInt();
                    boolean check = roomManagement.booleanCheckRoomById(edit);
                    if (check) {
                        roomManagement.edit(edit, roomManagement.create());
                    } else {
                        System.out.println("This room id does not exist. ");
                    }
                }
                case 4 -> {
                    Notifications.alertChoiceStatus();
                    int status = scanner.nextInt();
                    Notifications.titleRoomFormat();
                    roomManagement.checkRoomByStatus(status);
                }
                case 5 -> {
                    Notifications.alertFindId();
                    int find = scanner.nextInt();
                    Notifications.titleRoomFormat();
                    roomManagement.findRoomById2(find);
                }
                case 6 -> {
                    System.out.println("Enter price to find: ");
                    int price = scanner.nextInt();
                    Notifications.titleRoomFormat();
                    roomManagement.findRoomByPrice3(price);
                }
                case 7 -> {
                    FileRoom2.write("fileRoom.csv", roomManagement.getRoomList());
                    Notifications.alertSuccess();
                    Notifications.alertSaved();
                }
                case 8 -> {
                    FileRoom2.read("fileRoom.csv");
                    Notifications.alertSuccess();
                }
                case 9 -> {
                    Notifications.alertDeleteId();
                    int deleteId = scanner.nextInt();
                    roomManagement.delete2(deleteId);
                }
                case 10 -> MainMenu.showMenu();
                case 0 -> {
                    Notifications.alertEnding();
                    Intros.intro3();
                    System.exit(0);
                }
                default -> Notifications.alertDefaultSwitchCase();
            }
        }
    }
}
