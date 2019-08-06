package test.thread;

public class Thread1 extends Thread {
    private int i;
    @Override
    public void run(){
        for(i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
