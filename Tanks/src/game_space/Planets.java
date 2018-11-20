package game_space;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import display.Display;
import game.BackGr;
import main.Main;

public class Planets {
	
	public static int radius_now;
	
	private int x;
	private int y;
	private int r;
	private double rotate;
	private int orbit;
	private double rotate_center;
	private String planet_name;
	private BufferedImage planet_image = null;
	
	private int orbit_id;
	
	private boolean player_own = false;
	
	private int block_info[][] = new int[4][6];
	
	private int type;
	private int center_x = Main.width/2;
	private int center_y = Main.height/2;
	
	
 public Planets (int type) {
		
		this.type = type;
		
		switch (type) { 
		
		case (1):
		
		planet_name = "Назва...1";
		
			
		r = 50;
		
		rotate = 0;
		rotate_center = 0;
		
		x = Main.width/2;
		y = Main.height/2;
		
		try{
		planet_image = ImageIO.read (new File (Display.IMAGE_INPUT + "/image/cosm_world/object/planet_1.png"));
		} catch (IOException e) {e.printStackTrace ();}	
		
		break;
	    case (2):
			
			planet_name = "Назва...2";
	    	
	    r = 10;
	    
		rotate = 0;
	    rotate_center = 0;
		
		x = Main.width/2;
		y = Main.height/2;
		
		try{
		planet_image = ImageIO.read (new File (Display.IMAGE_INPUT + "/image/cosm_world/object/planet_2.png"));
		} catch (IOException e) {e.printStackTrace ();}		
		
	    	
		break;
	    case (3):
			
	    	planet_name = "Назва...3";
	    	
	    r = 20;
	    
		rotate = 99;
		rotate_center = 0;
	    
		x = Main.width/2;
		y = Main.height/2;
		
		try{
		planet_image = ImageIO.read (new File (Display.IMAGE_INPUT + "/image/cosm_world/object/planet_3.png"));
		} catch (IOException e) {e.printStackTrace ();}		
			
		break;
	    case (4):
	    	
		planet_name = "Назва...4";
	    	
	    r = 10;
	    
		rotate = 165;
		rotate_center = 0;
	    
		x = Main.width/2;
		y = Main.height/2;
		
		try{
		planet_image = ImageIO.read (new File (Display.IMAGE_INPUT + "/image/cosm_world/object/planet_4.png"));
		} catch (IOException e) {e.printStackTrace ();}		
			
	    break;
	    case (5):
			
		planet_name = "Назва...5";
	    	
	    r = 20;
	    
		rotate = 100;
		rotate_center = 0;
	    
		x = Main.width/2;
		y = Main.height/2;
		
		try{
		planet_image = ImageIO.read (new File (Display.IMAGE_INPUT + "/image/cosm_world/object/planet_5.png"));
		} catch (IOException e) {e.printStackTrace ();}		
			
	    break;
	    case (6):
		
	    planet_name = "Назва...6";
	    	
	    r = 30;
		
		rotate = 270;
		rotate_center = 0;
	    
		x = Main.width/2;
		y = Main.height/2;
		
		try{
		planet_image = ImageIO.read (new File (Display.IMAGE_INPUT + "/image/cosm_world/object/planet_6.png"));
		} catch (IOException e) {e.printStackTrace ();}		
			
	    break;
	    case (7):
			
		planet_name = "Назва..7";
	    	
	    
	    r = 15;
	    
		rotate = 160;
		rotate_center = 0;
	    
		x = Main.width/2;
		y = Main.height/2;
		
		try{
		planet_image = ImageIO.read (new File (Display.IMAGE_INPUT + "/image/cosm_world/object/planet_7.png"));
		} catch (IOException e) {e.printStackTrace ();}		
		
		break;
	    case (8):
			
		planet_name = "Назва..8";    
	    	
	    r = 25;
	    
		
		rotate = 46;
		rotate_center = 0;
	    
		x = Main.width/2;
		y = Main.height/2;
		
		try{
		planet_image = ImageIO.read (new File (Display.IMAGE_INPUT + "/image/cosm_world/object/planet_8.png"));
		} catch (IOException e) {e.printStackTrace ();}	
		
		break;
	    case (9):
			
			planet_name = "Назва..9";
	    	
	    r = 20;
	    
		rotate = 84;
		rotate_center = 0;
	    
		x = Main.width/2;
		y = Main.height/2;
		
		
		try{
		planet_image = ImageIO.read (new File (Display.IMAGE_INPUT + "/image/cosm_world/object/planet_9.png"));
		} catch (IOException e) {e.printStackTrace ();}	
		
	    break;
	    case (10):
			
		planet_name = "Назва..10";
	    	
	    r = 15;
	    
		rotate = 180;
		rotate_center = 0;
	    
		x = Main.width/2;
		y = Main.height/2;
		
		try{
		planet_image = ImageIO.read (new File (Display.IMAGE_INPUT + "/image/cosm_world/object/planet_10.png"));
		} catch (IOException e) {e.printStackTrace ();}	
	    break;
		}
	}
		


