package Facade.InterfaceForUser;
import Facade.BuisnessLogic.*;
public class CreateBook {
    ExistanceCheckListForBook existanceCheckListForBook = new ExistanceCheckListForBook();

    LoadFactory loadFactory = new LoadFactory(existanceCheckListForBook);
    public void startProgram(){
        loadFactory.load();
    }

}
