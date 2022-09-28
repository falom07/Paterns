package MVC;



public class Test {
    public static void main(String[] args) {
        Model model = new Model();
        View user = new View();
        Controller controller = new Controller(model,user);

        controller.start();
        controller.nextPage();
        controller.exit();

        controller.previousPage();

        controller.start();
        controller.previousPage();
    }
}
