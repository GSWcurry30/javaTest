package SingleTon;

/**
 * @Auther: liuyi
 * @Date: 2019/7/16 09:52
 * @Description: 懒汉模式,线程不安全
 */
public class SingleTon1 {

    private static SingleTon1 instance;

    private SingleTon1(){}

    public static SingleTon1 getInstance(){
        if(instance == null){
            instance = new SingleTon1();
        }
        return instance;
    }

}
