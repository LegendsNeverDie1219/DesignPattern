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
    // ����ʽ, ֻ���ڵ�һ�ε���getInstance()���������ʱ��Żᴴ������, ���������,ֱ�ӷ����Ѿ������õĶ���
    // todo ע��: ֻ���ڵ��̵߳�ʱ�����ʹ��, ���߳�,�ᵼ���߳�aͨ����if�ж�,��û�����ü����������ʱ��,�����߳�b Ҳ�����˸�if�ж�.
    // ���̲߳���ȫ.
    public static Singleton3 getInstance(){
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
