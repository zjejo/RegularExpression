public class ZhiShaiZi {
    public static void main(String[] args){
        System.out.println(Math.pow(30,30));
        double s = Math.pow(30,30);
        int i = (int)s;
        System.out.println(i);
    }

//    这里有 d 个一样的骰子，每个骰子上都有 f 个面，分别标号为 1, 2, ..., f。
//
//    我们约定：掷骰子的得到总点数为各骰子面朝上的数字的总和。
//
//    如果需要掷出的总点数为 target，请你计算出有多少种不同的组合情况（所有的组合情况总共有 f^d 种），模 10^9 + 7 后返回。
//
//    来源：力扣（LeetCode）
//    链接：https://leetcode-cn.com/problems/number-of-dice-rolls-with-target-sum
//    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public int numRollsToTarget(int d, int f, int target) {
        int resultNum = 0;
        int []num = new int[d];
        int count =0;
        if(target>=d&&target<=d*f){
            for (int i=0;i<d;i++){
                for (int j=0;j<f;j++){
                    num[i]=j+1;
                }
            }
        }

        return resultNum;
    }
}
