package StaticProxy;

/**
 * @Auther: liuyi
 * @Date: 2019/6/21 15:56
 * @Description:
 */
public class CountImpl implements Count {

    @Override
    public void queryCount() {
        System.out.println("query count1");
    }

    @Override
    public void updateCount() {
        System.out.println("update count1");
    }
    @Override
    public String toString(){
        return "countImpl1";
    }

    public void say1(){
        System.out.println("count1 implement");
    }
}
