package com.example.designpattern.patterns.singleton;

/**
 * 懒汉式 单例模式
 */
public class LazySingleton {
    /**
     * 在类加载的时创建单例对象
     */
    private static LazySingleton instance;

    /**
     * 私有构造函数，防止外部实例化
     */
    private LazySingleton(){

    }

    /**
     * 获取单例对象
     * 在用到时加载单例对象
     * @return
     */
    public static LazySingleton getInstance(){
        //若没有出现过该实例，则创建新的实例对象
        if (instance == null){
            instance = new LazySingleton();
        }

        //返回已有实例
        return  instance;
    }

}
