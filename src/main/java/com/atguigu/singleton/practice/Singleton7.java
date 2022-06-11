package com.atguigu.singleton.practice;

/**
 * TODO
 *
 * @author Administrator
 * @date 2022/6/11 17:02
 */
public class Singleton7 {
    private Singleton7() {
    }

    public static Singleton7 getInstance() {
        return Singleton7Instance.instance;
    }
    // 静态内部类方式在Singleton类被装载时并不会立即实例化，而是在调用getInstance方法，才会装载SingletonInstance类，
    // 从而完成Singleton的实例化。懒加载

    // 类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们
    // 保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
    // 使用静态内部类.
    private static class Singleton7Instance {
        private static final Singleton7 instance = new Singleton7();
    }
}

