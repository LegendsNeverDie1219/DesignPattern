package com.atguigu.singleton.practice;

/**
 * TODO
 *
 * @author Administrator
 * @date 2022/6/11 17:02
 */
public enum Singleton8 {
    // ÊµÀý
    instance;

    public static Singleton8 getInstance() {
        return instance;
    }
}
