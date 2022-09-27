package FactoryMetod;

public class SellerCreator implements ShopWorkerCreater{
    @Override
    public ShopWorkerActions createWorker(){
        return new SellerAction();
    }
}
