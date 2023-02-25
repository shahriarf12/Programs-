package shahriar.PAD;

import shahriar.ENUMS.Status;
import shahriar.ENUMS.Side;

public class LeftFootPad extends FootPad {

    private Status LeftPadStatus;
    
    public LeftFootPad(String serialNumber) {
        super(serialNumber);
        this.setSide(Side.LEFT);
        this.LeftPadStatus = Status.ONLINE;
    }

    @Override
    public boolean padCheck() {
        if(this.LeftPadStatus.equals(Status.ONLINE)){
            return true;
        }
        else{
            this.LeftPadStatus = Status.OFFLINE;
            return false;
        }
    }   
}
