package Bridge;

 abstract class RemoteController {
    KindOfRemoteController remoteController;
    public RemoteController(KindOfRemoteController remoteController){
        this.remoteController = remoteController;

        }
     abstract void add();
     abstract void on();
     abstract void off();
     abstract void minuse();


 }

