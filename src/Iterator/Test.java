package Iterator;

public class Test {
    public static void main(String[] args) {
        TakeThingInNeedDay s = new TakeThingInNeedDay();

        Iterator iterator = s.takeWhiteThing();


        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("\n===========================\n");
        Iterator iterator2 = s.takeWhiteThing();

        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }
}
