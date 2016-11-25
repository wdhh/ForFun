/**
 * Составить регулярное выражение, является ли заданная строчка IP адресом, записанным в десятичном виде
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpAddress {
    public static void main(String[] args){
        Pattern p = Pattern.compile("((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)");
        Matcher m = p.matcher("127.0.0.1");
        boolean b = m.matches();
        System.out.print(b);
    }
}
