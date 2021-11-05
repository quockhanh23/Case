package models;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String str = "12";
        String regex = "\\d{0,9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        boolean match = matcher.matches();
        System.out.println("Match = " + match);
    }


}
