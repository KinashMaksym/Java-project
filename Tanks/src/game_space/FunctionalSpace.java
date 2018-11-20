package game_space;

import display.Display;
import input.Files;

public class FunctionalSpace {

	public static void Army_ADD(int type) {
	
	Display.armytype.add(new ArmyType(type));
			
	CosLibrary.army_ALL++;
	
	}
	
	public static void Army_Save() {
		
	String save = "";
	
	for (int i=0;i<CosLibrary.army_ALL;i++) {
	
	ArmyType p = Display.armytype.get(i);
		
	save += p.gettype() +":"+ p.getplanet() +":"+ p.getmove() +":"+ p.getpl_move() + "\n";
		
	}
	
	Files.file_save("army_info.txt",save);
		
	}
	
	public static void Planet_own_start(int planet) {
		
	PlayerPropertis.Planet_ALL++;
	
	Display.planet.get(planet).player_own(true);
	
	}
	
	public static void planet_use(int planet) {
		
	CosLibrary.planets(planet);
	
	if(PlayerPropertis.Planet_ALL == 0 && CosLibrary.planet_NOW!=0) {FunctionalSpace.Planet_own_start(planet);}
		
	}
	
	public static void Army_Rotate(int id) {
	
		if(Display.armytype.get(id).getrotate() == 0) {
			
		Display.armytype.get(id).rotate_eneble();
		
		} 	
		
		else {Display.armytype.get(id).rotate_eneble();}
	
	}
	
}




