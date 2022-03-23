package com.example.demo.poc.designPatterns.factory.factories;

import com.example.demo.poc.designPatterns.factory.PizzaFactory;
import com.example.demo.poc.designPatterns.factory.products.IndianOnionPizza;
import com.example.demo.poc.designPatterns.factory.products.IndianTandooriPizza;
import com.example.demo.poc.designPatterns.factory.products.Pizza;

public class IndianPizzaFactory implements PizzaFactory {

    @Override
    public Pizza createPizza(String name) {
        if (name.equals("onion"))
            return new IndianOnionPizza();
        else if (name.equals("tandoori")){
            return new IndianTandooriPizza();
        }
        else return null;
    }
}
