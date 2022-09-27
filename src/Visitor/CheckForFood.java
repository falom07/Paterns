package Visitor;

public class CheckForFood implements ViewOfCheck{
    @Override
    public void check(BarnOfChiken barnOfChiken) {
        System.out.println("Идет проверка количеству еды в  сарае с курками ");
        System.out.println("\n=====================\n");
    }

    @Override
    public void check(BarnOfCow barnOfCow) {
        System.out.println("Идет проверка количеству еды в  сарае с коровами ");
        System.out.println("\n=====================\n");
    }

    @Override
    public void check(BarnOfScheep barnOfScheep) {
        System.out.println("Идет проверка количеству еды в  сарае с овцами ");
        System.out.println("\n=====================\n");
    }
}
