package services;

import models.Account;
import models.Regex;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountManagement implements Management<Account>, Serializable {
    private List<Account> accountList = new ArrayList<>();

    public AccountManagement(List<Account> accountList) {
        this.accountList = accountList;
    }

    public AccountManagement() {
        accountList = new ArrayList<>();
    }

    public List<Account> getAdminList() {
        return accountList;
    }

    public void setAdminList(List<Account> accountList) {
        this.accountList = accountList;
    }

    @Override
    public void add(Account account) {
        accountList.add(account);

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
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getUseName().equals(user) && accountList.get(i).getPassWord().equals(pass)) {

                return i;
            }
        }
        return -1;
    }

    public boolean checkCreate(String user) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getUseName().equals(user)) {
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
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getUseName().equals(user) && accountList.get(i).getPassWord().equals(pass)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void printList() {
        Notifications.titleAdminFormat();
        for (Account account : accountList) {
            System.out.println(account);

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
