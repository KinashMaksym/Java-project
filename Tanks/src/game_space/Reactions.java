package game_space;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import Menue.Menue;
import Menue.Menue.STATES;
import display.Display;
import input.Listeners;
import main.Main;

public class Reactions {
	
	int press;
	
	public Reactions() {}
	
	public void planet(Graphics2D g) {
		
		for (int i = 0; i < Display.planet.size(); i++) {
			Planets p = Display.planet.get(i);
			double sx = p.getX();
			double sy = p.getY();
				double px = Listeners.x;
				double py = Listeners.y;
				double dx = sx - px;
				double dy = sy - py;
				double dist = Math.sqrt(dx *dx + dy * dy);
				
				if ((int)dist <= p.getr() +1 && CosLibrary.planet_NOW != 0) {
				if (Listeners.leftMouse) {if (press == 0) {
				press = 1;
				
				if(p.get_pl_own() == true || PlayerPropertis.Planet_ALL == 0) {
				
				FunctionalSpace.planet_use(i);
				CosmMenue.planet_info();
				if(PlayerPropertis.Planet_ALL == 0 && CosLibrary.planet_NOW!=0) {FunctionalSpace.Planet_own_start(i);}
				
				} else {g.drawString("Невідома планета",Main.width/2,Main.height/2);}
				
				}
				} else {press=0;}
				}
				
				
				}
				

	}

	public void planet_input(Graphics2D g) {
		
		for (int i = 0; i < Display.planet.size(); i++) {
			Planets p = Display.planet.get(i);
			double sx = p.getX();
			double sy = p.getY();
				double px = Listeners.x;
				double py = Listeners.y;
				double dx = sx - px;
				double dy = sy - py;
				double dist = Math.sqrt(dx *dx + dy * dy);
				
				if ((int)dist <= p.getr() +1  && CosLibrary.planet_NOW != i) {
				if (Listeners.leftMouse) {if (press == 0) {
				press = 1;
				
				CosLibrary.planet_input(i);
				
				Menue.state =  Menue.STATES.STRATEGYSPACE;
				}
				} else {press=0;}
				}
				
		}
	}
}
