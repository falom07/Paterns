package Memento;

public class Game {
    private int age;
    private String place;

    public void relodeStan(int age, String place) {
        this.age = age;
        this.place = place;
    }
    public Save save(){
        return new Save(age,place);
    }
    public void load(Save save) {
        age =  save.takeAge();
        place = save.takePlace();
    }

    public String toString(){
        return "Возраст " + age + " а ваше местоположение " + place;
    }
}
