package com.test.classload;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

public class MyClassLoader extends ClassLoader{

    private String classpath;

    public MyClassLoader(String classpath){

        super(ClassLoader.getSystemClassLoader());
        this.classpath = classpath;
    }


    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException{
        byte[] data = this.loadClassData(name);
        return this.defineClass(name,data,0,data.length);
    }


    private byte[] loadClassData(String name){

        try{
            name = name.replace(".","//");
            FileInputStream fileInputStream = new FileInputStream(new File(classpath + name + ".class"));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

            int b = 0;
            while((b = fileInputStream.read()) != -1){
                byteArrayOutputStream.write(b);
            }
            fileInputStream.close();
            return byteArrayOutputStream.toByteArray();

        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }



}
