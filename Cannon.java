/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shahriar.ARMAMENT;

/**
 *
 * @author Fahim
 */
public abstract class Cannon {
    private String cannonType;
	private int range;
	
	public Cannon(String cannonType, int range) {
		this.cannonType = cannonType;
		this.range = range;
	}

	public String getCannonType() {
		return cannonType;
	}

	public void setCannonType(String cannonType) {
		this.cannonType = cannonType;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}
}
