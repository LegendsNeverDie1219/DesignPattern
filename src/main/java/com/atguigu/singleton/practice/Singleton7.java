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
    // ��̬�ڲ��෽ʽ��Singleton�౻װ��ʱ����������ʵ�����������ڵ���getInstance�������Ż�װ��SingletonInstance�࣬
    // �Ӷ����Singleton��ʵ������������

    // ��ľ�̬����ֻ���ڵ�һ�μ������ʱ���ʼ�������������JVM��������
    // ��֤���̵߳İ�ȫ�ԣ�������г�ʼ��ʱ������߳����޷�����ġ�
    // ʹ�þ�̬�ڲ���.
    private static class Singleton7Instance {
        private static final Singleton7 instance = new Singleton7();
    }
}

