package models;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static final String USER_NAME_REGEX = "^[a-z0-9]{5,}$";
    public static final String PASSWORD_REGEX = "^[\\w]{3,}";
    public static final String ROOM = "[^a-zA-Z]{1}";
    public static final String PHONE_NUMBER_REGEX = "^[\\d]{10}$";
    public static final String LICENSE_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public static boolean validate(String string, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
