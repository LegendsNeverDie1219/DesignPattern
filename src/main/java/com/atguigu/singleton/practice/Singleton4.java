package com.atguigu.singleton.practice;

/**
 * TODO
 *
 * @author Administrator
 * @date 2022/6/11 17:01
 */
public class Singleton4 {
    private Singleton4(){
    }

    private static Singleton4 instance ;
    // 懒汉式, 只有在第一次调用getInstance()这个方法的时候才会创建对象, 其他情况下,直接返回已经创建好的对象
    // todo 加锁,可以保证同一时刻,只有一个线程会进入该方法,创建对象. 线程安全,但是效率低.
    public synchronized static Singleton4 getInstance(){
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}
