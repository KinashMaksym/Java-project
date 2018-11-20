package Menue;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

import display.Display;
import game.BackGr;
import game_space.ArmyType;
import game_space.CosLibrary;
import game_space.CosmMenue;
import game_space.FunctionalSpace;
import game_space.Planets;
import game_space.PlayerPropertis;
import input.Listeners;

public class Buttons {
	
	public static int press = 0;
	public static int icon;
	static int line=0;
	static int light=0;
	
	public Buttons() {

	
		
	}
	
	public static void pl_army_use(int x,int y,int index) {
		
		if (Listeners.x > x && Listeners.x < x+77 && Listeners.y > y && Listeners.y < y+77) {
		if (Listeners.leftMouse) {
		if (press == 0) {
			press = 1;
				
		//CosLibrary.army_info[index][3] = 1;
			
		}
		} else {press=0;}
		}
		
	}
	
	public static void block_army_attack(int id,int x,int y) {
				
	if (Listeners.x > x && Listeners.x < x+75 && Listeners.y > y && Listeners.y < y+75) {
		if (Listeners.leftMouse) {
			if (press == 0) {
			    	press = 1;
			    	
			    	CosmMenue.army_info_attack(id);
			    	FunctionalSpace.Army_Rotate(id);
							
			}
		} else {press=0;}
	}
	
		
	}
	
