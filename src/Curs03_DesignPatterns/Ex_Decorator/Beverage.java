package Curs03_DesignPatterns.Ex_Decorator;

public abstract class Beverage {
    private String description;
    private int cost;

    public Beverage(String description, int cost) {
        this.cost = cost;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getCost() {
        return cost;
    }
}