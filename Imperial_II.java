/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shahriar.ISD;

/**
 *
 * @author Fahim
 */
public class Imperial_II extends StarDestroyer{
    
    public Imperial_II(String ShpNumber, String ShpName){
        super(ShpNumber, ShpName, "Imperial_II");
        setShpCrew(12000);
    }
    
    public void navigatesToPosition(String p) {
	System.out.println("Navigating to Position " + p);
    }
    
    public void displayImperial_II(){
        
    }
}
