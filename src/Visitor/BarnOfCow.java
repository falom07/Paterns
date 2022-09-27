package Visitor;

public class BarnOfCow implements TheBuildings{
    @Override
    public void accept(ViewOfCheck viewOfCheck) {
        viewOfCheck.check(this);
    }
}
