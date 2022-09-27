package Facade.BuisnessLogic;

public class ExistanceCheckListForBook {
    private boolean listOfPaper =false;
    private boolean ink = false;
    private boolean cover = false;
    private double amountInkLiter = 12;
    private int amountListOfPaper = 2000;
    private int amountCover = 200;
    public boolean checkPreateMaterial(){
        if(amountListOfPaper < 900) {
            listOfPaper = false;
        }
        if(amountCover <150){
            cover = false;
        }
        if (amountInkLiter < 10){
            ink = false;

        }
        if(amountCover > 150 && amountInkLiter > 10 && amountListOfPaper >900){
            amountInkLiter -= 10;
            amountCover -= 150;
            amountListOfPaper -= 900;
            listOfPaper =true;
            ink = true;
            cover = true;

        }

        return listOfPaper && ink && cover;
    }

}
