package Decoratore;

public class DecorateEmail implements Email {
    Email object;
    public DecorateEmail(Email object){
        this.object = object;
    }
    @Override
    public void sendNotifation(){
        object.sendNotifation();
    }
}
