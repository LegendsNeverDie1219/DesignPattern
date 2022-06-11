package com.atguigu.singleton.practice;

/**
 * TODO
 *
 * @author Administrator
 * @date 2022/6/11 17:01
 */
public class Singleton2 {
    private Singleton2() {
    }

    private static Singleton2 instance;
    // 饿汉式- 使用静态代码对属性赋值.
    static {
        instance = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return instance;
    }
}
