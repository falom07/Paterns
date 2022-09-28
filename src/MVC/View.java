package MVC;

public class View {
    public void start(){
        System.out.println("Перед вами головна сторінка сайту\n");
    }
    public void nextPages(){
        System.out.println("Перед вами висвітилася сторінка яку ви щойно вибрали\n");
    }
    public void previousPages(){
        System.out.println("Перед вами висвітилася сторінка з якою ви контактували ввостаннє\n");
    }
    public void exits(){
        System.out.println("Перед вами більше немає вікон з данного сайту,ви вийщли з сайту\n");
    }
}