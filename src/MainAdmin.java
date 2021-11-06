import models.Admin;
import services.AdminManagement;

public class MainAdmin {
    public static void admin() {
        AdminManagement adminManagement = new AdminManagement();
        adminManagement.add(new Admin("khanh", "123", "khanh", 18, 353413219, "khangaquay1@yahoo.com"));
        adminManagement.add(new Admin("khanh1", "123", "khanh", 21, 353413219, "khangaquay2@yahoo.com"));
        adminManagement.add(new Admin("khanh2", "123", "khanh", 24, 987654321, "khangaquay3@yahoo.com"));
        adminManagement.add(new Admin("khanh3", "123", "khanh", 33, 555555555, "khangaquay4@yahoo.com"));
        adminManagement.printList();
    }
}
