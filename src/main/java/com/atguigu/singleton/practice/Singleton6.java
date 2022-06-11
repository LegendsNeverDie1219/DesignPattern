package com.atguigu.singleton.practice;

/**
 * TODO
 *
 * @author Administrator
 * @date 2022/6/11 17:02
 */
public class Singleton6 {
    private Singleton6(){
    }

    private static Singleton6 instance ;
    // 懒汉式, 只有在第一次调用getInstance()这个方法的时候才会创建对象, 其他情况下,直接返回已经创建好的对象
    // todo 双重判断. 保证线程安全的同时,也保证了效率.
    public synchronized static Singleton6 getInstance(){
        if (instance == null) {
            synchronized (Singleton5.class) {
                if (instance == null) {
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}
