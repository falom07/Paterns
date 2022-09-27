package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class Drawings {
    private static final Map<String,Factory> lISTOFDRAWINGS = new HashMap<>();

    public Factory takeDrawing(String typeOfDrawing){
        Factory factory = lISTOFDRAWINGS.get(typeOfDrawing);

        if(factory == null){
            switch(typeOfDrawing){
                case("airplane"):
                    System.out.println("Was create new drawing of airplane");

                    factory = new FactoryOfAirplane();
                    break;
                case("car"):
                    System.out.println("Was creating new drawing of car");

                    factory = new FactoryOfCar();
                    break;
            }
            lISTOFDRAWINGS.put(typeOfDrawing,factory);
        }
            return factory;
    }
}
