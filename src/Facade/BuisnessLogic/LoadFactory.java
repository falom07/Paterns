package Facade.BuisnessLogic;

public class LoadFactory {
    public boolean areLoadFactory = false;
    ExistanceCheckListForBook existanceCheckListForBook;
    public LoadFactory(ExistanceCheckListForBook existanceCheckListForBook){
        this.existanceCheckListForBook = existanceCheckListForBook;
    }
    public void load(){
        if(existanceCheckListForBook.checkPreateMaterial()){
            System.out.println("Завод запущен");
            areLoadFactory = true;
        }else{
            System.out.println("\n=======================\n");
            System.out.println("Завод не росполагает всемя нужыми материалами");
            areLoadFactory = false;
        }

    }
}
