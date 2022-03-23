package com.example.demo.poc.designPatterns.factory.factories;

import com.example.demo.poc.designPatterns.factory.PizzaFactory;
import com.example.demo.poc.designPatterns.factory.products.Pizza;
import com.example.demo.poc.designPatterns.factory.products.USFarmhousePizza;

public class USPizzaFactory implements PizzaFactory {

    @Override
    public Pizza createPizza(String name) {
        if (name.equals("farmhouse"))
            return new USFarmhousePizza();
        else if (name.equals("mexican"))
            return new USFarmhousePizza();
        else return null;
    }
}
