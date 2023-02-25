/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shahriar.BAY;

/**
 *
 * @author Fahim
 */
public class PBay extends FighterBay {
    private int Capacity = 48;

	public PBay(String BayName, String BayID) {
		super(BayName, BayID);
		this.setBayType("Tie Fighter H");
		
	}
	

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
    
    @Override
    public void displayTieFighters(){
        
    }
    
    @Override
    public void displayBayInfo(){
        
    }
}
