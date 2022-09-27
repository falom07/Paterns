package ChainOfResponsibility;

public class Colla  extends ImplementOfOrder{

    public Colla(int prioritate) {
        super(prioritate);
    }

    @Override
    void cook(String order) {
        System.out.println("you win <Colla> and your order free.Now your order are <Colla> and " + order);
    }
}
