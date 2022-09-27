package Prototype;

public class CopyClan {
    Clan object;
    public CopyClan(Clan object){
        this.object = object;
    }
    public Copy clone(){
        return (Copy) object.copy();
    }
}
