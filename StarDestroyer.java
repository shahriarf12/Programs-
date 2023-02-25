/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shahriar.ISD;

import Shahriar.DECK.*;
import Shahriar.ENGINE.*;
import Shahriar.ENUMS.TieFighter;
import Shahriar.HULL.*;
import Shahriar.INTERFACES.*;
import java.util.Collections;

/**
 *
 * @author Fahim
 */
public abstract class StarDestroyer implements Maneuvers{
    private String ShpNumber;
	private String ShpType = "Star Destroyer";
	private String ShpName;
	private String ShpClass;
	private int ShpCrew;
	private Hull ShpHulls;
	private Deck ShpDecks;
	private Engine ShpEngines; 
	
	public StarDestroyer(String ShpNumber, String ShpName, String ShpClass) {
		
		this.ShpNumber = ShpNumber;
		this.ShpName = ShpName;
		this.ShpClass = ShpClass;
		this.ShpHulls 	= new Hull("H1", ShpClass);
		this.ShpDecks 	= new Deck("D1", ShpClass);
		this.ShpEngines = new Engine("E1", ShpClass);
	}
		

	public String getShpNumber() {
		return ShpNumber;
	}

	public void setShpNumber(String shpNumber) {
		ShpNumber = shpNumber;
	}

	public String getShpType() {
		return ShpType;
	}

	public void setShpType(String shpType) {
		ShpType = shpType;
	}

	public String getShpName() {
		return ShpName;
	}

	public void setShpName(String shpName) {
		ShpName = shpName;
	}

	public String getShpClass() {
		return ShpClass;
	}

	public void setShpClass(String shpClass) {
		ShpClass = shpClass;
	}

	public int getShpCrew() {
		return ShpCrew;
	}

	public void setShpCrew(int shpCrew) {
		ShpCrew = shpCrew;
	}

	public Hull getShpHulls() {
		return ShpHulls;
	}

	public void setShpHulls(Hull shpHulls) {
		ShpHulls = shpHulls;
	}

	public Deck getShpDecks() {
		return ShpDecks;
	}

	public void setShpDecks(Deck shpDecks) {
		ShpDecks = shpDecks;
	}

	public Engine getShpEngines() {
		return ShpEngines;
	}

	public void setShpEngines(Engine shpEngines) {
		ShpEngines = shpEngines;
	}
	
	public void displayShipInfo() {
		System.out.printf("%1s%-13s%1s%1s%1s%-16s%1s%1s%1s%1s","Ship Number: " , getShpNumber() 
						  , "Ship Type: " , getShpType()
						  , "\nShip Name " , getShpName() 
						  , "Ship Class:  " , getShpClass()
						  , "\nShip Crew: " , getShpCrew());
		System.out.println("\n*********HULL*********");
		System.out.println("Aft"
				+ "\nLength: " + getShpHulls().getSectionAft().getLength() + " m"
				+ "   Height: " + getShpHulls().getSectionAft().getHeight() + " m"
				+ "   Width: " + getShpHulls().getSectionAft().getWidth() + " m"
				+ "   Weight: " + getShpHulls().getSectionAft().getWeight() + " m");
		System.out.println("Fwd"
				+ "\nLength: " + getShpHulls().getSectionFwd().getLength() + " m"
				+ "   Height: " + getShpHulls().getSectionFwd().getHeight() + " m"
				+ "   Width: " + getShpHulls().getSectionFwd().getWidth() + " m"
				+ "    Weight: " + getShpHulls().getSectionFwd().getWeight() + " m");
		System.out.println("*********DECK*********");
		System.out.println("Bridge"
				+ "\nLength: " + getShpDecks().getDeck_Bridge().getLength() + " m"
				+ "   Height: " + getShpDecks().getDeck_Bridge().getHeight() + " m"
				+ "    Width: " + getShpDecks().getDeck_Bridge().getWidth() + " m"
				+ "   Weight: " + getShpDecks().getDeck_Bridge().getWeight() + " m"
				+ "\nCannons: " + getShpDecks().getDeck_Bridge().getCannonBattery().size() + " Laser Cannons");
		System.out.println("Top Deck"
				+ "\nLength: " + getShpDecks().getDeck_Top().getLength() + " m"
				+ "   Height: " + getShpDecks().getDeck_Top().getHeight() + " m"
				+ "    Width: " + getShpDecks().getDeck_Top().getWidth() + " m"
				+ "   Weight: " + getShpDecks().getDeck_Top().getWeight() + " m"
				+ "\nCannons: " + getShpDecks().getDeck_Top().getCannonBattery().size() + " Laser Cannons");
		System.out.println("Main Deck"
				+ "\nLength: " + getShpDecks().getDeck_Main().getLength() + " m"
				+ "   Height: " + getShpDecks().getDeck_Main().getHeight() + " m"
				+ "    Width: " + getShpDecks().getDeck_Main().getWidth() + " m"
				+ "   Weight: " + getShpDecks().getDeck_Main().getWeight() + " m"
				+ "\nCannons: "+ getShpDecks().getDeck_Main().getCannonBattery().size() + " Heavy Laser Cannons");
		System.out.print("*********ENGINES*********");
		for(ShipEngine e: getShpEngines().getEngines()) {
			System.out.printf("%n%1s%1s%1s%-7s%1s%1s%-9s%1s%-9s%1s%15s%1s%1s",e.getEngineType()
					, "\nLength: " , e.getLength() , " m"
					, "Height: " , e.getHeight(), " m"
					, "Power: " , e.getPower() , "ISO"
					, "Weight: " , e.getWeight() , " tons");
		}
		System.out.println("\n*********FIGHTER BAYS*********");
		int x = Collections.frequency(getShpHulls().getSectionAft().getFighterBay_PORT().getSlots(), TieFighter.TieFighter_H);
		int y = Collections.frequency(getShpHulls().getSectionAft().getFighterBay_STARBOARD().getSlots(), TieFighter.TieFighter_I);
		int z = Collections.frequency(getShpHulls().getSectionFwd().getFighterBay_FWD().getSlots(), TieFighter.TieFighter_S);
		System.out.println("Name: " + getShpHulls().getSectionAft().getFighterBay_PORT().getBayName() 
				+ "         ID: " + getShpHulls().getSectionAft().getFighterBay_PORT().getBayID()  
				+ "    Fighters: " + x + " Fighters Present");
		System.out.println("Name: " + getShpHulls().getSectionAft().getFighterBay_STARBOARD().getBayName() 
				+ "    ID: " + getShpHulls().getSectionAft().getFighterBay_STARBOARD().getBayID()  
				+ "    Fighters: " + y + " Fighters Present");
		System.out.println("Name: " + getShpHulls().getSectionFwd().getFighterBay_FWD().getBayName() 
				+ "      ID: " + getShpHulls().getSectionFwd().getFighterBay_FWD().getBayID()  
				+ "    Fighters: " + z + " Fighters Present");
		System.out.println();
		System.out.println();
	}
}
