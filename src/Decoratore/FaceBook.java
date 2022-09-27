package Decoratore;

public class FaceBook extends DecorateEmail{

    public FaceBook(Email object) {
        super(object);
    }
    public void sendFaceBook(){
        System.out.println("Notication from FaceBook");
    }
    @Override
    public void sendNotifation(){
        object.sendNotifation() ;
        System.out.println(" ");
        sendFaceBook();
    }
}
