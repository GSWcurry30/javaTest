public class Test {

    public static void main(String[] args) throws IllegalAccessException,InstantiationException {

        ClassInstance classInstance = new ClassInstance(5);

        Class cl = classInstance.getClass();

        ConstructTest constructTest = new ConstructTest();
        constructTest.say();


        ClassInstance cl1 = (ClassInstance) cl.newInstance();
        cl1.setA(6);

        System.out.println(cl.getName());
        System.out.println(cl1.getA());
    }
}
