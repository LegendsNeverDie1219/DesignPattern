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
    // ����ʽ, ֻ���ڵ�һ�ε���getInstance()���������ʱ��Żᴴ������, ���������,ֱ�ӷ����Ѿ������õĶ���
    // todo ����,���Ա�֤ͬһʱ��,ֻ��һ���̻߳����÷���,��������. �̰߳�ȫ,����Ч�ʵ�.
    public synchronized static Singleton4 getInstance(){
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}
