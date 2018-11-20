package game_space;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.Timer;

import display.Display;
import game.BackGr;
import main.Main;

public class ArmyType {
	
	public static BufferedImage image;
    private BufferedImage image_NOW;
    
    private BufferedImage image_info;
    
    private int id;
    private int planet;
    private int pl_move;
    private int move;
    private int rotate;
    
    private int time_move;
    private int time_start = -1;
    
    private long move_time;
    
    private double x,y,x1,y1;
    
    //stats +
    
    private int speed;
    private int armor;
    private int mans;
    private String mans_str;
    
    // +
    
	static int type;	
	
	/*if(planet[1] == CosLibrary.planet_NOW || planet[0] == CosLibrary.planet_NOW) {	
	rotate[0] = Display.planet.get(planet[0]).getG();
	rotate[1] = Display.planet.get(planet[1]).getG();
	
	diagon = (int) (Math.sqrt(Math.pow(x1-x,2)+Math.pow(y1-y,2)));
	
	if (x>x1&&y1>y) {
		
	linex = x-x1;
	liney = y1-y;
	
	gradus = linex/liney;
	
	radian = Math.atan(gradus) + Math.toRadians(180);
	
	} else {
	
	if (x1>x&&y1>y) {
		
	linex = x1-x;
	liney = y1-y;
		
	gradus = liney/linex;
		
	radian = Math.atan(gradus) + Math.toRadians(90);
	
	} else {
	
	if (x1>x&&y>y1) {
		
	linex = x1-x;
	liney = y-y1;
		
	gradus = linex/liney;
		
	radian = Math.atan(gradus);
	
	} else {
	
	if (x>x1&&y>y1) {
	
	linex = x-x1;
	liney = y-y1;
		
	gradus = liney/linex;
		
	radian = Math.atan(gradus) - Math.toRadians(90);
	
	}
	}
	}
	}*/
	
	public int getplanet() {return planet;}
	public int gettype() {return type;}
	public int getmove_pl() {return planet;}
	public int getpl_move() {return pl_move;}
	public int getmove() {return move;}
	public int getrotate() {return rotate;}
	
	public ArmyType (int type) {
			
			try{image = ImageIO.read (new File (Display.IMAGE_INPUT + "/image/cosm_world/Entity/guns_icon.png"));
			} catch (IOException e) {e.printStackTrace ();}	
			
			this.type = type;
			
			switch (type) { 
			
			case (1):
				
			move = 0;
			rotate = 0;
			planet = CosLibrary.planet_NOW;
			pl_move = -1;
					
		    speed = 700;
		    armor = 20;
		    mans = 3;
		    
			mans_str = "Велика";
			
			image_NOW = image.getSubimage(0,0,75,75);
			
			try{image_info = ImageIO.read (new File (Display.IMAGE_INPUT + "/image/cosm_world/Entity/guns_1.png"));
			} catch (IOException e) {e.printStackTrace ();}	
			
			break;
		    case (2):
		
			move = 0;
			rotate = 0;
			planet = CosLibrary.planet_NOW;
			pl_move = -1;
		    	
		    speed = 700;
		    armor = 20;
		    mans = 1;
		    
			mans_str = "Слабка";
		    
		    image_NOW = image.getSubimage(75,0,75,75);
		    
		    break;
		    case (3):
				
		    
		    break;	
			}
			
	}
	
	public void move_timer(Graphics2D g) {
	
	if(move == 1) {
	
    time_move = /*20*(Math.abs(Display.planet.get(planet).getOrb_id()-Display.planet.get(pl_move).getOrb_id())) + (Math.abs(planet-pl_move))*10*/ 3;
		
	if(time_start == -1) {
		
	time_start = Time.time_line + time_move;
				
	}

	g.setColor(Color.WHITE);
	g.drawLine((int) Display.planet.get(planet).getX(),(int) Display.planet.get(planet).getY(),(int) Display.planet.get(pl_move).getX(),(int) Display.planet.get(pl_move).getY());
	
	if(Time.time_line == time_start) {
		
	System.out.println(Time.time_line);
		
	Display.planet.get(pl_move).pl_own();
	
	move = 0;
	rotate = 0;
	time_start = -1;
	
	time_move = 0;
	
	planet = pl_move;
	pl_move = -1;
		
	}
	
	}
		
	}
	
	public BufferedImage icon() {return image_NOW;}
	public BufferedImage getImage_info() {return image_info;}
	
	public void rotate_eneble()  {rotate = 1;}
	public void rotate_disable() {rotate = 0;}
	public void move_eneble()  	 {move = 1;}
	public void move_disable()   {move = 0;}
	
	public void pl_input_move(int planet) {pl_move = planet;}
	

}