package shahriar.DROID;

import shahriar.ARMS.LeftArm;
import shahriar.ARMS.RightArm;
import shahriar.COMPONENT.Chasis;
import shahriar.COMPONENT.SensorDome;
import shahriar.ENUMS.Battery;
import shahriar.ENUMS.Status;

public class R4 extends AstromechDroid {
    
    private Status R4Status;
    private Battery R4Battery;

        
    public R4(String serialNumber){
        super(serialNumber);
        this.R4Status = Status.ONLINE;
        this.R4Battery = Battery.R4;
        this.setDome(new SensorDome(serialNumber));
        this.setChasis(new Chasis(serialNumber));
        this.getDome().setHeight(2); this.getDome().setWeight(150);
        this.getChasis().setHeight(5); this.getDome().setWeight(500);
        this.setLeftArm(new LeftArm("LA-01"));
        this.setRightArm(new RightArm("RA-02"));         
    }

    public Status getR4Status() {
        return R4Status;
    }

    public void setR4Status(Status R4Status) {
        this.R4Status = R4Status;
    }

    public Battery getR4Battery() {
        return R4Battery;
    }

    public void setR4Battery(Battery R4Battery) {
        this.R4Battery = R4Battery;
    }

   @Override
    public void checkStatus() {
        Status ds = this.getDome().getStatus();
        Status cs = this.getChasis().getStatus();
        Status la = this.getLeftArm().getLeftArmStatus();
        Status ra = this.getRightArm().getRightArmStatus();
        if(ds.equals(Status.ONLINE) && cs.equals(Status.ONLINE) && la.equals(Status.ONLINE)
                && ra.equals(Status.ONLINE)){
            this.setR4Status(Status.ONLINE);
            System.out.println("R4 Astromech is ONLINE");
        }
        else{
            this.setR4Status(Status.OFFLINE);
            System.out.println("R4 Astromech is OFFLINE");
        }
    }

    @Override
    public void displayDroid() {
        System.out.println("R4 Astromech");
        System.out.println("Serial Number: " + this.getSerialNumber());
        System.out.println("Status: " + this.getR4Status().toString());
        System.out.println("Battery: " + this.getR4Battery().getType());
        System.out.println("Sensor Dome Serial Number " + this.getDome().getSerialNumber());
        System.out.println("Chasis Serial Number " + this.getChasis().getSerialNumber());
        System.out.println("Left Arm Serial Number " + this.getLeftArm().getSerialNumber());
        System.out.println("Right Arm SerialNumber " + this.getRightArm().getSerialNumber());
        System.out.println();
    }
    
    public String dataString() {
        String S = "('" + getSerialNumber() + "," + "'R4," + "'" + this.getR4Status().toString() + "','Fahim')";
        return S;
    }
}
