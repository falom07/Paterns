package Builder;

public class SetBuild {
    double diameter;
    int area;
    MatirialOfDesk matirial;

    public void setArea(int area){
        this.area = area;
    }
    public void setMatirial(MatirialOfDesk matirial){
        this.matirial = matirial;
    }
    public  void setDiameter(double diameter){
        this.diameter= diameter;
    }
    public String toString(){
        return "Диаметр ножок : " + diameter + " Площа стола: " + area + " и материал из которого сделан стол являетьяся: " + matirial;
    }


}
