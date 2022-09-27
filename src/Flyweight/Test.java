package Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Drawings drawings = new Drawings();

        List<Factory> arraysOfDrawings = new ArrayList<>();

        arraysOfDrawings.add(drawings.takeDrawing("car"));
        arraysOfDrawings.add(drawings.takeDrawing("car"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));
        arraysOfDrawings.add(drawings.takeDrawing("airplane"));

        //System.out.println("\n=====================\n");
        //Factory none = drawings.takeDrawing("car");
        //none.create();

        System.out.println("\n======================\n");


        for(Factory factory : arraysOfDrawings){
            factory.create();
        }
    }
}
