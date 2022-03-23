package com.example.demo.poc.designPatterns.factory;

import com.example.demo.poc.designPatterns.factory.products.Pizza;

public interface PizzaFactory {

    Pizza createPizza(String name);
}
