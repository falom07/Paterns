package Bridge;

public class SecondRemoteController implements KindOfRemoteController{
    @Override
    public void turnOn() {
        System.out.println("Televisor2 are turn on ");
    }

    @Override
    public void turnOf() {
        System.out.println("Televisior2 are turn off");
    }

    @Override
    public void AddVolume() {
        System.out.println("Volume2 was has been added");
    }

    @Override
    public void MinuseVolume() {
        System.out.println("Volume2 was has been reduced");
    }
}
