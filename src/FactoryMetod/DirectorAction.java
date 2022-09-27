package FactoryMetod;

public class DirectorAction implements ShopWorkerActions{
    @Override
    public void walk(){
        System.out.println("Director go to room");
    }
}
