import java.util.Scanner;

//输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
public class ZifuPanDuan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char []zf = str.toCharArray();

        int zm=0,kg=0,sz=0,qt=0 ;
        for (int i=0;i<zf.length;i++){
            if(Character.isLetter(zf[i]))
                zm++;
            else if(Character.isDigit(zf[i]))
                sz++;
            else if(Character.isWhitespace(zf[i]))
                kg++;
            else
                qt++;
        }
        System.out.println("字母的个数："+zm);
        System.out.println("数字的个数："+sz);
        System.out.println("空格的个数："+kg);
        System.out.println("其它字符的个数："+qt);
    }
}
