package com.example;

public class Product {
    private String name;
    private int quantity;
    private int sellPrice;
    private int buyPrice;
    private int transport; // 운송료
    private int banefit; // 이익금
    private double rate; // 이익율

    public Product(String name, int quantity, int sellPrice, int buyPrice, int transport) {
        this.name = name;
        this.quantity = quantity;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.transport = transport;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getTransport() {
        return transport;
    }

    public int getBanefit() {
        return banefit;
    }

    public void setBanefit(int banefit) {
        this.banefit = banefit;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return String.format(
                "%-12s\t%,7d\t%,7d\t%,7d\t%,7d\t%,10d\t%7.2f", name, quantity, sellPrice, buyPrice, transport, banefit, rate);

    }
}
