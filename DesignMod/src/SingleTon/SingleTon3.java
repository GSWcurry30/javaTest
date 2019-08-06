package SingleTon;

/**
 * @Auther: liuyi
 * @Date: 2019/7/16 20:07
 * @Description: 饿汉单例，非线程安全
 */
public class SingleTon3 {

    private static SingleTon3 instance = new SingleTon3();

    private SingleTon3(){}

    public static SingleTon3 getInstance(){
        return instance;
    }
}
