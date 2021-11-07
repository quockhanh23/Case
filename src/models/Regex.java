package models;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String ACCOUNT_REGEX = "^[a-z0-9]{4,}$";
    private static final String PASS_REGEX = "^[a-z0-9]{4,}$";
    private static final String PHONE_REGEX = "^[0-9]{10,}$";
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public Regex() {
    }

    public static boolean validate(String string, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
