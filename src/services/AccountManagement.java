package services;

import models.Account;
import models.Regex;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountManagement implements Management<Account>, Serializable {
    private List<Account> clients;
    private static AccountManagement instance;
    public static final String PATH_FILE_CLIENT = "DataClient.csv";

    public AccountManagement(List<Account> clients) {
        this.clients = clients;
    }

    public AccountManagement() {
        clients = new ArrayList<>();
        clients.add(new Account("khanh", "khanh", "khanh",1,"khanh", "khanh"));

    }

    public List<Account> getClients() {
        return clients;
    }

    public void setClients(List<Account> clients) {
        this.clients = clients;
    }

    public static AccountManagement getInstance() {
        if (instance == null) instance = new AccountManagement();
        return instance;

    }

    public static void setInstance(AccountManagement instance) {
        AccountManagement.instance = instance;
    }

    @Override
    public void add(Account account) {
        clients.add(account);

    }

    @Override
    public void edit(int id, Account account) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public int findIndexById(int id) {
        return 0;
    }

    public int findUserAndPass2(String user, String pass) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getUseName().equals(user) && clients.get(i).getPassWord().equals(pass)) {

                return i;
            }
        }
        return -1;
    }

    public boolean checkCreate(String user) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getUseName().equals(user)) {
                return true;
            }
        }
        return false;
    }

    public String booleanCheckCreate() {
        Scanner scanner = new Scanner(System.in);
        String user;
        while (true) {
            System.out.println("Enter username: ");
            user = scanner.nextLine();
            if (checkCreate(user) == false) {
                return user;
            }
            System.out.println("This username already exist. ");
            System.out.println("Enter username: ");
        }
    }

    public boolean findUserAndPass(String user, String pass) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getUseName().equals(user) && clients.get(i).getPassWord().equals(pass)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void printList() {
        Notifications.titleAdminFormat();
        for (Account account : clients) {
            System.out.println(account);

        }
    }
    public Account findByUsername(String username) {
        int index = -1;
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getUseName().equals(username)) {
                index = i;
            }
        }
        if (index == -1) {
            return null;
        } else {
            return clients.get(index);
        }
    }

    public static Account create() {
        int age = FormatCreates.inputClientAge();
        Scanner scanner = new Scanner(System.in);
        String useName = FormatCreates.inputClientAccount();
        String pass = FormatCreates.inputClientPassword();
        System.out.print("Enter client name: ");
        String name = scanner.nextLine();
        String email = FormatCreates.inputEmail();
        String phone = FormatCreates.inputPhoneNumber();
        return new Account(useName, pass, name, age, phone, email);
    }
}