	public void update () {
	
		
	
	}

	public double getX(){return (center_x + Math.cos(Math.toRadians(rotate))*orbit/2);}
	public double getY(){return (center_y + Math.sin(Math.toRadians(rotate))*orbit/2);}
	public double getRot() {return rotate;}
	public int getr() {return r;}
	public int getOrb() {return orbit;}
    public int type() {return type;}
    public String getName() {return planet_name;}
    public BufferedImage getIcon() {return planet_image;}
    public boolean get_pl_own() {return player_own;}
    public int getOrb_id() {return orbit_id;}
		
	
	public void draw (Graphics2D g) {
	
	if(rotate == 360) {rotate=0;}
	
	if(type == 1) {
	
	orbit = 0;
	
	orbit_id = 0;
		
	AffineTransform rot = g.getTransform();
	g.rotate(Math.toRadians(rotate),center_x,center_y);
		
	g.drawImage(planet_image,center_x-r/2,center_y-r/2,r,r,null);
	
	g.setTransform(rot);
	}
	
	if(type > 1 && type < 4) {
	
	orbit = WorldSpace.r_ORBITY_1;
	
	orbit_id = 1;
		
	rotate += 0.5;
		
	AffineTransform rot = g.getTransform();
	g.rotate(Math.toRadians(rotate),center_x,center_y);
	
	x = center_x-r/2+orbit/2;
	y = center_y-r/2;
	
	g.drawImage(planet_image,x,y,r,r,null);
	
	g.setTransform(rot);
	}
	
	if(type > 3 && type < 7) {
		
	orbit = WorldSpace.r_ORBITY_2;
	
	orbit_id = 2;
		
	rotate += 0.3;
	
	AffineTransform rot = g.getTransform();
	g.rotate(Math.toRadians(rotate),center_x,center_y);
	
	x = center_x-r/2+orbit/2;
	y = center_y-r/2;
	
	g.drawImage(planet_image,x,y,r,r,null);
	
	g.setTransform(rot);
	}
	
	if(type > 6 && type < 9) {
		
	orbit = WorldSpace.r_ORBITY_3;
	
	orbit_id = 3;
		
	rotate += 0.6;
	
	AffineTransform rot = g.getTransform();
	g.rotate(Math.toRadians(rotate),center_x,center_y);
	
	x = center_x-r/2+orbit/2;
	y = center_y-r/2;
	
	g.drawImage(planet_image,x,y,r,r,null);
	
	g.setTransform(rot);
	}
	
	if(type > 8 && type < 11) {
	
	orbit = WorldSpace.r_ORBITY_4;
	
	orbit_id = 4;
	
	rotate += 0.3;
	
	AffineTransform rot = g.getTransform();
	g.rotate(Math.toRadians(rotate),center_x,center_y);
	
	x = center_x-r/2+orbit/2;
	y = center_y-r/2;
	
	g.drawImage(planet_image,x,y,r,r,null);
	
	g.setTransform(rot);
	}
	
	}
	
