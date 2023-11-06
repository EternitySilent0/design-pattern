package com.example.designpattern.patterns.singleton;

/**
 * 双重检查锁 单例模式
 * 既保证线程安全 又实现延迟加载
 */
public class DoubleCheckLockSingleton {
    /**
     * volatile关键字 实现第一重线程安全锁
     */
    private static volatile DoubleCheckLockSingleton instance;

    /**
     * 私有构造函数，防止外部实例化
     */
    private DoubleCheckLockSingleton(){

    }

    public static DoubleCheckLockSingleton getInstance(){
        if (instance == null){
            // synchronized代码块 实现第二重线程安全锁
            synchronized (DoubleCheckLockSingleton.class){
                if (instance == null){
                    instance = new DoubleCheckLockSingleton();
                }
            }
        }
        return instance;
    }
}
