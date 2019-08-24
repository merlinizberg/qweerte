package com.company;

public class Lolipop extends Sweet {
    private String name;
    private double weight;
    private double price;
    private int size;

    public Lolipop(String name, double weight, double price, int size) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.size = size;
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