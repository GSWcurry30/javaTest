public class ClassInstance {

    private int a;

    private static String str;

    public ClassInstance(){}

    public ClassInstance(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public static String getStr() {
        return str;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void setStr(String str) {
        ClassInstance.str = str;
    }
}
