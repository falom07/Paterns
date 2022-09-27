import Observer.Client;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        OK okk =new OK(12,"sfds");
        OK okkk = new OK(1234,"fasa");
        List<OK> o = new ArrayList<>();
        o.add(okk);
        o.add(okkk);
        System.out.println(o.get(0));
        System.out.println(o.get(1));


    }

}

