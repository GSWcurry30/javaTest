import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ArrList {
    public static void main(String[] args){
        List<String> arr = new ArrayList();
        arr.add("wer");
        arr.add("abc");
        arr.add("bnm");

        System.out.println(arr.size());

        System.out.println("foreach 循环");
        //匿名内部类
        arr.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //lambda表达式
        System.out.println("lambda表达式 ");
        arr.forEach(str -> System.out.println(str));


        System.out.println("iterator 循环");
        for(Iterator it = arr.iterator();it.hasNext();){
            System.out.println(it.next());
        }

        System.out.println("for 循环");
        for(String str : arr){
            System.out.println(str);
        }
        System.out.println("index 循环");
        for(int i = 0;i < arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
