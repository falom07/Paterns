package FactoryMetod;

public class LogisticanCreator implements ShopWorkerCreater{
    @Override
    public ShopWorkerActions createWorker(){
        return new LogisticianAction();
    }
}
