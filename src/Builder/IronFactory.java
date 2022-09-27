package Builder;

public class IronFactory extends DeskBuilder{
    @Override
    public void buildArea() {
        setBuild.setArea(59);
    }

    @Override
    public void buildMatirial() {
        setBuild.setMatirial(MatirialOfDesk.IRON);
    }

    @Override
    public void buildDiameter() {
        setBuild.setDiameter(12.2);
    }
}
