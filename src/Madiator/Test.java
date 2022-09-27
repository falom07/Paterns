package Madiator;

public class Test {
    public static void main(String[] args) {
        LandingTripNewYork landingStripFirst = new LandingTripNewYork();
        Plane plane1 = new Plane("Plane 32-4 ",landingStripFirst);
        Plane plane2 = new Plane("Plane 12-32 ",landingStripFirst);
        Dispecher dispecher = new Dispecher("Dispecher Maria ",landingStripFirst);

        landingStripFirst.addPlane(plane1);
        landingStripFirst.addPlane(plane2);
        landingStripFirst.addDispecher(dispecher);

        plane1.start("Я взлетаю");

        System.out.println("\n============================\n");

        plane1.stop("Я хочу сесть");
        
        System.out.println("\n============================\n");

        plane2.stop("Я хочу сесть 2.0");
    }
}
