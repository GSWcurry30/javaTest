package test.innerclass;

import java.util.ArrayList;
import java.util.Arrays;

public class test1 {

    public static void main(String[] args) {

//        OutClass outClass = new OutClass();
//        OutClass2 outClass2 = new OutClass2();
//
//        OutClass.InnerClass innerClass = outClass.new InnerClass();
//
//        innerClass.display();
//        outClass2.out();
//
//        new OutClass3(){
//            @Override
//            public void say(){
//                System.out.println("bbbbb");
//            }
//        }.say();


        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int recv = 0;
        int pop;
        while(arrayList.size()!=0){
            pop=arrayList.get(0);
            recv=recv*10+pop;
            arrayList.remove(0);
        }
        System.out.println(recv);
    }
}
