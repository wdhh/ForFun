package task1;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions1 {

    public static void main(String[] args) {
        String pattern = "[a-z]+";
        String text = "hello my my world";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.print(text.substring(m.start(), m.end()) + "*");

        }
    }
}