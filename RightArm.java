package shahriar.ARMS;

import shahriar.ENUMS.Limb;
import shahriar.ENUMS.Side;
import shahriar.ENUMS.Status;
import shahriar.PAD.LeftFootPad;


public class RightArm extends Arm{
    
    private Status RightArmStatus;
    
    public RightArm(String serialNumber) {
        super(serialNumber);
        this.setSide(Side.RIGHT);
        this.setUpper(Limb.Upper);
        this.setLower(Limb.Lower);
        this.setPad(new LeftFootPad("RFP-2"));
        this.RightArmStatus = Status.ONLINE;
    }

    public Status getRightArmStatus() {
        return RightArmStatus;
    }

    public void setRightArmStatus(Status RightArmStatus) {
        this.RightArmStatus = RightArmStatus;
    } 
    
    @Override
    public boolean armCheck(){
        if( this.getRightArmStatus().equals(Status.ONLINE) && this.getPad().equals(Status.ONLINE)){
            return true;
        }
        else{
            this.RightArmStatus = Status.OFFLINE;
            return false;
        }
    }
}
