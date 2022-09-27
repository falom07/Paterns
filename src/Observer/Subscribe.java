package Observer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Subscribe {
    private String nameOfFilm;
    private double rating;
    Map<Client, String> client = new HashMap<>();


    public void addUser(Client clienting, String nameOfFilm) {
        client.put(clienting, nameOfFilm);
    }

    public void removeUser(Client clienting) {
        client.remove(clienting);
    }

    public void addFilm(String nameOfFilm, double rating) {
        for (Client client1 : client.keySet()) {
            if (client.get(client1).equalsIgnoreCase(nameOfFilm)){
                client1.reveiveMassage(nameOfFilm,rating);
            }
        }
    }
}
