package Adapter;

public class AdapterPdfDog extends PdfFile implements DogFile{
    public void  reading(){
        reade();
    }
    public void seing(){
        see();
    }
    public void deleting(){
        delete();
    }
}
