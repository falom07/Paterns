package Observer;

public class Test {
    public static void main(String[] args) {
        Client client1 = new Client();
        Client client12 = new Client();
        Client client13 = new Client();
        Subscribe subscribe = new Subscribe();
        subscribe.addUser(client1,"Malibu");
        subscribe.addUser(client12,"Malibu");
        subscribe.addUser(client13,"Malibu");
        subscribe.addFilm("Malibu",8.3);
        subscribe.removeUser(client12);
    }
}
