package services;

import models.Regex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FormatCreates {
    public static String inputPhoneNumber() {
        Scanner scanner = new Scanner(System.in);
        String clientPhoneNumber;
        boolean invalidPhoneNUmber;
        do {
            System.out.print("Enter client phone number: ");
            clientPhoneNumber = scanner.nextLine();
            invalidPhoneNUmber = !Regex.validate(clientPhoneNumber, Regex.PHONE_NUMBER_REGEX);
            if (invalidPhoneNUmber) System.out.println("Wrong format of phone number. ");
        } while (invalidPhoneNUmber);
        return clientPhoneNumber;
    }

    public static String inputClientAccount() {
        Scanner scanner = new Scanner(System.in);
        String clientAccount;
        boolean invalidAccount;
        do {
            System.out.print("Enter new account: ");
            clientAccount = scanner.nextLine();
            invalidAccount = !Regex.validate(clientAccount, Regex.USER_NAME_REGEX);
            if (invalidAccount) System.out.println("Wrong format of account. ");
        } while (invalidAccount);
        return clientAccount;
    }

    public static String inputClientPassword() {
        Scanner scanner = new Scanner(System.in);
        String clientPassword;
        boolean invalidPassword;
        do {
            System.out.print("Enter client password: ");
            clientPassword = scanner.nextLine();
            invalidPassword = !Regex.validate(clientPassword, Regex.PASSWORD_REGEX);
            if (invalidPassword) System.out.println("Wrong format of password. ");
        } while (invalidPassword);
        return clientPassword;
    }

    public static String inputEmail() {
        Scanner scanner = new Scanner(System.in);
        String clientEmail;
        boolean invalidEmail;
        do {
            System.out.print("Enter client email: ");
            clientEmail = scanner.nextLine();
            invalidEmail = !Regex.validate(clientEmail, Regex.LICENSE_REGEX);
            if (invalidEmail) System.out.println("Wrong format of email. ");
        } while (invalidEmail);
        return clientEmail;
    }

    public static int inputClientAge() {
        Scanner scanner = new Scanner(System.in);
        int clientAge;
        System.out.print("Enter client age: ");
        while (true) {
            clientAge = scanner.nextInt();
            if (clientAge < 18) {
                System.out.println("Under 18 years old. ");
                System.out.print("Enter client age: ");
            } else if (clientAge > 18 && clientAge < 100) {
                return clientAge;
            }
        }
    }

    public static int inputRoomNumbersToiletAndBed() {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter number of room: ");
        while (true) {
            number = scanner.nextInt();
            if (number > 0 && number < 10) {
                return number;
            }
            System.out.println("Number of rooms must be less than 10. ");
            System.out.print("Enter number of room: ");
        }
    }

    public static int statusRoom() {
        Scanner scanner = new Scanner(System.in);
        int status;
        System.out.print("Enter status: ");
        while (true) {
            status = scanner.nextInt();
            if (status > 0 && status < 4) {
                return status;
            }
            System.out.println("Number of status from 1 to 3. ");
            System.out.print("Enter status: ");
        }
    }

    public static int priceRoom() {
        Scanner scanner = new Scanner(System.in);
        int priceRoom;
        System.out.print("Enter price: ");
        while (true) {
            priceRoom = scanner.nextInt();
            if (priceRoom >= 100 && priceRoom <= 500) {
                return priceRoom;
            }
            System.out.println("Price from 100, 200, 500. ");
            System.out.print("Enter price: ");
        }
    }

    public static double totalMoney() {
        Scanner scanner = new Scanner(System.in);
        double totalMoney;
        System.out.print("Enter total money bill: ");
        while (true) {
            totalMoney = scanner.nextInt();
            if (totalMoney > 0) {
                return totalMoney;
            }
            System.out.println("Money not less than 0. ");
            System.out.print("Enter total money bill: ");
        }
    }
}

