package services;

public class Notifications {
    public static void titleLogin() {
        Notifications.titleUnderLine();
        Notifications.titleWellCome();
        System.out.println("Select number 1, if your already have an account: ");
        System.out.println("Select number 2, if your don't have account: ");
        System.out.println("1. Login --> (khanh - 123). ");
        System.out.println("2. Register. ");
        System.out.println("0. End program. ");
    }

    public static void titleSelectManagement() {
        Notifications.titleUnderLine();
        Notifications.titleWellCome();
        Notifications.alertBossAndSelect();
        System.out.println("1. Admin manager. ");
        System.out.println("2. Room manager. ");
        System.out.println("3. Receipt manager. ");
        System.out.println("4. Back to login. ");
        System.out.println("0. End program. ");
    }

    public static void titleRoom() {
        Notifications.titleUnderLine();
        Notifications.titleWellCome();
        Notifications.alertBossAndSelect();
        System.out.println("1. Print list of room. ");
        System.out.println("2. Add room. ");
        System.out.println("3. Edit info room. ");
        System.out.println("4. Check room. ");
        System.out.println("5. Find the room by ID. ");
        System.out.println("6. Find the room by price. ");
        System.out.println("7. write file. ");
        System.out.println("8. Print file. ");
        System.out.println("9. Delete room by ID. ");
        System.out.println("10. Back to main menu. ");
        System.out.println("0. End program. ");
    }

    public static void titleReceipt() {
        Notifications.titleUnderLine();
        Notifications.titleWellCome();
        Notifications.alertBossAndSelect();
        System.out.println("1. Print list of receipt. ");
        System.out.println("2. Add receipt. ");
        System.out.println("3. Find the receipt by ID. ");
        System.out.println("4. Edit receipt. ");
        System.out.println("5. Write file. ");
        System.out.println("6. Read file. ");
        System.out.println("7. Total money. ");
        System.out.println("8. Delete receipt by ID. ");
        System.out.println("9. Back to main menu. ");
        System.out.println("0. End program. ");
    }

    public static void titleAdmin() {
        Notifications.titleUnderLine();
        Notifications.titleWellCome();
        Notifications.alertBossAndSelect();
        System.out.println("1. Print list of admin. ");
        System.out.println("2. Add admin. ");
        System.out.println("3. Back to main menu. ");
        System.out.println("0. End program. ");
    }

    public static void alertTryCatch() {
        System.err.println("Wrong input!. ");
        Notifications.titleUnderLine();
    }

    public static void alertDefaultSwitchCase() {
        System.out.println("This option is not available. ");
        Notifications.titleUnderLine();
    }

    public static void titleAdminFormat() {
        System.out.println(String.format("%-12s%-12s%-8s%-18s%-5s",
                "User name:", "Name:", "Age:", "Phone numbers:", "Email address:"));
    }

    public static void titleRoomFormat() {
        System.out.println(String.format("%-12s%-10s%-12s%-12s%-5s",
                "Room Id:", "Price:", "Status:", "Bed Room:", "Toilet:"));
    }

    public static void titleReceiptFormat() {
        System.out.println(String.format("%-15s%-25s%-25s%-20s%-20s%-5s",
                "Receipt Id:", "Customer Name:", "Staff Name:", "Day In/month", "Day Out/month", "Total Money:"));
    }

    public static void titleWellCome() {
        System.out.println("Wellcome to The Continental hotel!. ");
    }

    public static void titleUnderLine() {
        System.out.println("___________________________________");
    }

    public static void alertEnding() {
        System.out.println("You just chose number: 0 --> Ending!...");
    }

    public static void alertSuccess() {
        System.out.println("Successfully completed. ");
    }

    public static void alertCantFind() {
        System.out.println("not found id. ");
    }

    public static void alertBossAndSelect() {
        System.out.println("My name is John Khánh Wick. Please follow me!. ");
        System.out.println("Select number: ");
    }

    public static void alertChoiceStatus() {
        System.out.println("Choice: ");
        System.out.println("Status = 1: Clear room. ");
        System.out.println("Status = 2: Ready room. ");
        System.out.println("Status = 3: Fixing room. ");
    }

    public static void alertFindId() {
        System.out.println("Enter ID to find: ");
    }

    public static void alertEditId() {
        System.out.println("Enter ID want to edit: ");
    }

    public static void alertDeleteId() {
        System.out.println("Enter ID want to delete: ");
    }

    public static void alertSaved() {
        System.out.println("Receipt saved. ");
    }
}
