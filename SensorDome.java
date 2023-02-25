package shahriar.COMPONENT;

import shahriar.ENUMS.Status;


public class SensorDome {
    
    private String serialNumber;
    private double height;
    private double weight;
    private Status status;

    public SensorDome(String serialNumber) {
        this.serialNumber = serialNumber;
        this.status = Status.ONLINE;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    public boolean sensorDomeCheck(){
        return this.status.equals(Status.ONLINE);
    }   
}
