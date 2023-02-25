/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Shahriar.ENUMS;

/**
 *
 * @author Fahim
 */
public enum TieFighter {
    TieFighter_S("Standard Fighter",15,5,"NOT READY"), TieFighter_H("Heavy Fighter",20,7,"NOT READY"), TieFighter_I("Stealth Fighter",10,6,"NOT READY");
    
    private String TF_type;
    private double TF_length;
    private double TF_width;
    private String TF_status;

    private TieFighter(String TF_type, double TF_length, double TF_width, String TF_status) {
        this.TF_type = TF_type;
        this.TF_length = TF_length;
        this.TF_width = TF_width;
        this.TF_status = TF_status;
    }

    public String getTF_type() {
        return TF_type;
    }

    public void setTF_type(String TF_type) {
        this.TF_type = TF_type;
    }

    public double getTF_length() {
        return TF_length;
    }

    public void setTF_length(double TF_length) {
        this.TF_length = TF_length;
    }

    public double getTF_width() {
        return TF_width;
    }

    public void setTF_width(double TF_width) {
        this.TF_width = TF_width;
    }

    public String getTF_status() {
        return TF_status;
    }

    public void setTF_status(String TF_status) {
        this.TF_status = TF_status;
    }
    
    public void ready(){
        
    }
    
    public void display(){
        
    }
}
