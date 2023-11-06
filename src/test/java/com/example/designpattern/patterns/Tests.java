package com.example.designpattern.patterns;

import com.example.designpattern.patterns.factory.Product;
import com.example.designpattern.patterns.factory.SimpleFactory;
import com.example.designpattern.patterns.observer.Observee;
import com.example.designpattern.patterns.observer.ObserveeImpl;
import com.example.designpattern.patterns.observer.Observer;
import com.example.designpattern.patterns.observer.ObserverImpl;
import org.junit.jupiter.api.Test;

public class Tests {

    /**
     * 工厂模式测试
     */
    @Test
    void FactoryTest(){
        Product productA = SimpleFactory.createProduct("A");
        productA.operation();

        Product productB = SimpleFactory.createProduct("B");
        productB.operation();
    }

    /**
     * 观察者模式测试
     */
    @Test
    void ObserverTest(){
        Observee observee = new ObserveeImpl();
        Observer observer1 = new ObserverImpl("观察者1");
        Observer observer2 = new ObserverImpl("观察者2");

        observee.registerObserver(observer1);
        observee.registerObserver(observer2);
        observee.action("开始监测！");
    }
}
