package org.example.model;

public class Chocolate extends ProductForSale {

   private double percentage;
    public Chocolate(String description, int price, String type,double percentage) {
        super(description, price, type);
        this.percentage = percentage;
    }
    public double getPercentage() {
        return percentage;
    }
    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public int getSalesPrice(int quantity) {
        return super.getSalesPrice(quantity);
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate - " + getType());
        System.out.println("Price: " + getPrice() + " TL");
        System.out.println("Description: " + getDescription());
        System.out.println("Cocoa: " + percentage + "%");
    }
}
