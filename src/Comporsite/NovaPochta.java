package Comporsite;

import java.util.ArrayList;
import java.util.List;

public class NovaPochta implements Box{
    private List<Box> box = new ArrayList<>();

    public void addBox(Box box){
        this.box.add(box);
    }
    public void removeBox(Box box){
        this.box.remove(box);
    }
    @Override
    public void timeWhenTake(){
        for(Box box : this.box){
            box.timeWhenTake();
        }
    }
}
