package StaticProxy;

/**
 * @Auther: liuyi
 * @Date: 2019/6/21 15:58
 * @Description:
 */
public class CountProxy {

    private Count count;

    public  CountProxy(Count count1){
        this.count = count1;
    }

    public void queryCount(){
        System.out.println(count.toString() + " before query");
        count.queryCount();
        System.out.println(count.toString() + " after query");
    }

    public void updateCount(){
        System.out.println(count.toString() + " before update");
        count.updateCount();
        System.out.println(count.toString() + " after update");
    }

}
