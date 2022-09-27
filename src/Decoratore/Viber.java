package Decoratore;

public class Viber extends DecorateEmail{

    public Viber(Email object) {
        super(object);
    }

    public void sendViber(){
        System.out.println("Notification from Viber");
    }
    @Override
    public void sendNotifation(){
        object.sendNotifation() ;
        System.out.println(" ");
    sendViber();
    }
}
