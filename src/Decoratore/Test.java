package Decoratore;

public class Test {
    public static void main(String[] args) {
        Email amail2 = new Viber(new DecorateEmail(new Notifition()));
        amail2.sendNotifation() ;
        System.out.println();
        Email amail = new FaceBook(new Viber(new DecorateEmail(new Notifition())));
       amail.sendNotifation() ;

        Email amail1 = new Viber(new FaceBook(new DecorateEmail(new Notifition())));
        amail1.sendNotifation() ;
    }
}
