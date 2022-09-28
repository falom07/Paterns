package MVC;

public class Model {
    boolean inSystem = false;
    public boolean startProgram(){
        inSystem = true;
        return true;
    }
    public boolean nextPageInBaseOfDate(){
        if(inSystem){
        return true;
        } else {
            return false;
        }
    }
    public boolean takeStoryAndFindLastPage(){
        if(inSystem) {
            return true;
        }else{
            return false;
        }
    }
    public boolean exitFromProgram(){
        inSystem = false;
        return true;
    }
}
