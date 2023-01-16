package Curs03_DesignPatterns.Ex_Decorator;

public class Chocolate extends Topping{
    public Chocolate(Beverage beverage) {
        super(beverage, "Chocolate", 4);
    }
}