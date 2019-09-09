public class DaXiaoXie {
    public String toLowerCase(String str) {
        String result = str;
        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            char C = c;
            if(c>='A'&&c<='Z'){
                C = (char)(c+32);
                System.out.println(C);
            }
            result = result.replace(c,C);
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(new DaXiaoXie().toLowerCase("Hello"));
    }
}
