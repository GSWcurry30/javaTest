import java.lang.reflect.Proxy;

public class testdynamicproxy {

    public static void main(String[] args) {

        //业务实现类实例
        BookManager bookManagerImpl = new BookManagerImpl();
        //动态代理处理器类 实例
        BookManagerProxy bookManagerProxy = new BookManagerProxy(bookManagerImpl);
        //创建代理类实例
        BookManager bm = (BookManager) Proxy.newProxyInstance(bookManagerImpl.getClass().getClassLoader(),bookManagerImpl.getClass().getInterfaces(),bookManagerProxy);

        bm.printBook("testdynamicproxy");


        Class b = bookManagerImpl.getClass();
    }
}
