package Memento;

public class Test {
    public static void main(String[] args) {
        Game game = new Game();
        File file = new File();

        game.relodeStan(12,"Полтава");  file.setSave(game.save());
        game.relodeStan(14,"Київ");  file.setSave(game.save());
        game.relodeStan(16,"Миколаїв");  file.setSave(game.save());
        game.relodeStan(19,"Харків");  file.setSave(game.save());
        game.relodeStan(22,"Маріуполь");  file.setSave(game.save());
        game.relodeStan(110,"Закарпаття");  file.setSave(game.save());
        game.relodeStan(130,"поховали в Львові");
            System.out.println(game);
        game.load(file.getSave(1));
        System.out.println(game);
            game.load(file.getLastSave());
            System.out.println(game);

    }
}
