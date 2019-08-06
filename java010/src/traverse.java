import java.util.Iterator;

public class traverse {

    private final String str = "poiuyttrewq*&^$";

    private final char c = '8';

    private final String str2 = "123124";

    private final int num = 455657;

    private final int[] arr = {1,3,4,5,6};

    public void traverse(){
        //字符串遍历
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
        //字符串转整数方式1
        int t = Integer.valueOf(str2);
        System.out.println(t);
        //字符/字符串转整数
        int t2 = c - '0';

        //整数转字符串
        String tempstr = String.valueOf(num);
        //字符串转字符数组
        char[] temp = str.toCharArray();
        System.out.println(temp.length);
    }



}
