package FactoryMetod;

public class DirectorCreater implements ShopWorkerCreater{
    @Override
    public ShopWorkerActions createWorker(){
        return new DirectorAction();
    }
}
