package file;

import models.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FireRoom {
    public static void fireWrite(String patch, List<Room> roomList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(patch);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(roomList);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Room> readData(String patch) {
        List<Room> roomList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(patch);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            roomList = (List<Room>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        for (Room room : roomList) {
            System.out.println(room);
        }
        return null;
    }
}