	public void pl_r_UP(int speed) {r += speed;}
	public void pl_r_DOWN(int speed) {r -= speed;}
	
	public void center(int x,int y) {center_x = x;center_y=y;}
	
	public void player_own(boolean type) {player_own = type;}
	
	public void block_info_up(int index) {
	
	if(block_info[index][3] < 5) {
		
	block_info[index][3] ++;
	
	switch(index) {
	
	case(0):
	
	switch(block_info[index][3]) {
	
	case(0):
		block_info[index][0] = 0;
		block_info[index][1] = 0;
		block_info[index][2] = 0;
	break;
	case(1):
		block_info[index][0] = 20;
		block_info[index][1] = 15;
		block_info[index][2] = 20;
	break;	
	case(2):
		block_info[index][0] = 40;
		block_info[index][1] = 35;
		block_info[index][2] = 35;
	break;
	case(3):
		block_info[index][0] = 60;
		block_info[index][1] = 65;
		block_info[index][2] = 50;
	break;
	case(4):
		block_info[index][0] = 80;
		block_info[index][1] = 90;
		block_info[index][2] = 75;
	break;
	case(5):
		block_info[index][0] = 100;
		block_info[index][1] = 100;
		block_info[index][2] = 100;
	break;
	
	}
	
	break;
	
	case(1):
		
		switch(block_info[index][3]) {
		
		case(0):
			block_info[index][0] = 0;
			block_info[index][1] = 0;
			block_info[index][2] = 0;
			
		break;
		case(1):
			block_info[index][0] = 20;
			block_info[index][1] = 25;
			block_info[index][2] = 12;
		break;	
		case(2):
			block_info[index][0] = 40;
			block_info[index][1] = 40;
			block_info[index][2] = 30;
		break;
		case(3):
			block_info[index][0] = 60;
			block_info[index][1] = 55;
			block_info[index][2] = 55;
		break;
		case(4):
			block_info[index][0] = 80;
			block_info[index][1] = 75;
			block_info[index][2] = 85;
		break;
		case(5):
			block_info[index][0] = 100;
			block_info[index][1] = 100;
			block_info[index][2] = 100;
		break;
		
		}
		
	break;
	
	case(2):
		
		switch(block_info[index][3]) {
		
		case(0):
			block_info[index][0] = 0;
			block_info[index][1] = 0;
			block_info[index][2] = 0;
		break;
		case(1):
			block_info[index][0] = 20;
			block_info[index][1] = 15;
			block_info[index][2] = 10;
		break;	
		case(2):
			block_info[index][0] = 40;
			block_info[index][1] = 20;
			block_info[index][2] = 30;
		break;
		case(3):
			block_info[index][0] = 60;
			block_info[index][1] = 35;
			block_info[index][2] = 55;
		break;
		case(4):
			block_info[index][0] = 80;
			block_info[index][1] = 50;
			block_info[index][2] = 73;
		break;
		case(5):
			block_info[index][0] = 100;
			block_info[index][1] = 70;
			block_info[index][2] = 100;
		break;
		
		}
		
	break;
	
	case(3):
		
		switch(block_info[index][3]) {
		
		case(0):
			block_info[index][0] = 0;
			block_info[index][1] = 0;
			block_info[index][2] = 0;
		break;
		case(1):
			block_info[index][0] = 20;
			block_info[index][1] = 40;
			block_info[index][2] = 5;
		break;	
		case(2):
			block_info[index][0] = 40;
			block_info[index][1] = 60;
			block_info[index][2] = 13;
		break;
		case(3):
			block_info[index][0] = 60;
			block_info[index][1] = 75;
			block_info[index][2] = 18;
		break;
		case(4):
			block_info[index][0] = 80;
			block_info[index][1] = 95;
			block_info[index][2] = 25;
		break;
		case(5):
			block_info[index][0] = 100;
			block_info[index][1] = 100;
			block_info[index][2] = 40;
		break;
		
		}
		
	break;
	
	}
	
	}
	
	}
	
