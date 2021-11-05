package services;

import models.Room;

import java.io.*;
import java.util.List;

public class FireRoom2 {
    public static void write(String path, List<Room> list) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String str = " ID room , Price, status, Number bed, Number toilet";
        for (Room room : list) {
            str += "\n";
            str += room.getRoomId() + ",";
            str += room.getPrice() + ",";
            str += room.getStatus() + ",";
            str += room.getNumberOfBedRoom() + ",";
            str += room.getNumberOfToilet();

        }
        bufferedWriter.write(str);
        bufferedWriter.close();
        fileWriter.close();
    }

    public static List<Room> read(String patch) throws IOException {
        RoomManagement roomManagement = new RoomManagement();
        FileReader fileReader = new FileReader(patch);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.split(",");
            int id = Integer.parseInt(arr[0]);
            int price = Integer.parseInt(arr[1]);
            int status = Integer.parseInt(arr[2]);
            int bed = Integer.parseInt(arr[3]);
            int toilet = Integer.parseInt(arr[4]);
            roomManagement.add(new Room(id, price, status, bed, toilet));
        }
        roomManagement.printList();
        bufferedReader.close();
        return null;
    }

}
