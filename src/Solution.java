import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 一个强密码应满足以下所有条件：

 由至少6个，至多20个字符组成。
 至少包含一个小写字母，一个大写字母，和一个数字。
 同一字符不能连续出现三次 (比如 "...aaa..." 是不允许的, 但是 "...aa...a..." 是可以的)。
 编写函数 strongPasswordChecker(s)，s 代表输入字符串，如果 s 已经符合强密码条件，则返回0；
 否则返回要将 s 修改为满足强密码条件的字符串所需要进行修改的最小步数。

 插入、删除、替换任一字符都算作一次修改。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/strong-password-checker
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/

public class Solution {
    public int strongPasswordChecker(String s) {
        int returnResult = 0;
        int length = s.length();

        //查询字符
        int zfxg_add = 0;
        int zfxg_update = 0;
        String shuzi = ".*[0-9].*";
        String daxie = ".*[A-Z].*";
        String xiaoxie = ".*[a-z].*";
        Pattern p1 = Pattern.compile(shuzi);
        Pattern p2 = Pattern.compile(daxie);
        Pattern p3 = Pattern.compile(xiaoxie);
        Matcher m1 = p1.matcher(s);
        Matcher m2 = p2.matcher(s);
        Matcher m3 = p3.matcher(s);
        int length_add = length;
        int length_update = length;
        if(!m1.matches()){
            zfxg_add++;
            length_add++;
            zfxg_update++;
            length_update=length;
        }
        if(!m2.matches()){
            zfxg_add++;
            length_add++;
            zfxg_update++;
            length_update=length;
        }
        if(!m3.matches()){
            zfxg_add++;
            length_add++;
            zfxg_update++;
            length_update=length;
        }

        //查询重复
        int returnResult1 = 0;
        for(int i=0;i<length-2;i++){
            String s1 = s.substring(i,i+1);
            String s2 = s.substring(i+1,i+2);
            String s3 = s.substring(i+2,i+3);
            if(s1.equals(s2)&&s2.equals(s3)){
                returnResult1++;
                i+=3;
                System.out.println("returnResult1:"+returnResult1);
            }
        }

        
        //查询长度
        if(length<6) {
            if(returnResult+length<6)
                returnResult = 6 - length;
        }else if(length>20) {
            returnResult = returnResult+length - 20;
        }

        if (returnResult<returnResult1)
            returnResult = returnResult1;

        return returnResult;
    }

    public static void main(String[] args){
        int result = new Solution().strongPasswordChecker("1234567890123456Baaaaa");
        System.out.println("result:"+result);
    }

}
