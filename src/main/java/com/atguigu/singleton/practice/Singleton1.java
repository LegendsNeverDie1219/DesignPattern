package com.atguigu.singleton.practice;

/**
 * TODO
 *
 * @author Administrator
 * @date 2022/6/11 17:01
 */
public class Singleton1 {
    // 单例 -> 饿汉式
    // 私有的构造方式,不允许外部new该类的对象
    private Singleton1() {
    }
    // 内部创建一个该类的对象 直接对属性赋值.
    private static final Singleton1 instance = new Singleton1();
    // 提供公共的静态方法,外部可以通过 类名.getInstance() 来获取该单例对象.
    public static Singleton1 getInstance() {
        return instance;
    }

}
