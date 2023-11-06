package com.example.designpattern.patterns.singleton;

/**
 * 饿汉式 单例模式
 * 线程安全 但是可能会造成资源浪费
 */
public class HungerSingleton {
    /**
     * 在类加载的时创建单例对象
     */
    public static HungerSingleton instance = new HungerSingleton();

    /**
     * 私有构造函数，防止外部实例化
     */
    private HungerSingleton(){

    }

    /**
     * 获取单例对象
     * 启动时创建单例对象
     * @return
     */
    public static HungerSingleton getInstance(){
        return instance;
    }
}
