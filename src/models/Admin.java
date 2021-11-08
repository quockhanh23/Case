package models;

public class Admin {
    private String useName;
    private String passWord;
    private String name;
    private int age;
    private String phoneNumber;
    private String email;

    public Admin(String useName, String passWord, String name, int age, String phoneNumber, String email) {
        this.useName = useName;
        this.passWord = passWord;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Admin() {
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%-12s%-12s%-8s%-18s%-5s", getUseName(), getName(), getAge(), getPhoneNumber(), getEmail());
    }
}
