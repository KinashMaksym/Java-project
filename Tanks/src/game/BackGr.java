package game;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.sun.prism.paint.Color;

import Menue.Menue.STATES;
import display.Display;
import game_space.Planets;
import game_space.WorldSpace;
import main.Main;
import sun.awt.image.BufferedImageDevice;

public class BackGr {
	
	public static int back_WIDTH;
	public static int back_HEIGHT;
	public static int x_BACK;
	public static int y_BACK;
	public static int x_ZEROWE;
	public static int y_ZEROWE;
	
	// ³íäèâ³äóàëüí³ çì³íí³
	
	
	public static int x_world_space;
	public static int y_world_space;
	public static int linza = 0;
	public static boolean move_NOW;
	
	//
	
	public static BufferedImage size_BACK = null;
	public static BufferedImage menue_BACK = null;
	public static BufferedImage game_BACK = null;
	public static BufferedImage game_BACK_NOW = null;
	public static BufferedImage game_LOK_1 = null;;
	public static BufferedImage game_LOK_1_NOW = null;;
	public static BufferedImage game_space_back = null;
	public static BufferedImage menue_MODE_BACK = null;
	public static BufferedImage world_strategy_space = null;
	
	public static int move_speed_BACK;
	
	public BackGr() {
		
	back_WIDTH = 1000;
	back_HEIGHT = 700;
	x_BACK = (Main.width - 1000)/2;
	y_BACK = (Main.height - 700)/2;
	
	move_speed_BACK = 0;
	
	x_ZEROWE = x_BACK;
	y_ZEROWE = y_BACK;
	
	try{
	size_BACK = ImageIO.read (new File (Display.IMAGE_INPUT + "/image/background/back_size.png"));
	} catch (IOException e) {e.printStackTrace ();}	
	
	try{
	menue_BACK = ImageIO.read (new File (Display.IMAGE_INPUT + "/image/background/start_menue_back.png"));
	} catch (IOException e) {e.printStackTrace ();}	
	
	try{
	game_BACK = ImageIO.read (new File (Display.IMAGE_INPUT + "/image/reactions/back/game_back.png"));
	} catch (IOException e) {e.printStackTrace ();}	
	
	try{
	game_LOK_1 = ImageIO.read (new File (Display.IMAGE_INPUT + "/image/reactions/other/lok_1_back.png"));
	} catch (IOException e) {e.printStackTrace ();}
	
	try{
	game_space_back = ImageIO.read (new File (Display.IMAGE_INPUT + "/image/reactions/back/space_back.png"));
	} catch (IOException e) {e.printStackTrace ();}
	
	try{
	menue_MODE_BACK = ImageIO.read (new File (Display.IMAGE_INPUT + "/image/background/mode_back.png"));
	} catch (IOException e) {e.printStackTrace ();}
	
	try{
	world_strategy_space = ImageIO.read (new File (Display.IMAGE_INPUT + "/image/cosm_world/back/world_back_FULL.png"));
	} catch (IOException e) {e.printStackTrace ();}
			
	
	game_BACK_NOW = game_BACK.getSubimage(0, 0, back_WIDTH, back_HEIGHT);
	
	}
	
	public void background (Graphics2D g) {
	
	if (Display.menue.state.equals(STATES.STRATEGYSPACE) || Display.menue.state.equals(STATES.STRATEGY_PL_INPUT)) {
	if(linza >= 0 || linza <= 1000) {WorldSpace.orbit_size();linza();} else {if(linza<=0) {linza=0;}else{linza=1000;}}
	g.drawImage(world_strategy_space,x_BACK-linza/2,y_BACK-linza/2,1000+linza,700+linza,null);
	
	WorldSpace.center();
	
	}
	if (Display.menue.state.equals(STATES.FIRSTMENUE)) {
	backstage(Display.bufferGraphics);
	g.drawImage(menue_BACK,x_BACK,y_BACK,back_WIDTH,back_HEIGHT,null);
	}
	if (Display.menue.state.equals(STATES.GAMESPACE)) {
	g.drawImage(game_space_back,x_BACK,y_BACK,back_WIDTH,back_HEIGHT,null);	
	g.drawImage(game_BACK_NOW,x_BACK,y_BACK,back_WIDTH,back_HEIGHT,null);
	}
	if (Display.menue.state.equals(STATES.MODEMENUE)) {
	backstage(Display.bufferGraphics);
	g.drawImage(menue_MODE_BACK,x_BACK,y_BACK,back_WIDTH,back_HEIGHT,null);	
	}
	}
	
	public void linza() {
		
	if (Display.input.getKey(KeyEvent.VK_UP) && linza != 1000) {
		
	linza += 10;
		
	}
	
	if (Display.input.getKey(KeyEvent.VK_DOWN) && linza != 0) {
		
	linza -= 10;
		
	}
		
	}
	
	public static void backstage (Graphics2D bufferGraphics) {
		
	bufferGraphics.drawImage(size_BACK,x_BACK-183,y_BACK-33,1366,769,null);
	}
	
}
