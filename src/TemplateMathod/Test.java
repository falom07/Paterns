package TemplateMathod;

public class Test {
    public static void main(String[] args) {
        Movement human = new Human();
        Movement bird = new Bird();
        Movement ork = new Ork();
        Movement pelica = new Pelican();

        human.move("human");
        ork.move("ork");
        bird.move("bird");
        pelica.move("pelican");

    }
}
