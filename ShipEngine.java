/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shahriar.ENGINE;

/**
 *
 * @author Fahim
 */
public abstract class ShipEngine {
    private String EngineType;
	private String StarDestroyerType;
	private int Length;
	private int Height;
	private int Power;
	private int Weight;
	
	public ShipEngine(String EngineType, String StarDestroyerType, int Length, int Height, int Power, int Weight) {
		this.EngineType = EngineType;
		this.StarDestroyerType = StarDestroyerType;
		this.Length = Length;
		this.Height = Height;
		this.Power = Power;
		this.Weight = Weight;
	}

	public String getEngineType() {
		return EngineType;
	}

	public void setEngineType(String engineType) {
		EngineType = engineType;
	}

	public String getStarDestroyerType() {
		return StarDestroyerType;
	}

	public void setStarDestroyerType(String starDestroyerType) {
		StarDestroyerType = starDestroyerType;
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	public int getPower() {
		return Power;
	}

	public void setPower(int power) {
		Power = power;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		Weight = weight;
	}
}
