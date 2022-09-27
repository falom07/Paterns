package ChainOfResponsibility;

public class Ommar extends ImplementOfOrder{
    public Ommar(int prioritate) {
        super(prioritate);
    }

    @Override
    void cook(String order) {
        System.out.println("you win <OMMAR> and your order free.Now your order are <OMMAR> and " + order );
    }



}
