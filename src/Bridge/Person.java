package Bridge;

public class Person extends RemoteController {



    public Person(KindOfRemoteController remoteController) {
        super(remoteController);
    }


    public void add(){
        remoteController.AddVolume();
    }public void minuse(){
        remoteController.MinuseVolume();
    }public void off(){
        remoteController.turnOf();
    }public void on(){
        remoteController.turnOn();
    }

}

