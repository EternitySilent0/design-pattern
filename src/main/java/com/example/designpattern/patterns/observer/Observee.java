package com.example.designpattern.patterns.observer;

/**
 * 被观察者接口
 */
public interface Observee {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void action(String message);
}
