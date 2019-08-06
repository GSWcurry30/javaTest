package StaticProxy;

/**
 * @Auther: liuyi
 * @Date: 2019/6/21 16:02
 * @Description:
 */
public class CountImpl2 implements Count {

    @Override
    public void queryCount() {
        System.out.println("query count2");
    }

    @Override
    public void updateCount() {
        System.out.println("update count2");
    }

    @Override
    public String toString(){
        return "countImpl2";
    }

    public void say2(){
        System.out.println("count2 implement");
    }
}
