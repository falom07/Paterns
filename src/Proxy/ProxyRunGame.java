package Proxy;

public class ProxyRunGame implements LoadTextur{

    private RunGame RunGame;
    private String servise;

    public ProxyRunGame(String servise){
        this.servise = servise;
    }

    @Override
    public void runLoadTexture() {
        if(RunGame == null){
            RunGame = new RunGame(servise);
        } RunGame.runLoadTexture();


    }
}
