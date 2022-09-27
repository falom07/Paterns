package State;

public class OnePlusOne implements Channel {
    @Override
    public void active() {
        System.out.println("Now play channel One plus One");
    }
}
