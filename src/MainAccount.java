import files.FileAccount;
import models.Account;
import services.AccountManagement;
import services.Intros;
import services.Notifications;

import java.util.Scanner;

public class MainAccount {
    private static AccountManagement clientService;

    public MainAccount() {
        clientService = AccountManagement.getInstance();
    }

    public AccountManagement getClientService() {
        return clientService;
    }

    public void setClientService(AccountManagement clientService) {
        this.clientService = clientService;
    }

    public static void login() {
        System.out.println("Please Login: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String user = scanner.nextLine();
        System.out.println("Enter password: ");
        String pass = scanner.nextLine();
        boolean check = clientService.findUserAndPass(user, pass);
        if (check) {
            Notifications.alertSuccess();
            MainMenu.showMenu();
        } else {
            System.out.println("Wrong username or password!. ");
            System.out.println("Please log in again: ");
        }
    }

    public void register() {
        Account client = AccountManagement.create();
        clientService.add(client);
    }

    public void displayAllClient() {
        clientService.printList();
    }

    public static void accountMenu() {
        AccountManagement accountManagement = new AccountManagement();

        int choice = -1;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                Notifications.titleAdmin();
                choice = scanner.nextInt();
            } catch (Exception e) {
                Notifications.alertTryCatch();
            }
            switch (choice) {
                case 1 -> accountManagement.printList();
                case 2 -> {
                    accountManagement.add(accountManagement.create());
                    try {
                        FileAccount.writeAccount("account.csv", accountManagement.getClients());
                        Notifications.alertSuccess();
                        Notifications.alertSaved();
                    } catch (Exception e) {
                        Notifications.alertTryCatch();
                    }
                }
                case 3 -> MainMenu.showMenu();
                case 0 -> {
                    Notifications.alertEnding();
                    Intros.intro3();
                    System.exit(0);
                }
                default -> Notifications.alertDefaultSwitchCase();
            }
        }
    }
}


