/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shahriar_imperialstar;

/**
 *
 * @author Fahim
 */

import Shahriar.ISD.*;
import Shahriar.ENUMS.*;

public class Shahriar_ImperialStar {
    public static void main(String[] args) {
		
		StarDestroyer ISD1 = new Imperial_I("ISD-001", "Avenger");
		StarDestroyer ISD2 = new Imperial_II("ISD-002", "Devastator");
		
		ISD1.displayShipInfo();
		
		System.out.println();
		System.out.println("<---Adding 20 fighters to each fighter bay--->");
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i = 0; i<20; i++) {
			ISD2.getShpHulls().getSectionFwd().getFighterBay_FWD().getSlots().add(TieFighter.TieFighter_S);
			ISD2.getShpHulls().getSectionAft().getFighterBay_PORT().getSlots().add(TieFighter.TieFighter_H);
			ISD2.getShpHulls().getSectionAft().getFighterBay_STARBOARD().getSlots().add(TieFighter.TieFighter_I);
		}
		
		ISD2.displayShipInfo();
	}   
}
