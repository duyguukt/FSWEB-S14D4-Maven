package org.example.rpg;

public abstract class Monster {
    private String name ;
    private int hitPoints ;
    private double damage ;

    public Monster(String name, int hitPoints,double damage) {
        this.damage = damage;
        this.hitPoints = hitPoints;
        this.name = name;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public String getName() {
        return name;
    }
    public double attack(){
        double totalDamage = getDamage();

        if (this instanceof Bleedable) {
            totalDamage += ((Bleedable) this).bleed();
        }

        if (this instanceof Poisonable) {
            totalDamage += ((Poisonable) this).poison();
        }

        System.out.println(getName() + " total attack damage: " + totalDamage);
        return totalDamage;
    }
}
