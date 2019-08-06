package com.test.classload;


public class LoadInfo {

    private MyClassLoader myClassLoader;

    private long loadTime;

    private BaseManager baseManager;

    public LoadInfo(MyClassLoader myClassLoader,long loadTime){
        this.myClassLoader = myClassLoader;
        this.loadTime = loadTime;
    }

    public MyClassLoader getMyClassLoader() {
        return myClassLoader;
    }

    public long getLoadTime() {
        return loadTime;
    }

    public BaseManager getBaseManager() {
        return baseManager;
    }

    public void setBaseManager(BaseManager baseManager) {
        this.baseManager = baseManager;
    }

    public void setMyClassLoader(MyClassLoader myClassLoader) {
        this.myClassLoader = myClassLoader;
    }

    public void setLoadTime(long loadTime) {
        this.loadTime = loadTime;
    }
}
