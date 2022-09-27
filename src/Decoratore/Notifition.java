package Decoratore;

public class Notifition implements Email {


    @Override
    public void sendNotifation() {
    System.out.println("Вам надійшло повідомдення: ");
    }
}