	public static void str_menue(int c) {
	
	switch(c) {
	case(1):
		
	if (Listeners.x > BackGr.x_BACK+140 && Listeners.x < (BackGr.x_BACK+140)+130 && Listeners.y > (BackGr.y_BACK+700)-110 && Listeners.y < ((BackGr.y_BACK+700)-110)+30) {
	if (Listeners.leftMouse) {
	if (press == 0) {
	press = 1;
		
	Menue.state =  Menue.STATES.PL_INFO;
	
	}
	} else {press=0;}
	}
	break;
	
	case(2):
		
	int length_x = (int) Display.bufferGraphics.getFontMetrics().getStringBounds(CosmMenue.army_progres_massege,Display.bufferGraphics).getWidth();
	int length_y = (int) Display.bufferGraphics.getFontMetrics().getStringBounds(CosmMenue.army_progres_massege,Display.bufferGraphics).getHeight();
	
	if (Listeners.x > (CosmMenue.x+156)-length_x/2 && Listeners.x < (CosmMenue.x+156)+length_x/2 && Listeners.y > (CosmMenue.y+260)-length_y && Listeners.y < CosmMenue.y+260) {
	if (Listeners.leftMouse) {
	if (press == 0) {
		press = 1;		
		
		Menue.state =  Menue.STATES.PL_ARMY_ALL;
		
	}
	} else {press=0;}
	}
	
	if (Listeners.x > CosmMenue.x+534 && Listeners.x < CosmMenue.x+534+51 && Listeners.y > CosmMenue.y+15 && Listeners.y < CosmMenue.y+15+17) {
	if (Listeners.leftMouse) {
	if (press == 0) {
	press = 1;
		
	Menue.state =  Menue.STATES.STRATEGYSPACE;
	
	}
	} else {press=0;}
	}
	
	
	break;
	
	case(3):
	
	if (Listeners.x > CosmMenue.x+325 && Listeners.x < CosmMenue.x+325+200 && Listeners.y > CosmMenue.y+510 && Listeners.y < CosmMenue.y+510+50) {
	if (Listeners.leftMouse) {
	if (press == 0) {
        press = 1;
        
        for(int i=0;i<CosLibrary.army_ALL;i++) {
        	
        	if(Display.armytype.get(i).getplanet() == CosLibrary.planet_NOW && Display.armytype.get(i).getrotate() == 1) {
        		
        		Display.armytype.get(i).move_eneble();
        		
        	}
        	
        }
						
    	Menue.state =  Menue.STATES.STRATEGY_PL_INPUT;
					
	}
	} else {press=0;}
	}
		
	if (Listeners.x > CosmMenue.x+534 && Listeners.x < CosmMenue.x+534+51 && Listeners.y > CosmMenue.y+15 && Listeners.y < CosmMenue.y+15+17) {
	if (Listeners.leftMouse) {
	if (press == 0) {
	    press = 1;
				
	Menue.state =  Menue.STATES.PL_ARMY_ALL;
			
	}
	} else {press=0;}
	}
	break;
	
	case(4):
	
	if (Listeners.x > CosmMenue.x+200 && Listeners.x < CosmMenue.x+400 && Listeners.y > CosmMenue.y+200 && Listeners.y < CosmMenue.y+250) {
	if (Listeners.leftMouse) {
	if (press == 0) {
		press = 1;		
				
		Menue.state =  Menue.STATES.PL_ARMY_CREATE;
		
		//FunctionalSpace.Army_ADD(1, CosLibrary.planet_NOW, CosLibrary.army_ALL);
				
	}
	} else {press=0;}
	}
		
	if (Listeners.x > CosmMenue.x+200 && Listeners.x < CosmMenue.x+400 && Listeners.y > CosmMenue.y+275 && Listeners.y < CosmMenue.y+325) {
	if (Listeners.leftMouse) {
	if (press == 0) {
		press = 1;		
				
		Menue.state =  Menue.STATES.PL_ARMY_ROTATE;
				
	}
	} else {press=0;}
	}
	
	if (Listeners.x > CosmMenue.x+200 && Listeners.x < CosmMenue.x+400 && Listeners.y > CosmMenue.y+350 && Listeners.y < CosmMenue.y+400) {
	if (Listeners.leftMouse) {
	if (press == 0) {
		press = 1;		
				
	Menue.state =  Menue.STATES.PL_ARMY_BLOCK;
				
	}
	} else {press=0;}
	}
	
	if (Listeners.x > CosmMenue.x+534 && Listeners.x < CosmMenue.x+534+51 && Listeners.y > CosmMenue.y+15 && Listeners.y < CosmMenue.y+15+17) {
	if (Listeners.leftMouse) {
	if (press == 0) {
	press = 1;
		
	Menue.state =  Menue.STATES.PL_INFO;
	
	}
	} else {press=0;}
	}
	break;
	
	case(5):
		
	if (Listeners.x > CosmMenue.x+387 && Listeners.x < CosmMenue.x+487 && Listeners.y > CosmMenue.y+145 && Listeners.y < CosmMenue.y+170) {
	if (Listeners.leftMouse) {
	if (press == 0) {
		press = 1;		
			
	FunctionalSpace.Army_ADD(1);
						
	}
	} else {press=0;}
	}
	
	if (Listeners.x > CosmMenue.x+387 && Listeners.x < CosmMenue.x+487 && Listeners.y > CosmMenue.y+265 && Listeners.y < CosmMenue.y+290) {
	if (Listeners.leftMouse) {
	if (press == 0) {
		press = 1;		
				
	FunctionalSpace.Army_ADD(2);
						
	}
	} else {press=0;}
	}
			
	if (Listeners.x > CosmMenue.x+534 && Listeners.x < CosmMenue.x+534+51 && Listeners.y > CosmMenue.y+15 && Listeners.y < CosmMenue.y+15+17) {
	if (Listeners.leftMouse) {
	if (press == 0) {
	    press = 1;
						
	FunctionalSpace.Army_Save();
	    
	Menue.state =  Menue.STATES.PL_ARMY_ALL;
					
	}
	} else {press=0;}
	}		
	break;
	
	case(6):
	
	if (Listeners.x > CosmMenue.x+430 && Listeners.x < CosmMenue.x+430+55 && Listeners.y > CosmMenue.y+68 && Listeners.y < CosmMenue.y+68+55) {
	if (Listeners.leftMouse) {
	if (press == 0) {
		press = 1;
				
	Display.planet.get(CosLibrary.planet_NOW).block_info_up(0);
							
	}
	} else {press=0;}
	}
	
	if (Listeners.x > CosmMenue.x+430 && Listeners.x < CosmMenue.x+430+55 && Listeners.y > CosmMenue.y+188 && Listeners.y < CosmMenue.y+188+55) {
	if (Listeners.leftMouse) {
	if (press == 0) {
		press = 1;
				
	Display.planet.get(CosLibrary.planet_NOW).block_info_up(1);
							
	}
	} else {press=0;}
	}
	
	if (Listeners.x > CosmMenue.x+430 && Listeners.x < CosmMenue.x+430+55 && Listeners.y > CosmMenue.y+308 && Listeners.y < CosmMenue.y+308+55) {
	if (Listeners.leftMouse) {
	if (press == 0) {
		press = 1;
				
	Display.planet.get(CosLibrary.planet_NOW).block_info_up(2);
							
	}
	} else {press=0;}
	}
	
	if (Listeners.x > CosmMenue.x+430 && Listeners.x < CosmMenue.x+430+55 && Listeners.y > CosmMenue.y+428 && Listeners.y < CosmMenue.y+428+55) {
	if (Listeners.leftMouse) {
	if (press == 0) {
		press = 1;
				
	Display.planet.get(CosLibrary.planet_NOW).block_info_up(3);
							
	}
	} else {press=0;}
	}
	
	if (Listeners.x > CosmMenue.x+430 && Listeners.x < CosmMenue.x+430+55 && Listeners.y > CosmMenue.y+68+52 && Listeners.y < CosmMenue.y+68+52+55) {
		if (Listeners.leftMouse) {
		if (press == 0) {
			press = 1;
					
		Display.planet.get(CosLibrary.planet_NOW).block_info_down(0);
								
		}
		} else {press=0;}
		}
		
		if (Listeners.x > CosmMenue.x+430 && Listeners.x < CosmMenue.x+430+55 && Listeners.y > CosmMenue.y+188+52 && Listeners.y < CosmMenue.y+188+52+55) {
		if (Listeners.leftMouse) {
		if (press == 0) {
			press = 1;
					
		Display.planet.get(CosLibrary.planet_NOW).block_info_down(1);
								
		}
		} else {press=0;}
		}
		
		if (Listeners.x > CosmMenue.x+430 && Listeners.x < CosmMenue.x+430+55 && Listeners.y > CosmMenue.y+308+52 && Listeners.y < CosmMenue.y+308+52+55) {
		if (Listeners.leftMouse) {
		if (press == 0) {
			press = 1;
					
		Display.planet.get(CosLibrary.planet_NOW).block_info_down(2);
								
		}
		} else {press=0;}
		}
		
		if (Listeners.x > CosmMenue.x+430 && Listeners.x < CosmMenue.x+430+55 && Listeners.y > CosmMenue.y+428+52 && Listeners.y < CosmMenue.y+428+52+55) {
		if (Listeners.leftMouse) {
		if (press == 0) {
			press = 1;
					
		Display.planet.get(CosLibrary.planet_NOW).block_info_down(3);
								
		}
		} else {press=0;}
		}
	
	if (Listeners.x > CosmMenue.x+534 && Listeners.x < CosmMenue.x+534+51 && Listeners.y > CosmMenue.y+15 && Listeners.y < CosmMenue.y+15+17) {
	if (Listeners.leftMouse) {
	if (press == 0) {
	    press = 1;
						
	Menue.state =  Menue.STATES.PL_ARMY_ALL;
					
	}
	} else {press=0;}
	}	
		
	break;
		
	}
	
	}
	
