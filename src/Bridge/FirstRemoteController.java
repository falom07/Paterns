package Bridge;

public class FirstRemoteController implements KindOfRemoteController{
    @Override
    public void turnOn() {
        System.out.println("Televisor are turn on ");
    }

    @Override
    public void turnOf() {
        System.out.println("Televisior are turn off");
    }

    @Override
    public void AddVolume() {
        System.out.println("Volume was has been added");
    }

    @Override
    public void MinuseVolume() {
        System.out.println("Volume was has been reduced");
    }
}
