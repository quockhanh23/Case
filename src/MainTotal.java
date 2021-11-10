import files.FileAccount;
import services.Notifications;

public class MainTotal {
    public static void main(String[] args) {
        try {
            FileAccount.readAccount("account.csv");
        } catch (Exception e) {
            Notifications.alertTryCatch();
        }
        MainLogIn.logIn();
    }
}