	public static void firstmenue() {
		
	if (Listeners.x > BackGr.x_ZEROWE + 938 && Listeners.x < BackGr.x_ZEROWE + 984 && Listeners.y > BackGr.y_ZEROWE + 11 && Listeners.y < BackGr.y_ZEROWE + 47) {
	if (Listeners.leftMouse) {
	if (press == 0) {
	press = 1;
	Display.window.dispose();
	
	}
	} else {press=0;}
	}
	
	if (Listeners.x > BackGr.x_ZEROWE + 846 && Listeners.x < BackGr.x_ZEROWE + 899 && Listeners.y > BackGr.y_ZEROWE + 632 && Listeners.y < BackGr.y_ZEROWE + 685) {
	
		if (Listeners.leftMouse) {press = 1;} else {if (press == 1) {
			
			
		System.out.println("магаз");
		
		press = 0;
		}}
	}
	
	if (Listeners.x > BackGr.x_ZEROWE + 918 && Listeners.x < BackGr.x_ZEROWE + 970 && Listeners.y > BackGr.y_ZEROWE + 632 && Listeners.y < BackGr.y_ZEROWE + 685) {
		
		if (Listeners.leftMouse) {press = 1;} else {if (press == 1) {
			
			
		System.out.println("настройки");
		
		
		press = 0;
		}}
	}
	
	if (Listeners.x > BackGr.x_ZEROWE + 24 && Listeners.x < BackGr.x_ZEROWE + 317 && Listeners.y > BackGr.y_ZEROWE + 634 && Listeners.y < BackGr.y_ZEROWE + 687) {
		
		if (Listeners.leftMouse) {press = 1;} else {if (press == 1) {
			
		Menue.state =  Menue.STATES.MODEMENUE;
		
		
		press = 0;
		}}
	}	
	}

	public static void modemenue() {
	
		if (Listeners.x > BackGr.x_ZEROWE + 121 && Listeners.x < BackGr.x_ZEROWE + 285 && Listeners.y > BackGr.y_ZEROWE + 267 && Listeners.y < BackGr.y_ZEROWE + 432) {
			
			if (Listeners.leftMouse) {press = 1;} else {if (press == 1) {
			
			press = 0;
			}}
		}
		if (Listeners.x > BackGr.x_ZEROWE + 319 && Listeners.x < BackGr.x_ZEROWE + 474 && Listeners.y > BackGr.y_ZEROWE + 267 && Listeners.y < BackGr.y_ZEROWE + 432) {
			if (Listeners.leftMouse) {press = 1;} else {if (press == 1) {
				
			Menue.state =  Menue.STATES.STRATEGYSPACE;
			
			for(int i=1;i<11;i++) {
			Display.planet.add(new Planets(i));
			}
			press = 0;
			}}
		}		
		
	}
	
}
