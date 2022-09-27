package Madiator;

public class Dispecher implements  PeopleOnAirDrom{
    private String name;
    private LandingStrip landingStrip;

    public Dispecher(String name, LandingStrip landingStrip) {
        this.name = name;
        this.landingStrip = landingStrip;
    }


    public void sendMassage(String massage) {
        landingStrip.sendMassage(massage,this);
    }

    @Override
    public void getMassage(String massage) {
        System.out.println(this.name + "Вам пришло сообщение " + massage);
    }
}
