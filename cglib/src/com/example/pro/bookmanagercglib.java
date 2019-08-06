package com.example.pro;
import java.lang.reflect.Method;


public class bookmanagercglib implements MethodInterceptor {

    private Object target;

    public bookmanagercglib(Object target){
        this.target = target;
    }

    public Object intercept(Object obj,Method method,Object[] args,MethodProxy proxy) throws Throwable{
        System.out.println("Before:"+method);

        Object object = proxy.invokeSuper(obj,args);

        System.out.println("after:"+method);

        return object;
    }
}






