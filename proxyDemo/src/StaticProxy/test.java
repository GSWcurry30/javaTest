package StaticProxy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

/**
 * @Auther: liuyi
 * @Date: 2019/6/21 16:09
 * @Description:
 */
public class test {

    public static void main(String[] args) throws ParseException {


        int[] a = {2,4,1,3,5};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }

        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList());
        arrayList.sort((o1, o2) -> {
            if(o1>o2){
                return 1;
            }else if(o1<o2){
                return -1;
            }
            return 0;
        });

        String str="2";
        int a3 = str.charAt(0)-'0';



        CountProxy countProxy1 = new CountProxy(new CountImpl());
        CountProxy countProxy2 = new CountProxy(new CountImpl2());

        countProxy1.queryCount();
        countProxy1.updateCount();

        countProxy2.queryCount();
        countProxy2.updateCount();
        System.out.println();


        LocalDate now = LocalDate.now();

        LocalDate old = LocalDate.of(2019,6,1);

        Period p = Period.between(old,now);

        int diffYear = p.getYears();
        int diffMonth = p.getMonths();
        int diffDay = p.getDays();

        System.out.println("年:"+diffYear+"月:"+diffMonth+"日:"+ diffDay);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date oriDate = simpleDateFormat.parse("2019-06-01");
        System.out.println(oriDate);

        Calendar calendar = Calendar.getInstance();
        Date current = simpleDateFormat.parse("2019-07-09");
        System.out.println(current);

        long diff = (current.getTime()-oriDate.getTime())/(24*3600*1000);
        System.out.println(diff);

        calendar.setTime(oriDate);
        int count=0;
        for(long i=0;i<=diff;i++){
            count++;
            System.out.println("循环:"+count+"日期:"+ simpleDateFormat.format(calendar.getTime()));
            calendar.add(Calendar.DATE,1);
        }
    }

}
