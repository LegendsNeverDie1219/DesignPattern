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
    // ����ʽ, ֻ���ڵ�һ�ε���getInstance()���������ʱ��Żᴴ������, ���������,ֱ�ӷ����Ѿ������õĶ���
    // todo ˫���ж�. ��֤�̰߳�ȫ��ͬʱ,Ҳ��֤��Ч��.
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
