package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[] {
                new Coke("Cola", 10, "Classic Coke", false),
                new Bread("Village", 8, "bread", "Wheat"),
                new Chocolate("darkChocolate", 15, "light", 4.5),

        };
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
for (ProductForSale product : products){
    product.showDetails();

       }
    }  }