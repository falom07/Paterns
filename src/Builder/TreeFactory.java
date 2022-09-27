package Builder;

public class TreeFactory extends DeskBuilder{
    @Override
    void buildArea() {
        setBuild.setArea(79);
    }

    @Override
    void buildMatirial() {
        setBuild.setMatirial(MatirialOfDesk.WODDEN);
    }

    @Override
    void buildDiameter() {
        setBuild.setDiameter(12.4);
    }
}
