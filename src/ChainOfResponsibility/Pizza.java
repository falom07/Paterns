package ChainOfResponsibility;

public class Pizza extends ImplementOfOrder{
    public Pizza(int prioritate) {
        super(prioritate);
    }

    @Override
    void cook(String order) {
        System.out.println("you win <Pizza> and your order free.Now your order are <Pizza> and " + order);
    }
}
