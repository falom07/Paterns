package FactoryMetod;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write user that you need create :");




        String spesialty = scanner.nextLine();


        ShopWorkerCreater worker = shoseSpcialty(spesialty);
        ShopWorkerActions worker2 = worker.createWorker();
        worker2.walk();
        //park




    }
    public static ShopWorkerCreater shoseSpcialty(String specialty){
        if(specialty.equalsIgnoreCase("director")){
            return new DirectorCreater();
        }else if(specialty.equalsIgnoreCase("seller")){
            return new SellerCreator();
        }else if(specialty.equalsIgnoreCase("logistician")){
            return new LogisticanCreator();
        }else{
            throw new RuntimeException(specialty + " does not exist");
        }
    }
}
