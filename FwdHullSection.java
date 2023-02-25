/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shahriar.HULL;

/**
 *
 * @author Fahim
 */

import Shahriar.INTERFACES.*;
import Shahriar.BAY.*;

public class FwdHullSection extends HullSection implements Specs_Imperial {
    private FBay fighterBay_FWD;

	public FwdHullSection(String starDestroyerType) {
		super("FWD", starDestroyerType, hullSpecs_I[0], hullSpecs_I[2], hullSpecs_I[4], hullSpecs_I[6]);
		
		if(starDestroyerType.equals("Imperial_I")) {
			this.setLength(hullSpecs_I[0]);
			this.setHeight(hullSpecs_I[2]);
			this.setWidth(hullSpecs_I[4]);
			this.setWeight(hullSpecs_I[6]);
		}
		
		else {
			this.setLength(hullSpecs_II[0]);
			this.setHeight(hullSpecs_II[2]);
			this.setWidth(hullSpecs_II[4]);
			this.setWeight(hullSpecs_II[6]);
		}
		
	
		this.fighterBay_FWD = new FBay("Fighter Bay Forward", "BF-1");
	}

	public FBay getFighterBay_FWD() {
		return fighterBay_FWD;
	}

	public void setFighterBay_FWD(FBay fighterBay_FWD) {
		this.fighterBay_FWD = fighterBay_FWD;
	}
}
