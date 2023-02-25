package shahriar.ARMS;

import shahriar.ENUMS.Limb;
import shahriar.ENUMS.Status;
import shahriar.ENUMS.Side;
import shahriar.PAD.LeftFootPad;


public class LeftArm extends Arm {

    private Status LeftArmStatus;
    
    public LeftArm(String serialNumber) {
        super(serialNumber);
        this.setSide(Side.LEFT);
        this.setUpper(Limb.Upper);
        this.setLower(Limb.Lower);
        this.setPad(new LeftFootPad("LFP-1"));
        this.LeftArmStatus = Status.ONLINE;
    }

    public Status getLeftArmStatus() {
        return LeftArmStatus;
    }

    public void setLeftArmStatus(Status LeftArmStatus) {
        this.LeftArmStatus = LeftArmStatus;
    } 
    
    @Override
    public boolean armCheck(){
        if( this.getLeftArmStatus().equals(Status.ONLINE) && this.getPad().equals(Status.ONLINE)){
            return true;
        }
        else{
            this.LeftArmStatus = Status.OFFLINE;
            return false;
        }
    }
}