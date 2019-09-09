import javafx.css.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String str = "abcdefg";
        String pat = "\\Bcd.*";
        boolean bl1 = Pattern.matches(pat,str);
        System.out.println(bl1);
        System.out.println("*******************************1");

        Pattern p = Pattern.compile(pat);
        Matcher m = p.matcher(str);
        int count =0;
        while (m.find()){
            System.out.println(++count);
            System.out.println(m.start());
        }
        System.out.println("************************************2");
        String str2 = "aaaaaabbbbbbcccccc";
        String str3 = "bbbbbbcccccc";
        String pat2 = "bbbbbbcc";

        Pattern p2 = Pattern.compile(pat2);
        Matcher m2 = p2.matcher(str2);
        Matcher m3 = p2.matcher(str3);

        System.out.println(m2.lookingAt());//需要从第一个字符开始匹配
        System.out.println(m2.matches());// matches 要求整个序列都匹配
        System.out.println(m3.lookingAt());
        System.out.println(m3.matches());
        System.out.println("***********************************3");

        String pwd1 = "acv123HJK";
        String pwd2 = "acvDSC";

        String pwdpat1 = ".*[0-9].*";
        Pattern pwdp1 = Pattern.compile(pwdpat1);
        Matcher pwdm1 = pwdp1.matcher(pwd2);
        System.out.println(pwdm1.matches());
    }
}
