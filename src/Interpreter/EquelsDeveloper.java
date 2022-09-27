package Interpreter;

public class EquelsDeveloper implements Interpretate{

    String developers;

    public EquelsDeveloper(String developers){
        this.developers = developers;
    }
    @Override
    public boolean interpretator(String context) {
        if(context.contains(developers)) {
            return true;
        }else{
            return false;
        }
    }
}
