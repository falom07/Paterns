package State;

public class TV {
    private Channel stateOfChennel;
    private void setStateOfChennel(Channel stateOfChennel){
        this.stateOfChennel = stateOfChennel;
    }

    public TV(Channel stateOfChenbnel) {
        this.stateOfChennel = stateOfChenbnel;
    }

    void changeChennel(){
        if( stateOfChennel instanceof TnT){
            setStateOfChennel(new MusicChanel());
        }else if(stateOfChennel instanceof MusicChanel){
            setStateOfChennel(new OnePlusOne());
        }else if(stateOfChennel instanceof OnePlusOne){
            setStateOfChennel(new TnT());
        }
        stateOfChennel.active();
    }
}
