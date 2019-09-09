//一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
public class Qiu {
    public static void main(String[] args){
        double mi = 0,gao = 0;
        for(int i=0;i<10;i++){
            if(i==0)mi=100;
            else mi+=100/(Math.pow(2,i-1));
            System.out.print("第"+(i+1)+"次落地经过"+mi+"米");
            System.out.println(" 然后弹起高度"+100/(Math.pow(2,i+1))+"米");
        }

    }
}
