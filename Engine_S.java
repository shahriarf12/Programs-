/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shahriar.ENGINE;

/**
 *
 * @author Fahim
 */

import Shahriar.INTERFACES.*;
public class Engine_S extends ShipEngine implements Specs_Imperial {
	
	public Engine_S(String StarDestroyerType) {
		super("S", StarDestroyerType, engineSpecs_I[0], engineSpecs_I[2], engineSpecs_I[4], engineSpecs_I[6]);
		if(StarDestroyerType == "Imperial_I") {
			this.setLength(engineSpecs_I[0]);
			this.setHeight(engineSpecs_I[2]);
			this.setPower(engineSpecs_I[4]);
			this.setWeight(engineSpecs_I[6]);
		}
		else {
			this.setLength(engineSpecs_II[0]);
			this.setHeight(engineSpecs_II[2]);
			this.setPower(engineSpecs_II[4]);
			this.setWeight(engineSpecs_II[6]);
		}
	}

}
