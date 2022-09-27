package Sratagy;

public class Test {
    public static void main(String[] args) {
        FightActiviti fightActiviti = new FightActiviti();

        Active active = fightActiviti.changeGun("руки");
        fightActiviti.takeGun(active);

        Active active1 = fightActiviti.changeGun("оружые");
        fightActiviti.takeGun(active1);

        Active active2 = fightActiviti.changeGun("кваказябра");
        fightActiviti.takeGun(active2);

    }
}
