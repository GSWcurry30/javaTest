package SingleTon;

/**
 * @Auther: liuyi
 * @Date: 2019/7/16 14:22
 * @Description: 懒汉单利，线程安全
 */
public class SingleTon2 {

    private static SingleTon2 instance;

    private SingleTon2(){}

    public synchronized static SingleTon2 getInstance(){
        if(instance==null){
            return new SingleTon2();
        }
        return instance;
    }

}
