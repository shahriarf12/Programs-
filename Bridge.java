/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shahriar.DECK;

import Shahriar.ARMAMENT.LaserCannon;
import java.util.ArrayList;
import Shahriar.INTERFACES.*;

/**
 *
 * @author Fahim
 */
public class Bridge extends ShipDeck implements Specs_Imperial {
	
	private ArrayList<LaserCannon> cannonBattery = new ArrayList<>();

	public Bridge(String StarDestroyerType) {
		super("Bridge", StarDestroyerType, deckSpecs_I[0], deckSpecs_I[3], deckSpecs_I[6], deckSpecs_I[9]);
		if(StarDestroyerType == "Imperial_I") {
			this.setLength(deckSpecs_I[0]);
			this.setHeight(deckSpecs_I[3]);
			this.setWidth(deckSpecs_I[6]);
			this.setWeight(deckSpecs_I[9]);
		}
		else {
			this.setLength(deckSpecs_II[0]);
			this.setHeight(deckSpecs_II[3]);
			this.setWidth(deckSpecs_II[6]);
			this.setWeight(deckSpecs_II[9]);
		}
		for(int i=0; i<10; i++) {
			this.cannonBattery.add(new LaserCannon());
		}
		
		}
	

	public ArrayList<LaserCannon> getCannonBattery() {
		return cannonBattery;
	}

	public void setCannonBattery(ArrayList<LaserCannon> cannonBattery) {
		this.cannonBattery = cannonBattery;
	}

}
