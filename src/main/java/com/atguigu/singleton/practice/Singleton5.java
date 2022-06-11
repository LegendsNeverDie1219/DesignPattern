package com.atguigu.singleton.practice;

/**
 * TODO
 *
 * @author Administrator
 * @date 2022/6/11 17:01
 */
public class Singleton5 {
    private Singleton5(){
    }

    private static Singleton5 instance ;
    // 懒汉式, 只有在第一次调用getInstance()这个方法的时候才会创建对象, 其他情况下,直接返回已经创建好的对象
    // todo 该方法同样存在线程不安全的问题, 因为同一时刻,依然会有一个线程通过if判断,还没有来的及创建对象
    //  另外多个线程同过if判断的可能.,
    public synchronized static Singleton5 getInstance(){
        if (instance == null) {
            synchronized (Singleton5.class) {
                instance = new Singleton5();
            }
            return instance;
        }
        return instance;
    }
}
