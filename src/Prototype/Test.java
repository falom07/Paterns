package Prototype;




public class Test {
    public static void main(String[] args) {
        Clan object1 = new Clan(18,"Nana"," Heaven");
        System.out.println(object1);


        System.out.println("\n================\n");

        CopyClan object2 = new CopyClan(object1);
        Clan object3 = (Clan) object2.clone();


        System.out.println(object3);



    }

}
