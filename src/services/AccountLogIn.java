package services;

import java.util.Objects;
import java.util.TreeMap;

public class AccountLogIn {
    private TreeMap<String, String> accountMap = new TreeMap<>();

    public AccountLogIn(TreeMap<String, String> accountMap) {
        this.accountMap = accountMap;
    }

    public AccountLogIn() {
        accountMap = new TreeMap<>();
        accountMap.put("khanh1", "123");
        accountMap.put("khanh2", "123");
        accountMap.put("khanh3", "123");
        accountMap.put("khanh4", "123");

    }

    public TreeMap<String, String> getAccountMap() {
        return accountMap;
    }

    public void setAccountMap(TreeMap<String, String> accountMap) {
        this.accountMap = accountMap;
    }

    public boolean register(String name, String password) {
        boolean check = accountMap.containsKey(name);
        if (!check) {
            accountMap.put(name, password);
            System.out.println("Successful registration. ");
            return true;
        } else {
            return false;
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
