import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class formattime {

    public static void main(String[] args){
        Date date = new Date();
        DateFormat formater = DateFormat.getDateInstance(DateFormat.FULL,Locale.CHINA);
        String string = formater.format(date);
        System.out.println(string);
    }
}
