package services;

import models.Admin;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AdminManagement implements Management<Admin>, Serializable {
    private List<Admin> adminList = new ArrayList<>();

    public AdminManagement(List<Admin> adminList) {
        this.adminList = adminList;
    }

    public AdminManagement() {
        adminList = new ArrayList<>();
    }

    public List<Admin> getAdminList() {
        return adminList;
    }

    public void setAdminList(List<Admin> adminList) {
        this.adminList = adminList;
    }

    @Override
    public void add(Admin admin) {
        adminList.add(admin);

    }

    @Override
    public void edit(int id, Admin admin) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public int findIndexById(int id) {
        return 0;
    }

    public int findUserAndPass2(String user, String pass) {
        for (int i = 0; i < adminList.size(); i++) {
            if (adminList.get(i).getUseName().equals(user) && adminList.get(i).getPassWord().equals(pass)) {

                return i;
            }
        }
        return -1;
    }

    public String findPass(String pass) {
        for (int i = 0; i < adminList.size(); i++) {
            if (adminList.get(i).getPassWord().equals(pass)) {
                return adminList.get(i).getPassWord();
            }
        }
        return null;
    }

    public String findUser(String user) {
        for (int i = 0; i < adminList.size(); i++) {
            if (adminList.get(i).getUseName().equals(user)) {
                return adminList.get(i).getUseName();
            }
        }
        return null;
    }

    public boolean findUserAndPass(String user, String pass) {
        for (int i = 0; i < adminList.size(); i++) {
            if (adminList.get(i).getUseName().equals(user) && adminList.get(i).getPassWord().equals(pass)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void printList() {
        Notifications.titleAdminFormat();
        for (Admin admin : adminList) {
            System.out.println(admin);

        }
    }
}
