import java.util.Scanner;

//利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
public class ChengJi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int chenji = input.nextInt();
        String str = chenji>=90 ? "A" : (chenji>=60 ? "B" : "C");
        System.out.println(str);
    }
}
