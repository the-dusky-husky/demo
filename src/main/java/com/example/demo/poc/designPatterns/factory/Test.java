package com.example.demo.poc.designPatterns.factory;

import com.example.demo.poc.designPatterns.factory.factories.IndianPizzaFactory;
import com.example.demo.poc.designPatterns.factory.products.Pizza;

public class Test {

    public static void main(String[] args) {

        PizzaFactory pizzaFactory = new IndianPizzaFactory();
        Pizza pizza = pizzaFactory.createPizza("tandoori");
        System.out.println(pizza);

    }
}
