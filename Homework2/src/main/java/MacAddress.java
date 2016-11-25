/**
 * Написать регулярное выражение определяющее является ли заданная строка правильным MAC-адресом.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MacAddress {
    public static void main(String[] args){
        Pattern p = Pattern.compile("([0-9a-fA-F]{2}([:-]|$)){6}$|([0-9a-fA-F]{4}([.]|$)){3}");
        Matcher m = p.matcher("01:32:54:67:89:AB");
        boolean b = m.matches();
        System.out.print(b);

    }

}
