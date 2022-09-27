package Prototype;

public class Clan implements Copy{
    private int age;
    private String name;
    private String wheareYouFrom;
    public Clan(int age,String name,String wheareYouFrom){
        this.name = name;
        this.age = age;
        this.wheareYouFrom= wheareYouFrom;
    }
    @Override
    public Object copy(){
        Clan copy = new Clan(age,name,wheareYouFrom);
        return copy;
    }
    @Override
    public String toString (){
        return "Your name " + name + ",you age are " + age + ", and remember the most importent you line on the" + wheareYouFrom;
    }
}
