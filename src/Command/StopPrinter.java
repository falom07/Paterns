package Command;

public class StopPrinter implements Command{
    private MethodOfPrinter methodOfPrinter;
    public StopPrinter(MethodOfPrinter methodOfPrinter){
        this.methodOfPrinter = methodOfPrinter;
    }
    @Override
    public void execute() {
        methodOfPrinter.stop();
        System.out.println("\n=========================\n");
    }
}
