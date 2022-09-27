package Command;

public class StartPrintBlackandWhitePicture implements Command{
    private MethodOfPrinter methodOfPrinter;
    public StartPrintBlackandWhitePicture(MethodOfPrinter methodOfPrinter){
        this.methodOfPrinter = methodOfPrinter;
    }
    @Override
    public void execute() {
        methodOfPrinter.print();
        System.out.println("he is black and white");
        System.out.println("\n=========================\n");
    }
}
