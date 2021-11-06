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

    public boolean findUserAndPass(String name, String pass) {
        for (int i = 0; i < adminList.size(); i++) {
            if (adminList.get(i).getUseName().equals(name) && adminList.get(i).getPassWord().equals(pass)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void printList() {
        System.out.println(String.format("%-12s%-12s%-8s%-18s%-5s",
                "User name: ", "Name: ", "Age: ", "Phone numbers: ", "Email address: "));
        for (Admin admin : adminList) {
            System.out.println(admin);

        }
    }
}
