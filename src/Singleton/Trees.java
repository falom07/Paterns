package Singleton;

import java.text.SimpleDateFormat;

import java.util.Date;

public class Trees {
    private static Trees oak;
    private static String leafCondition = "Начало:green \n";


    private Trees(){}

    public static Trees getInfo(){
        if(oak == null){
            oak = new Trees();
        }
        return oak;
    }
    public void updateState(String state){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String currentTime = formatter.format(date);
        leafCondition += "Cocтояние на " + currentTime + ": " + state + "\n";
    }
    public void seeInfo(){
        System.out.println(leafCondition);
    }
}
