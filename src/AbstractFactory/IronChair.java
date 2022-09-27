package AbstractFactory;

public class IronChair implements chair{
    @Override
    public void whatDoChair() {
        System.out.println("Я являюсь стульчиком и меня сейчас делают руками из металла ");
    }
}
