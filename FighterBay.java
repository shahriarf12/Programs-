/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shahriar.BAY;

import Shahriar.ENUMS.TieFighter;
import java.util.ArrayList;

/**
 *
 * @author Fahim
 */
public abstract class FighterBay extends Bay{
    private ArrayList<TieFighter> slots = new ArrayList<TieFighter>();
	

	public FighterBay(String BayName, String BayID) {
		super(BayName, BayID);
		this.setBayType("Tie Fighter");
	}	
	
	
	public ArrayList<TieFighter> getSlots() {
		return slots;
	}
	
	public void setSlots(ArrayList<TieFighter> slots) {
		this.slots = slots;
	}
    
    public abstract void displayTieFighters();
}
