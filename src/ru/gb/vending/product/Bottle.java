package ru.gb.vending.product;

public class Bottle extends Product{
    private double volume;

    public Bottle(String name, double price, double volume) {
        super(name, price);
        this.volume = volume;
    }
    public double getVolume(){
        return volume;
    }
    public String toString(){
        return super.toString() + ", объем" + volume + "л" + "}";
    }
}
