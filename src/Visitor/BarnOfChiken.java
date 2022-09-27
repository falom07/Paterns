package Visitor;

public class BarnOfChiken implements TheBuildings{
    @Override
    public void accept(ViewOfCheck viewOfCheck) {
        viewOfCheck.check(this);
    }
}
