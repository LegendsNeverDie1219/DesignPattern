package com.atguigu.singleton.practice;

/**
 * TODO
 *
 * @author Administrator
 * @date 2022/6/11 17:01
 */
public class Singleton3 {
    private Singleton3(){
    }

    private static Singleton3 instance ;
    // 懒汉式, 只有在第一次调用getInstance()这个方法的时候才会创建对象, 其他情况下,直接返回已经创建好的对象
    // todo 注意: 只有在单线程的时候可以使用, 多线程,会导致线程a通过了if判断,还没有来得及创建对象的时候,其他线程b 也进入了该if判断.
    // 即线程不安全.
    public static Singleton3 getInstance(){
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
