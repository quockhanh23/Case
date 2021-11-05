package services;

import models.Admin;

import java.util.ArrayList;
import java.util.List;

public class AdminManagement implements Management<Admin> {
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

    @Override
    public void printList() {
        for (int i = 0; i < adminList.size(); i++) {
            System.out.println(adminList.get(i));
        }

    }
}
