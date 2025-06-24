package org.example.rpg;

public class Troll extends Monster implements Bleedable,Poisonable{
    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }


    @Override
    public double bleed() {
        double newBleend=getDamage()*0.25;
        return newBleend;
    }

    @Override
    public Double poison() {
        double poisonAmount = getDamage() * 0.3;
        return poisonAmount;
    }
}
