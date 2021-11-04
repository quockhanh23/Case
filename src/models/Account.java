package models;

import java.util.Objects;
import java.util.TreeMap;

public class Account {
    private TreeMap<String, String> accountMap = new TreeMap<>();

    public Account(TreeMap<String, String> accountMap) {
        this.accountMap = accountMap;
    }

    public Account() {
        accountMap = new TreeMap<>();

    }

    public TreeMap<String, String> getAccountMap() {
        return accountMap;
    }

    public void setAccountMap(TreeMap<String, String> accountMap) {
        this.accountMap = accountMap;
    }

    public void register(String name, String password) {
        boolean check = accountMap.containsKey(name);
        if (!check) {
            accountMap.put(name, password);
            System.out.println("Successful registration. ");
        } else {
            System.out.println("Name already exists. ");
        }
    }

    public boolean login(String username, String password) {
        if (Objects.equals(accountMap.get(username), password)) {
            System.out.println("Successful login.");
            return true;
        }
        return false;
    }
}
