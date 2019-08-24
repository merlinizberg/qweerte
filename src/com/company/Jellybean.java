package com.company;

public class Jellybean extends Sweet {
    private String name;
    private double weight;
    private double price;
    private String color;

    public Jellybean(String name, double weight, double price, String color) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.color = color;
    }
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
