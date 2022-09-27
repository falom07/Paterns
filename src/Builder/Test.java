package Builder;

public class Test {
    public static void main(String[] args) {
        Director director = new Director(new IronFactory());
        SetBuild finalDesk = director.build();
        System.out.println(finalDesk);
    }


}
