package com.company;
import java.util.ArrayList;

class Main implements BoxInerface {

    private ArrayList<Sweet> sweets = new ArrayList<>();
    public static void main(String[] args){
        Main box1 = new Main();
        box1.addSweet(new Candy("Залупрошен", 14, 88, "Гей"));
        box1.printBoxWeight();
    }
    @Override
    public void addSweet(Sweet sweet) {
        sweets.add(sweet);
    }

    @Override
    public void removeSweet(int index) {
        sweets.remove(index);
    }

    @Override
    public void removeSweet() {
        sweets.remove(sweets.size());
    }

    @Override
    public void printBoxWeight() {
        double weight = 0;
        for(Sweet s : sweets){
            weight += s.getWeight();
        }
        System.out.println(weight);
    }

    @Override
    public void printBoxPrice() {
        double price = 0;
        for(Sweet s : sweets){
            price += s.getPrice();
        }
        System.out.println(price);
    }

    @Override
    public void getAllBoxInformation() {
        printBoxWeight();
        printBoxPrice();
    }
}