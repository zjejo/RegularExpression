import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*    题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。   
    程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：   
            (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。   
            (2)如果n <> k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数你n,重复执行第一步。   
            (3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。  
            ————————————————
    版权声明：本文为CSDN博主「YaoChung」的原创文章，遵循CC 4.0 by-sa版权协议，转载请附上原文出处链接及本声明。
    原文链接：https://blog.csdn.net/YaoChung/article/details/80793691*/

public class FenJieZhi {
    public void SysoZS(int num){
        int c = 0;
        String str = num + "=";
        while(num!=c){
            c = getZS(num);
            if(c!=0&&c!=num){
                num = num/c;
                str = str + c + "*";
            }
//            str.substring(0,str.length()-1);
        }
        str = str + num;
        System.out.println(str);
    }
    //找出最小的质因数
    public int getZS(int num){
        int re = num;
        for (int i=2;i<num;i++){
            if((num%i)==0){
                re = i;
                break;
            }
        }
        return re;
    }

    //官方版
    public void getZYS(){

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=2;
        while(n>=k) {
            if (n == k) {
                System.out.println(k);
                break;
            } else if (n % k == 0) {
                System.out.println(k);
                n = n / k;
            } else {
                k++;
            }
        }
    }

    public static void main(String[] args){
//        new FenJieZhi().SysoZS(90);
        new FenJieZhi().getZYS();
    }
}
