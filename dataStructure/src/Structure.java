import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Structure {

    /**
     * java ADT
     * @param args
     */
    public static void main(String[] args){

        //hashset 集合，无序，基于hashmap实现
        Set<String> hashset = new HashSet<String>();
        hashset.add("one");
        hashset.add("two");
        hashset.add("three");
        hashset.add("four");
        hashset.add("six");
        int size = hashset.size();
        System.out.println("the size of hashset: "+size);
        for(String str:hashset){
            System.out.print(str+" ");
        }

        String str = "adsas";
        str.charAt(1);

        Map<Integer,Integer> map = new ConcurrentHashMap<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            entry.getKey();
            entry.getValue();
        }

        for(Iterator<String> iterator = hashset.iterator();iterator.hasNext();){
            System.out.print(iterator.next()+" ");
        }
        hashset.remove("one");
        //treeset集合，有序，基于红黑树实现
        Set<Integer> treeset = new TreeSet<>();
        treeset.add(4);
        treeset.add(9);
        treeset.add(7);
        for (int i:treeset
             ) {
            System.out.print(i);
        }
        Map<String,String> map1 = new ConcurrentHashMap<>();
        //linkedhashset
        Set<Integer> linkedhastset = new LinkedHashSet<>();
        linkedhastset.add(5);
        linkedhastset.add(3);

        Iterator iterator = linkedhastset.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }

        //ArrayList 动态数组
        List<String> array = new ArrayList<>();
        array.add(2,"two");
        array.add(4,"four");
        array.add("one");

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("sa","as"));

        PriorityQueue<String> priorityQueue = new PriorityQueue<>(5, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.length();
        stringBuilder.append("(");
        String s = stringBuilder.toString();

        for(int i = 0;i<array.size();i++){
            System.out.println(array.get(i));
        }

        //linkedlist 双向链表
        List<Integer> linkedlist = new LinkedList<Integer>();
        ((LinkedList<Integer>) linkedlist).addFirst(1);
        linkedlist.add(3);
        linkedlist.add(7);
        linkedlist.add(9);
        linkedlist.add(10);
        ((LinkedList<Integer>) linkedlist).addLast(5);
        ((LinkedList<Integer>) linkedlist).offer(8);
        //获取链表头，不删除
        int top = ((LinkedList<Integer>)linkedlist).peek();
        //（获取链表头并删除）
        int top1 = ((LinkedList<Integer>) linkedlist).poll();
        //进栈
        ((LinkedList<Integer>) linkedlist).push(6);
        //出栈
        Integer topvalue = ((LinkedList<Integer>) linkedlist).pop();

        //数组
        List<Integer> vector =new Vector<Integer>();
        vector.add(6);
        vector.add(0);

        //栈
        List<Integer> stack = new Stack<>();
        ((Stack<Integer>)stack).push(1);
        ((Stack<Integer>)stack).pop();

        //非阻塞队列
        Queue<Integer> queue = new ConcurrentLinkedDeque<Integer>(Collections.singleton(9));
        queue.add(1);
        queue.offer(4);

        //
        Map<String,String> map2 = new HashMap<>(2);
        for(Map.Entry<String,String> entry:map.entrySet()){

        }

        Deque<String> deque1 = new ArrayDeque<>();
        Deque<String> deque = new LinkedList<>();

        //Set
        Set<String> set = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        //阻塞队列
        Deque deque = new LinkedList();
        ArrayQueue arrayQueue = new ArrayQueue(2);
        AbstractQueue blockingDeque3 = new ArrayBlockingQueue(3);
        BlockingDeque blockingDeque1 = new LinkedBlockingDeque();
        AbstractQueue blockingDeque =  new PriorityBlockingQueue();
        AbstractQueue abstractQueue = new PriorityBlockingQueue();

                //非组赛队列
                AbstractQueue abstractQueue1 = new PriorityQueue();
                AbstractQueue abstractQueue2 = new ConcurrentLinkedQueue();

        LinkedList<String> stack1 = new LinkedList<>();
        stack1.push("as");
        stack1.size();
        int[] a = {1,2,3};
        int[] b = new int[a.length];

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(4);


        //array与list转化
        List<Integer> list = Arrays.asList(new Integer[]{1,2,3});
        Integer[] integers = list.toArray(new Integer[list.size()]);


        int[] a1 = new int[5];
        int p = a.length;
        ArrayList<Integer> arrayList = new ArrayList<Integer>(){{add(1);add(2);}};
        Integer[] integers1 = new Integer[]{2,34,4};


        Queue<Integer> queue1 = new ConcurrentLinkedQueue<>();
        queue1.offer(1);
        queue1.isEmpty();

        String str = "qw";
        str.concat(",").concat(".");

        StringBuilder sb = new StringBuilder("{");
        sb.append(",");
        sb.substring(0,1);

        Queue<Integer> queue2 = new ConcurrentLinkedQueue<>();
        queue2.offer(2);
        queue2.offer(3);
        queue2.offer(4);

        Lock lock = new ReentrantLock();

        Map<String,Integer> map1 = new HashMap<>();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });


    }
}
