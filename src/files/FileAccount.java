package files;

import models.Account;
import models.Receipt;
import services.AccountManagement;

import java.io.*;
import java.util.List;

public class FileAccount {
    public static void write2(String path, List<Account> list) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String str = "Username, pass,name, age, phone, email";
        for (Account account : list) {
            str += "\n";
            str += account.getUseName() + ",";
            str += account.getPassWord() + ",";
            str += account.getName() + ",";
            str += account.getAge() + ",";
            str += account.getPhoneNumber() + ",";
            str += account.getEmail();
        }
        bufferedWriter.write(str);
        bufferedWriter.close();
        fileWriter.close();
    }

    public static List<Account> read2(String patch) throws IOException {
        AccountManagement accountManagement = new AccountManagement();
        FileReader fileReader = new FileReader(patch);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.split(",");
            String use = arr[0];
            String pass = arr[1];
            String name = arr[2];
            int age = Integer.parseInt(arr[3]);
            String phone = arr[4];
            String email = arr[5];
            accountManagement.add(new Account(use, pass, name, age, phone, email));
        }
        bufferedReader.close();
        return null;
    }
}
