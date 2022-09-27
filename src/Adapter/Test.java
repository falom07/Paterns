package Adapter;

public class Test {
    public static void main(String[] args) {
        DogFile file = new AdapterPdfDog();
        file.deleting();
        file.seing();
    }
}
