import java.util.*;

public class datastructure {

    public static void main(String[] args){

        //动态数组，线程不安全
        List<Integer> list1 = new ArrayList<>(5);
        //向量，线程安全
        List<Integer> v = new Vector<>(6);
        //链表
        List<String> list2 = new LinkedList<>();
        //栈
        List<String> stack = new Stack<>();

        list2.add("asdf");
        list2.set(0,"lkj");
        String s = list2.get(0);
        list2.contains("j");
        ((LinkedList<String>) list2).remove("s");
        //队列
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(4);
        queue.offer(13);
        queue.offer(2);
        for(Integer i:queue){
            System.out.println(i);
        }
        //
        while(queue.peek() != null){
            queue.poll();
        }
    }
}
