package Visitor;

public class BarnOfScheep implements TheBuildings{
    @Override
    public void accept(ViewOfCheck viewOfCheck) {
        viewOfCheck.check(this);
    }
}
