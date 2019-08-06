/**
 * @Auther: liuyi
 * @Date: 2019/8/1 11:18
 * @Description:
 */
public class Test {

    public static void main(String[] args){

        String events = "481";
        String[] ids = events.split(",");
        ThreadLocal<Integer> num = new ThreadLocal<Integer>(){
            protected int initValue(){
                return 0;
            }
        };


        new Runnable(){
            int i = 0;
            @Override
            public void run() {
                i++;
                System.out.println(Thread.currentThread().getName() + i);
            }
        };

        new Thread(new Runnable() {
            int i = 0;
            @Override
            public void run() {
                i+=2;
                System.out.println(Thread.currentThread().getName() + i);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        },"t").start();

    }
}
