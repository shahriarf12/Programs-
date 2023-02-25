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
public class MainDeck extends ShipDeck implements Specs_Imperial {
	
	private ArrayList<LaserCannon> cannonBattery = new ArrayList<>();

	public MainDeck(String StarDestroyerType) {
		super("Main Deck", StarDestroyerType, deckSpecs_I[2], deckSpecs_I[5], deckSpecs_I[8], deckSpecs_I[11]);
		if(StarDestroyerType == "Imperial_I") {
			this.setLength(deckSpecs_I[2]);
			this.setHeight(deckSpecs_I[5]);
			this.setWidth(deckSpecs_I[8]);
			this.setWeight(deckSpecs_I[11]);
		}
		else {
			this.setLength(deckSpecs_II[2]);
			this.setHeight(deckSpecs_II[5]);
			this.setWidth(deckSpecs_II[8]);
			this.setWeight(deckSpecs_II[11]);
		}
		
		for(int i=0; i<5; i++) {
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
