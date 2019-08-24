package com.company;

public class Candy extends Sweet {
    private String name;
    private double weight;
    private double price;
    private String chokol;

    public Candy(String name, double weight, double price, String chokol) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.chokol = chokol;
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