package TemplateMathod;

public abstract class Movement {
    public void move(String race){
        System.out.println("I am " + race + " and I can :");
        System.out.println("go");
        swim();
        fly();
        System.out.println("\n");
    }
    abstract void fly();
    abstract void swim();
}
