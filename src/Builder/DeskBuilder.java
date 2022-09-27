package Builder;

abstract class DeskBuilder {
    SetBuild setBuild;
    public void createDesk(){
        setBuild = new SetBuild();
    }
    abstract void buildArea();
    abstract void buildMatirial();
    abstract void buildDiameter();
    public SetBuild getDesk(){
        return setBuild;
    }
}
