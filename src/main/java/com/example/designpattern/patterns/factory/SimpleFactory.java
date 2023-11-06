package com.example.designpattern.patterns.factory;

public class SimpleFactory {
    public static Product createProduct(String type) {
        if ("A".equals(type)) {
            return new ProductA();
        } else if ("B".equals(type)) {
            return new ProductB();
        } else {
            throw new IllegalArgumentException("Invalid product type.");
        }
    }
}
