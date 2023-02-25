/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shahriar.BAY;

/**
 *
 * @author Fahim
 */
public class SBay extends FighterBay {
    private int Capacity = 36;

	public SBay(String BayName, String BayID) {
		super(BayName, BayID);
		this.setBayType("Tie Fighter I");
		this.setBayID("BF-1");	
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
