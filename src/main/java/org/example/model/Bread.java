package org.example.model;

public class Bread extends ProductForSale{
    private String flour;

    public Bread(String type, int price, String description,String flour){
        super(type, price, description);
        this.flour=flour;
    }
    public String getFlour() {
        return flour;
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
        System.out.println("Bread - " + getType());
        System.out.println("Price: " + getPrice() + " TL");
        System.out.println("Description: " + getDescription());
        System.out.println("Flour Type: " + flour);
    }


}
