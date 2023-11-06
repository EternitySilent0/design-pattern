package com.example.designpattern.patterns.observer;

/**
 * 观察者实现类
 */
public class ObserverImpl implements Observer{
    /**
     * 实际观察者名称个
     */
    private String name;

    public ObserverImpl(String name){
        this.name = name;
    }

    @Override
    public void push(String message) {
        System.out.println(name + "接收到新消息：" + message);
    }
}
