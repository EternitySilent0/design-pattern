package com.example.designpattern.patterns;

import com.example.designpattern.patterns.Adapter.Target;
import com.example.designpattern.patterns.Adapter.Adaptee;
import com.example.designpattern.patterns.Adapter.Adapter;
import com.example.designpattern.patterns.Decorator.BlueShapeDecorator;
import com.example.designpattern.patterns.Decorator.Circle;
import com.example.designpattern.patterns.Decorator.Rectangle;
import com.example.designpattern.patterns.Decorator.Shape;
import com.example.designpattern.patterns.factory.Product;
import com.example.designpattern.patterns.factory.SimpleFactory;
import com.example.designpattern.patterns.observer.Observee;
import com.example.designpattern.patterns.observer.ObserveeImpl;
import com.example.designpattern.patterns.observer.Observer;
import com.example.designpattern.patterns.observer.ObserverImpl;
import org.junit.jupiter.api.Test;

public class Tests {

    /**
     * 装饰器模式测试
     */
    @Test
    void DecoratorTest(){
        Shape circle = new Circle();
        Shape blueCircle = new BlueShapeDecorator(new Circle());
        Shape blueRectangle = new BlueShapeDecorator(new Rectangle());

        System.out.println("普通的圆：");
        circle.draw();
        System.out.println("蓝色的圆：");
        blueCircle.draw();
        System.out.println("蓝色的矩形：");
        blueRectangle.draw();
    }

    /**
     * 适配器模式测试
     */
    @Test
    void AdapterTest(){
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }

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
