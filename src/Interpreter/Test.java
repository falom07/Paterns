package Interpreter;

public class Test {
    public static void main(String[] args) {
        //Запитати як вони працюють паралельно
        Interpretate takeAnyDeveloper = getAnyDeveloper();
        Interpretate takeOnlyAllDeveloper = getOneDeveloper();

        System.out.println("У нас есть достоточно разработчиков для этого проекта :" + takeAnyDeveloper.interpretator("Java,Golang,Assambler,Itern"));
        System.out.println("У нас есть достоточно разработчиков для этого проекта :" + takeOnlyAllDeveloper.interpretator("Java,ruby,Go,PHP"));
    }
    static Interpretate getOneDeveloper(){
        Interpretate firstDeveloper = new EquelsDeveloper("Java");
        Interpretate secondDeveloper = new EquelsDeveloper("PHP");

        return new AreDeveloper(firstDeveloper,secondDeveloper);
    }
    static Interpretate getAnyDeveloper(){
        Interpretate firstDeveloper = new EquelsDeveloper("Java");
        Interpretate secondDeveloper = new EquelsDeveloper("PHP");
        return new OrDeveloper(firstDeveloper,secondDeveloper);
    }
}