	public void block_info_down(int index) {
		
		if(block_info[index][3] > 0) {
			
		block_info[index][3] --;
		
		switch(index) {
		
		case(0):
		
		switch(block_info[index][3]) {
		
		case(0):
			block_info[index][0] = 0;
			block_info[index][1] = 0;
			block_info[index][2] = 0;
		break;
		case(1):
			block_info[index][0] = 20;
			block_info[index][1] = 15;
			block_info[index][2] = 20;
		break;	
		case(2):
			block_info[index][0] = 40;
			block_info[index][1] = 35;
			block_info[index][2] = 35;
		break;
		case(3):
			block_info[index][0] = 60;
			block_info[index][1] = 65;
			block_info[index][2] = 50;
		break;
		case(4):
			block_info[index][0] = 80;
			block_info[index][1] = 90;
			block_info[index][2] = 75;
		break;
		case(5):
			block_info[index][0] = 100;
			block_info[index][1] = 100;
			block_info[index][2] = 100;
		break;
		
		}
		
		break;
		
		case(1):
			
			switch(block_info[index][3]) {
			
			case(0):
				block_info[index][0] = 0;
				block_info[index][1] = 0;
				block_info[index][2] = 0;
				
			break;
			case(1):
				block_info[index][0] = 20;
				block_info[index][1] = 25;
				block_info[index][2] = 12;
			break;	
			case(2):
				block_info[index][0] = 40;
				block_info[index][1] = 40;
				block_info[index][2] = 30;
			break;
			case(3):
				block_info[index][0] = 60;
				block_info[index][1] = 55;
				block_info[index][2] = 55;
			break;
			case(4):
				block_info[index][0] = 80;
				block_info[index][1] = 75;
				block_info[index][2] = 85;
			break;
			case(5):
				block_info[index][0] = 100;
				block_info[index][1] = 100;
				block_info[index][2] = 100;
			break;
			
			}
			
		break;
		
		case(2):
			
			switch(block_info[index][3]) {
			
			case(0):
				block_info[index][0] = 0;
				block_info[index][1] = 0;
				block_info[index][2] = 0;
			break;
			case(1):
				block_info[index][0] = 20;
				block_info[index][1] = 15;
				block_info[index][2] = 10;
			break;	
			case(2):
				block_info[index][0] = 40;
				block_info[index][1] = 20;
				block_info[index][2] = 30;
			break;
			case(3):
				block_info[index][0] = 60;
				block_info[index][1] = 35;
				block_info[index][2] = 55;
			break;
			case(4):
				block_info[index][0] = 80;
				block_info[index][1] = 50;
				block_info[index][2] = 73;
			break;
			case(5):
				block_info[index][0] = 100;
				block_info[index][1] = 70;
				block_info[index][2] = 100;
			break;
			
			}
			
		break;
		
		case(3):
			
			switch(block_info[index][3]) {
			
			case(0):
				block_info[index][0] = 0;
				block_info[index][1] = 0;
				block_info[index][2] = 0;
			break;
			case(1):
				block_info[index][0] = 20;
				block_info[index][1] = 40;
				block_info[index][2] = 5;
			break;	
			case(2):
				block_info[index][0] = 40;
				block_info[index][1] = 60;
				block_info[index][2] = 13;
			break;
			case(3):
				block_info[index][0] = 60;
				block_info[index][1] = 75;
				block_info[index][2] = 18;
			break;
			case(4):
				block_info[index][0] = 80;
				block_info[index][1] = 95;
				block_info[index][2] = 25;
			break;
			case(5):
				block_info[index][0] = 100;
				block_info[index][1] = 100;
				block_info[index][2] = 40;
			break;
			
			}
			
		break;
		
		}
		
		}
		
		}
	
	public int getBinfo(int i,int j) {return block_info[i][j];}
	
	public void pl_own() {player_own = true;}
	
}