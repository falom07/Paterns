package ChainOfResponsibility;

public abstract class ImplementOfOrder {
    int prioritate;//hi
    public ImplementOfOrder(int prioritate){
        this.prioritate = prioritate;
    }
    ImplementOfOrder next;
    public void setNext(ImplementOfOrder next){
        this.next = next;
    }
    public void cookOrder(String order,int level){
        if(prioritate != level){
            cook(order);
        }
        if(next!=null){
            next.cookOrder(order,level);
        }
    }
    abstract void cook(String order);
}
