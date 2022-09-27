package Visitor;

public class CheckOnClean implements ViewOfCheck{
    @Override
    public void check(BarnOfChiken barnOfChiken) {
        System.out.println("Идет проверка по чистоте сарая с курками ");
        System.out.println("\n=====================\n");
    }

    @Override
    public void check(BarnOfCow barnOfCow) {
        System.out.println("Идет проверка по чистоте сарая с коровами ");
        System.out.println("\n=====================\n");
    }

    @Override
    public void check(BarnOfScheep barnOfScheep) {
        System.out.println("Идет проверка по чистоте сарая с овцами ");
        System.out.println("\n=====================\n");
    }
}
