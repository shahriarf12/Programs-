package shahriar.PAD;

import shahriar.ENUMS.Side;
import shahriar.ENUMS.Status;


public class RightFootPad extends FootPad {
    
    private Status RightPadStatus;
    
    public RightFootPad(String serialNumber) {
        super(serialNumber);
        this.setSide(Side.RIGHT);
        this.RightPadStatus = Status.ONLINE;
    }

    @Override
    public boolean padCheck() {
        if(this.RightPadStatus.equals(Status.ONLINE)){
            return true;
        }
        else{
            this.RightPadStatus = Status.OFFLINE;
            return false;
        }
    }     
}
