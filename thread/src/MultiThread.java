import test.thread.MyRunnable;
import test.thread.Thread1;

public class MultiThread {

    // WaitTest.java的源码
    class ThreadA extends Thread{

        public ThreadA(String name) {
            super(name);
        }
        @Override
        public void run() {
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " call notify()");
                // 唤醒当前的wait线程
                notify();
            }
        }
    }


    public static void main(String[] args){
        MultiThread multiThread = new MultiThread();
        ThreadA t1 = multiThread.new ThreadA("t1");

        synchronized(t1) {
            try {
                // 启动“线程t1”
                System.out.println(Thread.currentThread().getName()+" start t1");
                t1.start();

                // 主线程等待t1通过notify()唤醒。
                System.out.println(Thread.currentThread().getName()+" wait()");
                t1.wait();

                System.out.println(Thread.currentThread().getName()+" continue");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Thread t4 = new Thread1();
        Thread t2 = new Thread(new MyRunnable(5));
        t1.start();
        t2.start();
        Thread t3 = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("bbb");
            }});
        t3.start();
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10,50,100L,TimeUnit.MILLISECONDS,new LinkedBlockingDeque<Runnable>());
//        //匿名内部类，省略接口实现类的类名，直接重写方法。省略接口名和方法名就是lambda表达式
//        /*
//        * MyRunnable myrunnable = new MyRunnable();
//        * Thread t3 = new Thread(myrunnable);
//        * t3.start();
//        */
//
        new Runnable(){
            @Override
            public void run() {
                System.out.println("aaa");
            }
        }.run();
//
//        ((Runnable) () -> System.out.println("aaa")).run();
//
//        Future<String> future = threadPoolExecutor.submit((Callable)()->{
//            System.out.println("hello");
//            return "hello";
//        });
    }
}
