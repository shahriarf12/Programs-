/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shahriar.HULL;

import Shahriar.BAY.*;
import Shahriar.INTERFACES.*;

/**
 *
 * @author Fahim
 */
public class AftHullSection extends HullSection implements Specs_Imperial{
    private PBay fighterBay_PORT;
    private SBay fighterBay_STARBOARD;

    public AftHullSection(String starDestroyerType) {
            super("AFT", starDestroyerType, hullSpecs_I[1], hullSpecs_I[3], hullSpecs_I[5], hullSpecs_I[7]);
            if(starDestroyerType.equals("Imperial_I")) {
                    this.setLength(hullSpecs_I[1]);
                    this.setHeight(hullSpecs_I[3]);
                    this.setWidth(hullSpecs_I[5]);
                    this.setWeight(hullSpecs_I[7]);
            }	
            else {
                    this.setLength(hullSpecs_II[1]);
                    this.setHeight(hullSpecs_II[3]);
                    this.setWidth(hullSpecs_II[5]);
                    this.setWeight(hullSpecs_II[7]);
            }
		
            this.fighterBay_PORT = new PBay("Port Fighter Bay", "BP-1");
            this.fighterBay_STARBOARD = new SBay("Starboard Fighter Bay", "BS-1");
        }

	public PBay getFighterBay_PORT() {
		return fighterBay_PORT;
	}

	public void setFighterBay_PORT(PBay fighterBay_PORT) {
		this.fighterBay_PORT = fighterBay_PORT;
	}

	public SBay getFighterBay_STARBOARD() {
		return fighterBay_STARBOARD;
	}

	public void setFighterBay_STARBOARD(SBay fighterBay_STARBOARD) {
		this.fighterBay_STARBOARD = fighterBay_STARBOARD;
	}
}
