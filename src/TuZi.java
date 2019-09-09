//这样一个数列：1、1、2、3、5、8、13、21、34、……在数学上，斐波纳契数列以如下被以递推的方法定义：
// F(1)=1，F(2)=1, F(n)=F(n-1)+F(n-2)（n>=3，n∈N*）
public class TuZi {
    public void getMount(int m){
        int f1 = 1, f2 = 1, fn = 0;
        System.out.println(f1);
        System.out.println(f2);
        for (int i=2;i<m;i++){
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
            System.out.println(fn);
        }

    }
    public static void main(String[] args){
        new TuZi().getMount(10);
    }
}
