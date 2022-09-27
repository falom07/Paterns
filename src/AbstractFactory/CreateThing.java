package AbstractFactory;

public class CreateThing implements Create{

    @Override
    public chair createChair() {
        return new Chair();
    }

    @Override
    public desk createDesk() {
        return new DeskMethod();
    }

    @Override
    public Banches createBanches() {
        return new BanchesMethod();
    }
}
