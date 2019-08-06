import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class BookManagerProxy implements InvocationHandler {

    /**
     *  代理对象
     */
    private Object proxyTarget;

    /**
     * 绑定业务实现类对象，返回一个动态代理对象
     * @param target
     * @return
     */
    public BookManagerProxy(Object target){
        this.proxyTarget = target;
    }

    /**
     * 包装调用方法，预处理和调用后处理
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("proxy:"+proxy.getClass().getName());
        System.out.println("method:"+method.getName());
        System.out.println("args:"+args[0].getClass().getName());

        System.out.println("pre");

        Object result = method.invoke(proxyTarget,args);

        System.out.println("post");

        return result;
    }
}
