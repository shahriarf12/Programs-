package shahriar.DROID;

import shahriar.ENUMS.Status;
import shahriar.ENUMS.Battery;
import shahriar.COMPONENT.Chasis;
import shahriar.COMPONENT.SensorDome;
import shahriar.ARMS.RightArm;
import shahriar.ARMS.LeftArm;


public class R3 extends AstromechDroid {
    
    private Status R3Status;
    private Battery R3Battery;

        
    public R3(String serialNumber){
        super(serialNumber);
        this.R3Status = Status.ONLINE;
        this.R3Battery = Battery.R3;
        this.setDome(new SensorDome(serialNumber));
        this.setChasis(new Chasis(serialNumber));
        this.getDome().setHeight(2); this.getDome().setWeight(200);
        this.getChasis().setHeight(4); this.getDome().setWeight(400);
        this.setLeftArm(new LeftArm("LA-01"));
        this.setRightArm(new RightArm("RA-02"));
        
    }

    public Status getR3Status() {
        return R3Status;
    }

    public void setR3Status(Status R3Status) {
        this.R3Status = R3Status;
    }

    public Battery getR3Battery() {
        return R3Battery;
    }

    public void setR3Battery(Battery R3Battery) {
        this.R3Battery = R3Battery;
    }    

    @Override
    public void checkStatus() {
        Status ds = this.getDome().getStatus();
        Status cs = this.getChasis().getStatus();
        Status la = this.getLeftArm().getLeftArmStatus();
        Status ra = this.getRightArm().getRightArmStatus();
        if(ds.equals(Status.ONLINE) && cs.equals(Status.ONLINE) && la.equals(Status.ONLINE)
                && ra.equals(Status.ONLINE)){
            this.setR3Status(Status.ONLINE);
            System.out.println("R3 Astromech is ONLINE");
        }
        else{
            this.setR3Status(Status.OFFLINE);
            System.out.println("R3 Astromech is OFFLINE");
        }
    }

    @Override
    public void displayDroid() {
        System.out.println("R3 Astromech");
        System.out.println("Serial Number: " + this.getSerialNumber());
        System.out.println("Status: " + this.getR3Status().toString());
        System.out.println("Battery: " + this.getR3Battery().getType());
        System.out.println("Sensor Dome Serial Number " + this.getDome().getSerialNumber());
        System.out.println("Chasis Serial Number " + this.getChasis().getSerialNumber());
        System.out.println("Left Arm Serial Number " + this.getLeftArm().getSerialNumber());
        System.out.println("Right Arm SerialNumber " + this.getRightArm().getSerialNumber());
        System.out.println();
    }

    public String dataString() {
        String S = "('" + getSerialNumber() + "," + "'R3," + "'" + this.getR3Status().toString() + "','Fahim')";
        return S;
    }
}
