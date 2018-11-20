package Menue;

import display.Display;
import game.BackGr;

public class Menue {
	
	public static STATES state = STATES.FIRSTMENUE;
	
	public static enum STATES {FIRSTMENUE,MODEMENUE,GAMESPACE,STRATEGYSPACE,PL_RESOURS,PL_INFO,PL_ARMY_ALL,PL_ARMY_ROTATE,PL_ARMY_CREATE,PL_ARMY_BLOCK,STRATEGY_PL_INPUT}
	
	public Menue() {
		
		
		
	}
	
	public void update() {
		
	if (state.equals(STATES.FIRSTMENUE)) {		
	Buttons.firstmenue();
	}
	if (state.equals(STATES.MODEMENUE)) {		
	Buttons.modemenue();			
	}					
	}

}
