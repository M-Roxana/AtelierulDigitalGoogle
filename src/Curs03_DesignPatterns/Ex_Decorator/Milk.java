package Curs03_DesignPatterns.Ex_Decorator;

public class Milk extends Topping{
    public Milk(Beverage beverage ){
        super(beverage, "Milk", 3);
    }
}