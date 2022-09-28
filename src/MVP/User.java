package MVP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    private int password = 123;
    private Scanner scanner =new Scanner(System.in);

    private List<Integer> age = new ArrayList<>();
    private List<String> firstComment = new ArrayList<>();
    private List<String> lastComment = new ArrayList<>();
    private List<Integer> rating = new ArrayList<>();
    public void orderFood(int age){

        System.out.println("Can you say your fist impression: " );
        String firstMaassage = scanner.nextLine();
        System.out.println("Your mell will be ready soon");
        System.out.println("Can apriciate servise from 1 to 10 : ");
        int nubmer = scanner.nextInt();
        System.out.println("What do you want say about us");
        String lastMassage = scanner.nextLine();
        this.age.add(age);
        firstComment.add(firstMaassage);
        lastComment.add(lastMassage);
        rating.add(nubmer);
    }

    public void seaReviews(int password){
        if(password == this.password){
            for(Integer number :age){
                System.out.println(number);
            }
            for(String comment : firstComment){
                System.out.println(comment);
            }
            for(String comment : firstComment){
                System.out.println(comment);
            }
            for(Integer number : rating){
                System.out.println(number);
            }
        }
    }


}
