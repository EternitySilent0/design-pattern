package com.example.designpattern.patterns.singleton;

/**
 * 静态内部类方式 单例模式
 * 初次调用 getInstance 方法时，加载静态内部类，完成单例模式的创建
 * 既兼顾了线程安全又兼顾了延迟加载的需求
 */
public class StaticInteriorSingleton {
    /**
     * 私有构造函数，防止外部实例化
     */
    private StaticInteriorSingleton(){

    }

    /**
     * 返回静态内部类常量
     * @return
     */
    public static StaticInteriorSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    /**
     * 静态内部类
     */
    private static class SingletonHolder{
        private static final StaticInteriorSingleton INSTANCE = new StaticInteriorSingleton();
    }
}
