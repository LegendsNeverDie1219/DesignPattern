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
    // ����ʽ, ֻ���ڵ�һ�ε���getInstance()���������ʱ��Żᴴ������, ���������,ֱ�ӷ����Ѿ������õĶ���
    // todo �÷���ͬ�������̲߳���ȫ������, ��Ϊͬһʱ��,��Ȼ����һ���߳�ͨ��if�ж�,��û�����ļ���������
    //  �������߳�ͬ��if�жϵĿ���.,
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
