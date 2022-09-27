package Builder;

public class QuarateFactory extends DeskBuilder{
    @Override
    void buildArea() {
        setBuild.setArea(12);
    }

    @Override
    void buildMatirial() {
        setBuild.setMatirial(MatirialOfDesk.QUARTS);
    }

    @Override
    void buildDiameter() {
        setBuild.setDiameter(44.2);
    }
}
