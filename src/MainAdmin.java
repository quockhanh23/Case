import models.Admin;
import services.AdminManagement;

public class MainAdmin {
    public static void admin() {
        AdminManagement adminManagement = new AdminManagement();
        adminManagement.add(new Admin());
    }
}
