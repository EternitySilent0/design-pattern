package com.example.designpattern.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者实现类
 */
public class ObserveeImpl implements Observee{
    /**
     * 观察者列表
     */
    private List<Observer> observers = new ArrayList<>();


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void action(String message) {
        for (Observer observer : observers){
            observer.push(message);
        }
    }
}
