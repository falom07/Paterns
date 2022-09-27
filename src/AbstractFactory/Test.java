package AbstractFactory;

public class Test {
    public static void main(String[] args) {
        Create createSomeThing = new CreateThing();
        chair desk12 = createSomeThing.createChair();
        desk12.whatDoChair();
        /* work place(company) */
    }
}
