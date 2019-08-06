import com.hit.demo.InterfaceDemo;

public class Demo implements InterfaceDemo {
    @Override
    public String sayHello(String word) {
        return "Hello " + word;
    }
}
