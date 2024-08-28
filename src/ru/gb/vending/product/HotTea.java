package ru.gb.vending.product;

public class HotTea extends Product{
    private int temperature;
    private double volume;

    public HotTea (String name, double price, double volume, int temperature) {
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
    }
    public double getVolume(){
        return volume;
    }

    public int getTemperature() {
        return temperature;
    }
    public String toString() {
        return super.toString() + ", объем" + volume + "л." + "очень горячий" + "}";

    }
}
