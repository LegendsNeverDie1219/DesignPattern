package com.atguigu.singleton.practice;

import org.junit.jupiter.api.Test;

/**
 * TODO
 *
 * @author Administrator
 * @date 2022/6/11 17:00
 */
public class SingletonTest {

    @Test
    public void testSingleton1() {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();

        System.out.println(instance1 == instance2);

        System.out.println("instance.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

    @Test
    public void testSingleton2() {
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();

        System.out.println(instance1 == instance2);

        System.out.println("instance.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

    @Test
    public void testSingleton3() {
        Singleton3 instance1 = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();

        System.out.println(instance1 == instance2);

        System.out.println("instance.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

    @Test
    public void testSingleton4() {
        Singleton4 instance1 = Singleton4.getInstance();
        Singleton4 instance2 = Singleton4.getInstance();

        System.out.println(instance1 == instance2);

        System.out.println("instance.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

    @Test
    public void testSingleton5() {
        Singleton5 instance1 = Singleton5.getInstance();
        Singleton5 instance2 = Singleton5.getInstance();

        System.out.println(instance1 == instance2);

        System.out.println("instance.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

    @Test
    public void testSingleton6() {
        Singleton6 instance1 = Singleton6.getInstance();
        Singleton6 instance2 = Singleton6.getInstance();

        System.out.println(instance1 == instance2);

        System.out.println("instance.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

    @Test
    public void testSingleton7() {
        Singleton7 instance1 = Singleton7.getInstance();
        Singleton7 instance2 = Singleton7.getInstance();

        System.out.println(instance1 == instance2);

        System.out.println("instance.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

    @Test
    public void testSingleton8() {
        Singleton8 instance1 = Singleton8.getInstance();
        Singleton8 instance2 = Singleton8.getInstance();

        System.out.println(instance1 == instance2);

        System.out.println("instance.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}


