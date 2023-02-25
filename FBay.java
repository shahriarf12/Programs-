/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shahriar.BAY;

/**
 *
 * @author Fahim
 */
public class FBay extends FighterBay {
    private int Capacity = 96;

	public FBay(String BayName, String BayID) {
		super(BayName, BayID);
		this.setBayType("Tie Fighter S");
		this.setBayID("BS-1");
	}

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
    
    @Override
    public void displayBayInfo(){
        
    }

    @Override
    public void displayTieFighters() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
