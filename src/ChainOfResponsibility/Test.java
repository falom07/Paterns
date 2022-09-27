package ChainOfResponsibility;
import java.util.Random;
public class Test {
    public static void main(String[] args) {
        Random random  = new Random();
        int randomWin = random.nextInt(1,4);


        ImplementOfOrder implementOfOrder = new Pizza(ViewOfOrder.PIZZA);
        ImplementOfOrder implementOfOrder1 = new Colla(ViewOfOrder.COLLA);
        ImplementOfOrder implementOfOrder2 = new Ommar(ViewOfOrder.OMMAR);
        implementOfOrder.setNext(implementOfOrder1);
        implementOfOrder1.setNext(implementOfOrder2);
        implementOfOrder.cookOrder("Lassania and cheese",randomWin);
    }
}

