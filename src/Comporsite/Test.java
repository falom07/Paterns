package Comporsite;

import java.util.jar.Attributes;

public class Test {
    public static void main(String[] args) {
        Box firstBox = new Box1();
        Box secondBox = new Box2();
        Box thirdBox = new Box3();
        Box fourBox = new Box1();

        Box fifthBox = new Box1();
        Box seventhBox = new Box2();
        Box sixthBox = new Box3();
        Box eightBox = new Box1();

        NovaPochta boxRoom1 = new NovaPochta();
        NovaPochta boxRoom2 = new NovaPochta();
        NovaPochta crusialRoom = new NovaPochta();

        boxRoom1.addBox(firstBox);
        boxRoom1.addBox(secondBox);
        boxRoom1.addBox(thirdBox);
        boxRoom1.addBox(fourBox);

        boxRoom2.addBox(fifthBox);
        boxRoom2.addBox(secondBox);
        boxRoom2.addBox(seventhBox);
        boxRoom2.addBox(eightBox);

        crusialRoom.addBox(boxRoom1);
        crusialRoom.addBox(boxRoom2);

        System.out.println("First room :");
        boxRoom1.timeWhenTake();

        System.out.println("\n==================\n");

        System.out.println("Second room :");
        boxRoom2.timeWhenTake();

        System.out.println("\n==================\n");
        crusialRoom.timeWhenTake();


    }
}
