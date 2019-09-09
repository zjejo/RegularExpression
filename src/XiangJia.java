import java.util.Scanner;

public class XiangJia {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = input.nextInt();
        int result=0;
        String str = "";
        for (int i=0;i<count;i++){
            str = str + num;
            int newInt = Integer.parseInt(str);
            result += newInt;
        }
        System.out.println(result);
    }
}
