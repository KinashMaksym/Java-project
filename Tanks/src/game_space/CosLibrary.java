package game_space;

import display.Display;

public class CosLibrary {
	
	public static boolean[][] next_button = new boolean[12][5];
	
	public static int planet_NOW = -1;
	public static int planet_INPUT;
	
	public static int army_ALL;
	
	public CosLibrary() {
	
	for(int i=0;i<12;i++) {
	next_button[i][0] = true;
	}
	
	}
	
	public static void planet_input(int i) {
		
	for (int j = 0; j < Display.armytype.size(); j++) {
		ArmyType army = Display.armytype.get(j);
			
			
		if(army.getplanet() == CosLibrary.planet_NOW && army.getrotate() == 1) {
			
				army.pl_input_move(i);
				army.rotate_disable();
			
		}
				
	}
		
	planet_INPUT = i;

	}
	
	public static void planets(int i) {
	
	Planets p = Display.planet.get(i);	
	
	planet_NOW = i;
	
	//name
	CosmMenue.planet_name = p.getName();
	
	
	
	}
	
}