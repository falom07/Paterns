package Interpreter;

public class AreDeveloper implements Interpretate{
    Interpretate languge1;
    Interpretate languge2;

    public AreDeveloper(Interpretate languge1, Interpretate languge2) {
        this.languge1 = languge1;
        this.languge2 = languge2;
    }

    @Override
    public boolean interpretator(String context) {
        return languge1.interpretator(context) && languge2.interpretator(context);
    }
}
