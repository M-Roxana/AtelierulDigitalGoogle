package Curs03_DesignPatterns.Ex_Decorator;

public class Whip extends Topping{
    public Whip(Beverage beverage){
        super(beverage, "Whip", 3);
    }
}