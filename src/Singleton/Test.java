package Singleton;

public class Test {
    public static void main(String[] args) {
        Trees.getInfo().updateState("yellow");
        Trees.getInfo().updateState("purple");
        Trees.getInfo().updateState("blue");
        Trees.getInfo().updateState("red");
        Trees.getInfo().seeInfo();
        //winner
    }
}
