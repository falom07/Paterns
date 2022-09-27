package Command;

public class StartPrintColorfulPiture implements Command{
    private MethodOfPrinter methodOfPrinter;
    public StartPrintColorfulPiture(MethodOfPrinter methodOfPrinter){
        this.methodOfPrinter = methodOfPrinter;
    }
    @Override
    public void execute() {
        methodOfPrinter.print();
        System.out.println("he is colorful");
        System.out.println("\n=========================\n");
    }
}
