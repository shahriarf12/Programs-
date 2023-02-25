/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shahriar.ENGINE;

/**
 *
 * @author Fahim
 */
public class Engine {
    private String IDNumber;
	private ShipEngine[] Engines = new ShipEngine[3];
	
	public Engine(String IDNumber, String StarDestroyerType) {
		this.IDNumber = IDNumber;
		this.Engines[0] = new Engine_S(StarDestroyerType);
		this.Engines[1] = new Engine_C(StarDestroyerType);
		this.Engines[2] = new Engine_S(StarDestroyerType);
		
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public ShipEngine[] getEngines() {
		return Engines;
	}

	public void setEngines(ShipEngine[] engines) {
		Engines = engines;
	}
    
    public void displayEngineSpecs(){
        
    }
}
