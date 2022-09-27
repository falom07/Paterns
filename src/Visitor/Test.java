package Visitor;

public class Test {
    public static void main(String[] args) {
        ViewOfCheck cheakForFood = new CheckForFood();
        ViewOfCheck checkOfClean = new CheckOnClean();

        TheBuildings barnOfChiken = new BarnOfChiken();
        TheBuildings barnOfCow = new BarnOfCow();
        TheBuildings barnOfSheep = new BarnOfScheep();
        TheBuildings buildings = new House();


        barnOfCow.accept(cheakForFood);
        barnOfChiken.accept(cheakForFood);
        barnOfCow.accept(checkOfClean);

        buildings.accept(checkOfClean);

    }
}
