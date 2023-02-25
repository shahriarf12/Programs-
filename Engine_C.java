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

public class Engine_C extends ShipEngine implements Specs_Imperial {
	
	public Engine_C(String StarDestroyerType) {
		super("C", StarDestroyerType, engineSpecs_I[1], engineSpecs_I[3], engineSpecs_I[5], engineSpecs_I[7]);
		if(StarDestroyerType == "Imperial_I") {
			this.setLength(engineSpecs_I[1]);
			this.setHeight(engineSpecs_I[3]);
			this.setPower(engineSpecs_I[5]);
			this.setWeight(engineSpecs_I[7]);
		}
		
		else {
			this.setLength(engineSpecs_II[1]);
			this.setHeight(engineSpecs_II[3]);
			this.setPower(engineSpecs_II[5]);
			this.setWeight(engineSpecs_II[7]);
		}
	}
}
