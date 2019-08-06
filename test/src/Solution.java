/**
 *
 */
public class Solution {
    public static int myAtoi(String str) {
        if(str==null){
            return 0;
        }
        str=str.trim();
        if(str.isEmpty()){
            return 0;
        }
        String res = null;
        if(isNumber(str.charAt(0)) || str.charAt(0)=='-' || str.charAt(0)=='+'){
            res = str.substring(0,1);
            for(int i=1;i<str.length();i++){
                if(isNumber(str.charAt(i))){
                    res=str.substring(0,i+1);
                }else{
                    break;
                }
            }
        }
        if(res==null || res.equals("+") || res.equals("-")){
            return 0;
        }
        int recv = 0;
        int pop = 0;
        if(res.charAt(0)=='-'){
            res=res.substring(1,res.length());
            for(int i=0;i<res.length();i++){
                char ch = str.charAt(i);
                pop = -(str.charAt(i)-'0');
                if(recv<Integer.MIN_VALUE/10||(recv==Integer.MIN_VALUE/10 && pop<-8)){
                    return Integer.MIN_VALUE;
                }
                recv=recv*10+pop;
            }
        }else{
            int start = (res.charAt(0)=='+')?1:0;
            res=res.substring(start,res.length());
            for(int i=0;i<res.length();i++){
                pop=str.charAt(i)-'0';
                if(recv>Integer.MAX_VALUE/10||(recv==Integer.MAX_VALUE/10 && pop>7)){
                    return Integer.MAX_VALUE;
                }
                recv=recv*10+pop;
            }
        }
        return recv;
    }

    public static boolean isNumber(char ch){
        if(ch>'0' && ch<'9'){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        String test = "  -42";
        int res = myAtoi(test);
        System.out.println(res);

        Class c = test.getClass();
        c.getAnnotatedInterfaces();

    }
}
