package SingleTon;

/**
 * @Auther: liuyi
 * @Date: 2019/7/16 20:14
 * @Description:
 */
public class SingleTon {

    private volatile static SingleTon instance;

    private SingleTon(){}

    public static SingleTon getInstance(){
        if(instance==null){
            synchronized (SingleTon.class){
                instance = new SingleTon();
            }
        }
        return instance;
    }
}
