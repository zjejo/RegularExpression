import java.util.Scanner;

//输入两个正整数m和n，求其最大公约数和最小公倍数。
public class YueBei {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int k = 2 ;
        int zdgys = 1;
        while(k<=(num1<num1?num1:num2)){
            if(num1%k==0&&num2%k==0){
                num1=num1/k;
                num2=num2/k;
                zdgys = zdgys*k;
            }else
                k++;
        }
        System.out.println("最大公约数："+zdgys);
        System.out.println("最小公倍数："+zdgys*num1*num2);
    }
}
