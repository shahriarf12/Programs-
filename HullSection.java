/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shahriar.HULL;

/**
 *
 * @author Fahim
 */
public class HullSection {
    private String HullType;
	private String StarDestroyerType; 
	private int Length;
	private int Height;
	private int Width;
	private int Weight;
	
	public HullSection(String HullType, String StarDestroyerType, int Length, int Height, int Width, int Weight) {
		this.HullType = HullType;
		this.StarDestroyerType = StarDestroyerType;
		this.Length = Length;
		this.Height = Height;
		this.Width = Width;
		this.Weight = Weight;
	}

	public String getHullType() {
		return HullType;
	}

	public void setHullType(String hullType) {
		this.HullType = hullType;
	}

	public String getStarDestroyerType() {
		return StarDestroyerType;
	}

	public void setStarDestroyerType(String starDestroyerType) {
		this.StarDestroyerType = starDestroyerType;
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		this.Length = length;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		this.Height = height;
	}

	public int getWidth() {
		return Width;
	}

	public void setWidth(int width) {
		this.Width = width;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		this.Weight = weight;
	}
}
