package org.example.model;

public class Coke extends ProductForSale{

    private boolean isDiet;



    public Coke(String description, int price, String type, boolean isDiet) {
        super(description, price, type);
        this.isDiet=isDiet;
    }
    public boolean isIsDiet() {
        return isDiet;
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
        System.out.println("Coke - " + getType());
        System.out.println("Price: " + getPrice() + " TL");
        System.out.println("Description: " + getDescription());
        System.out.println("Diet: " + (isDiet ? "Yes" : "No"));
    }
}
