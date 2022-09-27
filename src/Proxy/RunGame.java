package Proxy;

public class RunGame implements LoadTextur{
    private String servise;
    public RunGame(String servise){
        this.servise = servise;
        load();
    }

    public void load(){
        System.out.println("Game loading on servise " + servise);
    }

    @Override
    public void runLoadTexture() {
        System.out.println("Game run in servise " + servise);
    }
}
