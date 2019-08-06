import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Redirect {
    public static void main(String[] args){

        try {
            PrintStream out = System.out;
            PrintStream ps = new PrintStream("./log.txt");

            //输出重定向到log文件
            System.setOut(ps);
            int value = 18;
            System.out.println("初始化成功,value = " + value);
            int type = 1;
            System.out.println("类型: " + type);
            System.out.println("处理结果:" + "value = " + value + " type = " + type);

            //返回标准输出流
            System.setOut(out);
            System.out.println("执行结束，查看日志文件");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
