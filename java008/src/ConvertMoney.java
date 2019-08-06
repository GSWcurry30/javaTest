import java.text.DecimalFormat;
import java.util.Scanner;

public class ConvertMoney {

    private final static String[] STR_NUMBER = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};

    private final static String[] STR_UNIT = {"","拾","佰","仟","万","拾","佰","仟","亿","拾","佰","仟"};

    private final static String[] STR_UNIT2 = {"角","分"};

    public static void main(String[] args){

        String testnum = "3123.43";
        double t1 = Double.valueOf(testnum);
        double t2 = Double.parseDouble(testnum);

        System.out.println(t1);
        System.out.println(t2);

        System.out.println("please input a fee:");
        Scanner scan = new Scanner(System.in);
        String fee = convert(scan.nextDouble());
        System.out.println(fee);
    }

    public static String convert(Double number){
        //格式化数字,两位小数
        DecimalFormat df = new DecimalFormat("#0.##");
        String strNum = df.format(number);

        //存在小数
        if(strNum.indexOf(".") != -1){
            String num = strNum.substring(0,strNum.indexOf("."));
            if(num.length() > 12){
                System.out.println("数字超长无法转换");
                return "";
            }
        }
        String point = "";
        if(strNum.indexOf(".") == -1){
            point = "元整";
        }else{
            point = "元";
        }

        String result = getInteger(strNum) + point + getDecimal(strNum);
        return result;
    }

    /**
     * 转换整数部分
     * @param intnum
     * @return
     */
    public static String getInteger(String intnum){
        if(intnum.indexOf(".") != -1){
            intnum = intnum.substring(0,intnum.indexOf("."));
        }
        intnum = new StringBuffer(intnum).reverse().toString();
        StringBuffer temp = new StringBuffer();
        for(int i=0;i<intnum.length();i++){
            temp.append(STR_UNIT[i]);
            int index = intnum.charAt(i);
            temp.append(STR_NUMBER[index - '0']);
        }
        intnum = temp.reverse().toString();

        intnum = numReplace(intnum,"零拾","零");
        intnum = numReplace(intnum,"零佰","零");
        intnum = numReplace(intnum,"零仟","零");
        intnum = numReplace(intnum,"零万","万");
        intnum = numReplace(intnum,"零亿","亿");
        intnum = numReplace(intnum,"零零","零");
        intnum = numReplace(intnum,"亿万","亿");

        if(intnum.lastIndexOf("零") == intnum.length() - 1){
            intnum = intnum.substring(0,intnum.length() - 1);
        }
        return intnum;
    }

    /**
     * 转换小数部分
     * @param flonum
     * @return
     */
    public static String getDecimal(String flonum){
        if(flonum.indexOf(".") == -1){
            return "";
        }
        flonum = new StringBuffer(flonum).reverse().toString();
        StringBuffer temp = new StringBuffer();
        for(int i=0;i<flonum.length();i++){
            temp.append(STR_UNIT2[i]);
            temp.append(STR_NUMBER[flonum.charAt(i) - 48]);
        }
        flonum = temp.reverse().toString();

        flonum = numReplace(flonum,"零角","零");
        flonum = numReplace(flonum,"零分","零");
        flonum = numReplace(flonum,"零零","零");

        if(flonum.lastIndexOf("零") == flonum.length() - 1){
            flonum = flonum.substring(0,flonum.length() - 1);
        }
        return flonum;
    }

    /**
     *
     * @param num
     * @param oldstr
     * @param newstr
     * @return
     */
    public static String numReplace(String num,String oldstr,String newstr){
        while(true){
            if(num.indexOf(oldstr) == -1){
                break;
            }
            num = num.replaceAll(oldstr,newstr);
        }
        return num;
    }

}
