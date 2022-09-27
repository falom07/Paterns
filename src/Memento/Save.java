package Memento;

public class Save {
    private final int AGE;
    private final String PLACE;
    public Save(int age, String place) {
        this.AGE = age;
        this.PLACE = place;
    }
    public int takeAge(){
        return AGE;
    }

    public String takePlace(){
        return PLACE;
    }
}
