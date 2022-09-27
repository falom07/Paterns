package Sratagy;

public class FightActiviti {
    public Active changeGun(String gun){
        if(gun.equalsIgnoreCase("руки")){
            return new FightWithArms();
        }else if(gun.equalsIgnoreCase("оружые")){
            return new FightWithGun();
        } else if (gun.equalsIgnoreCase("меч")) {
            return new FightWIthSword();
        }else{
            return new WithOut();
        }
    }
    public void takeGun(Active active){
        active.active();
    }
}
