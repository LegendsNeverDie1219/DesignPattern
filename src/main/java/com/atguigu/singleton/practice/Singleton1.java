package com.atguigu.singleton.practice;

/**
 * TODO
 *
 * @author Administrator
 * @date 2022/6/11 17:01
 */
public class Singleton1 {
    // ���� -> ����ʽ
    // ˽�еĹ��췽ʽ,�������ⲿnew����Ķ���
    private Singleton1() {
    }
    // �ڲ�����һ������Ķ��� ֱ�Ӷ����Ը�ֵ.
    private static final Singleton1 instance = new Singleton1();
    // �ṩ�����ľ�̬����,�ⲿ����ͨ�� ����.getInstance() ����ȡ�õ�������.
    public static Singleton1 getInstance() {
        return instance;
    }

}
