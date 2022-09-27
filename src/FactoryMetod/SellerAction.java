package FactoryMetod;

public class SellerAction implements ShopWorkerActions{
    @Override
    public void walk(){
        System.out.println("Seller go to room");
    }
}
