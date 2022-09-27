package Memento;

import java.util.ArrayList;
import java.util.List;

public class File {
    private int number = -1;
    List <Save> bassDate = new ArrayList<>();
    public void setSave(Save save){
        bassDate.add(save);
        ++number;
    }
    public Save getSave(int index){
        return bassDate.get(index -1);
    }
    public Save getLastSave(){
        return bassDate.get(number);
    }
}
