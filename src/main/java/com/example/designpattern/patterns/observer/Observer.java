package com.example.designpattern.patterns.observer;

/**
 * 观察者接口
 */
public interface Observer {
    /**
     * 推送最新消息
     * @param message
     */
    void push(String message);
}
