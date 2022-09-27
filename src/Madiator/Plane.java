package Madiator;


public class Plane implements PeopleOnAirDrom{
    private String name;
    private LandingStrip landingStrip;
    private static boolean landingStripAreEmpty = true;


    public Plane(String name, LandingStrip landingStrip) {
        this.name = name;
        this.landingStrip = landingStrip;
    }
    public void start(String massage){
        landingStrip.sendMassage(massage,this);
        landingStripAreEmpty = true;
    }

    public void stop(String massage){
        if(landingStripAreEmpty){
            landingStrip.sendMassage(massage,this);
            landingStripAreEmpty = false;
        }else{
            System.out.println("Площадка заполнена другими самолетами,покружляйте!!!");
        }
    }

    @Override
    public void sendMassage(String massage) {
        landingStrip.sendMassage(massage,this);
    }

    @Override
    public void getMassage(String massage) {
        System.out.println(this.name + "Вам пришло сообщение " + massage);
    }
}
