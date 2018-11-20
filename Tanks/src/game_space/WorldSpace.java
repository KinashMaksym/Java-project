package game_space;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import display.Display;
import game.BackGr;
import main.Main;

public class WorldSpace {
	
	public static int r_ORBITY_1;
	public static int r_ORBITY_2;
	public static int r_ORBITY_3;
	public static int r_ORBITY_4;
	
	public static int r_ORBITY_1_standart = 150;
	public static int r_ORBITY_2_standart = 300;
	public static int r_ORBITY_3_standart = 450;
	public static int r_ORBITY_4_standart = 600;
	
	public static int center_x = Main.width/2;
	public static int center_y = Main.height/2;
	
	public WorldSpace() {
		
	r_ORBITY_1 = 150;
	r_ORBITY_2 = 300;
	r_ORBITY_3 = 450;
	r_ORBITY_4 = 600;	
	
	}
	
	public void draw(Graphics2D g,int width,int height) {
		
	g.setColor(Color.WHITE);
	g.drawOval(center_x-r_ORBITY_1/2, center_y-r_ORBITY_1/2, r_ORBITY_1, r_ORBITY_1);
	g.drawOval(center_x-r_ORBITY_2/2, center_y-r_ORBITY_2/2, r_ORBITY_2, r_ORBITY_2);
	g.drawOval(center_x-r_ORBITY_3/2, center_y-r_ORBITY_3/2, r_ORBITY_3, r_ORBITY_3);
	g.drawOval(center_x-r_ORBITY_4/2, center_y-r_ORBITY_4/2, r_ORBITY_4, r_ORBITY_4);
	
	}
	
	public static void center() {
		
	if (Display.input.getKey(KeyEvent.VK_LEFT)) {
	
	center_x --;
	
	}
	
	if (Display.input.getKey(KeyEvent.VK_RIGHT)) {
		
	center_x ++;
	
	}
	
	for(int i=0;i<10;i++) {
	
	Display.planet.get(i).center(center_x,center_y);
	
	}
	
	}
	
	public static void orbit_size() {
		
	if (Display.input.getKey(KeyEvent.VK_UP) && BackGr.linza!=1000) {
	r_ORBITY_1 += 10*(r_ORBITY_1_standart/100);
	r_ORBITY_2 += 10*(r_ORBITY_2_standart/100);
	r_ORBITY_3 += 10*(r_ORBITY_3_standart/100);
	r_ORBITY_4 += 10*(r_ORBITY_4_standart/100);
	
	for(int i=0;i<10;i++) {
	
	if(i==0) {Display.planet.get(i).pl_r_UP(2);}
	
	if(i>0 && i<3) {Display.planet.get(i).pl_r_UP(1+r_ORBITY_1_standart/100);}
	
	if(i>2 && i<6) {Display.planet.get(i).pl_r_UP(1+r_ORBITY_2_standart/100);}
	
	if(i>5 && i<8) {Display.planet.get(i).pl_r_UP(1+r_ORBITY_3_standart/100);}
	
	if(i>7 && i<10) {Display.planet.get(i).pl_r_UP(1+r_ORBITY_4_standart/100);}
		
	}
	
	} else 
	if (Display.input.getKey(KeyEvent.VK_DOWN) && BackGr.linza!=0) {
	r_ORBITY_1 -= 10*(r_ORBITY_1_standart/100);
	r_ORBITY_2 -= 10*(r_ORBITY_2_standart/100);
	r_ORBITY_3 -= 10*(r_ORBITY_3_standart/100);
	r_ORBITY_4 -= 10*(r_ORBITY_4_standart/100);
	
	for(int i=0;i<10;i++) {
		
	if(i==0) {Display.planet.get(i).pl_r_DOWN(2);}
	
	if(i>0 && i<3) {Display.planet.get(i).pl_r_DOWN(1+r_ORBITY_1_standart/100);}
	
	if(i>2 && i<6) {Display.planet.get(i).pl_r_DOWN(1+r_ORBITY_2_standart/100);}
	
	if(i>5 && i<8) {Display.planet.get(i).pl_r_DOWN(1+r_ORBITY_3_standart/100);}
	
	if(i>7 && i<10) {Display.planet.get(i).pl_r_DOWN(1+r_ORBITY_4_standart/100);}
	
	}
	
	}
	
	}

}
