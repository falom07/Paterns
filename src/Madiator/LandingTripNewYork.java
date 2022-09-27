package Madiator;

import java.util.ArrayList;
import java.util.List;

public class LandingTripNewYork implements LandingStrip{
    private Dispecher dispecher;
    List<PeopleOnAirDrom> userOfAirDrom = new ArrayList<>();
    public void addPlane(Plane plane){
        userOfAirDrom.add(plane);
    }
    public void addDispecher(Dispecher dispecher){
        userOfAirDrom.add(dispecher);
   }

    @Override
    public void sendMassage(String massage, PeopleOnAirDrom peopleOnAirDrom) {
        for(PeopleOnAirDrom people : userOfAirDrom){
            if(people != peopleOnAirDrom){
                people.getMassage(massage);
            }
        }
    }
}
