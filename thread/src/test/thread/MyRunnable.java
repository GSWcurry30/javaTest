package test.thread;

public class MyRunnable implements Runnable {

    private int i;

    public MyRunnable(int i) {
        this.i = i;
    }

    @Override
    public void run(){
        for(i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
