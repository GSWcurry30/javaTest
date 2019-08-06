package test.innerclass;
/*
* 局部内部类，只能在外部类成员方法内实例化
*/

public class OutClass2 {

    public void out(){

        class Inner{

            public void fun(){
                System.out.println("aaaa");
            }
        }
        Inner inner = new Inner();
        inner.fun();
    }
}
