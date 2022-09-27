package Bridge;

public class Test {

    public static void main(String[] args) {
        RemoteController controller =  new Person(new FirstRemoteController());
    controller.add();
    }
}
//shit
