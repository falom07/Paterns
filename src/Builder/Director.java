package Builder;

public class Director {
    DeskBuilder desk;


    public Director(DeskBuilder nameOfCompany ){
        desk = nameOfCompany;
    }
    public SetBuild build(){
        desk.createDesk();
        desk.buildArea();
        desk.buildDiameter();
        desk.buildMatirial();
        return desk.getDesk();
    }


}
