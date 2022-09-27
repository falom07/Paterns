package Command;

public class Test {
    public static void main(String[] args) {
        MethodOfPrinter methodOfPrinter = new MethodOfPrinter();
        User user = new User();

        user.setCommand(new StartPrintColorfulPiture(new MethodOfPrinter()));
        user.execute();
        user.setCommand(new StartPrintBlackandWhitePicture(new MethodOfPrinter()));
        user.execute();
        user.setCommand(new StopPrinter(methodOfPrinter));
        user.execute();

    }
}
