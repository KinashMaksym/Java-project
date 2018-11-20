package display;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;

import Menue.Buttons;
import Menue.Language;
import Menue.Menue;
import Menue.Menue.STATES;
import game.Animate;
import game.BackGr;
import game.EntityReak;
import game_space.Planets;
import game_space.PlayerPropertis;
import game_space.Reactions;
import game_space.Resours;
import game_space.Time;
import game_space.WorldSpace;
import game_space.ArmyType;
import game_space.CosLibrary;
import game_space.CosmMenue;
import game_space.FunctionalSpace;
import input.Files;
import input.Input;
import input.Listeners;
import main.Main;

public abstract class Display {
	
	// Canvas and JFrame
	
	private static boolean created = false;
	public static JFrame window;
	private static Canvas content;
	
	// Buffers
	
	private static BufferedImage buffer;
	private static int[] bufferData;
	public static Graphics2D bufferGraphics;
	private static int clearColor;
	
	// ƒŒƒ¿“ Œ¬≤  À¿—»
	public static Input input;
	public static BackGr back;
	public static Menue menue;
	public static Buttons button;
	public static EntityReak en_reak;
	public static Animate animate;
	public static WorldSpace world_space;
	public static CosLibrary clibrary;
	public static PlayerPropertis pprop;
	public static Files files;
	public static Language lag;
	public static CosmMenue cosm_menue;
	public static Reactions reactions;
	public static Resours resours;
	public static Time time;
	public static ArrayList<Planets> planet;
	public static ArrayList<ArmyType> armytype;	
	
	// ≤Õÿ≤ «Ã≤ÕÕ≤
	
	public static boolean stopd = true;
	
	public static int speed = 5;
	
	private static float delta = 0;
	
	public static String IMAGE_INPUT;

	public static void create(int width, int height, String title) {
		
		if (created)
			return;

		window = new JFrame(title);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		content = new Canvas();
		
		IMAGE_INPUT = "files";
		
		Dimension size = new Dimension(width, height);
		content.setPreferredSize(size);
		content.setFocusable(true);
		content.addMouseListener(new Listeners());
		content.addMouseMotionListener(new Listeners());
		window.setUndecorated(true);
		window.setResizable(false);
		window.setAlwaysOnTop(true);
		window.getContentPane().add(content);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	
		back = new BackGr();
		menue = new Menue();
		button = new Buttons();
		en_reak = new EntityReak();
		animate = new Animate();
		world_space = new WorldSpace();
		clibrary = new CosLibrary();
		pprop = new PlayerPropertis();
		cosm_menue = new CosmMenue();
		reactions = new Reactions();
		resours = new Resours();
		time = new Time();
		planet = new ArrayList<Planets>();
		armytype = new ArrayList<ArmyType>();
		
		buffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		bufferData = ((DataBufferInt) buffer.getRaster().getDataBuffer()).getData();
		bufferGraphics = (Graphics2D) buffer.getGraphics();
		
		input = new Input(); 		
		Display.addInputListener(input);

	}
	
	public static void clear() {
		Arrays.fill(bufferData, clearColor);
	}
	
	public static void update () {
	
	menue.update();
	
	cosm_menue.updata();
	
	}

	public static void render() {
		
		bufferGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON); 
		
		back.background(bufferGraphics);
		
		if (menue.state.equals(STATES.STRATEGYSPACE)) {
		time.time_interval();
		world_space.draw(bufferGraphics,Main.width,Main.height);
		for (int i = 0; i < armytype.size();i++) {armytype.get(i).move_timer(bufferGraphics);}
		for (int i = 0; i < planet.size();i++) {planet.get(i).draw(bufferGraphics);bufferGraphics.fillOval((int)planet.get(i).getX(),(int) planet.get(i).getY(),5,5);}
		reactions.planet(bufferGraphics);
		if(cosm_menue.game_start_planet_use){cosm_menue.new_game_draw(bufferGraphics);}else{
		cosm_menue.game_menue(bufferGraphics);}
		BackGr.backstage(bufferGraphics);
		}
		
		if (menue.state.equals(STATES.STRATEGY_PL_INPUT)) {
		world_space.draw(bufferGraphics,Main.width,Main.height);
		for (int i = 0; i < planet.size();i++) {planet.get(i).draw(bufferGraphics);}
		reactions.planet_input(bufferGraphics);
		BackGr.backstage(bufferGraphics);
		}
		
		if (menue.state.equals(STATES.PL_INFO)) {
		cosm_menue.progress_menue(bufferGraphics);
		BackGr.backstage(bufferGraphics);
		}
		
		if (menue.state.equals(STATES.PL_ARMY_ALL)) {
		cosm_menue.army_all(bufferGraphics);
		BackGr.backstage(bufferGraphics);
		}
		
		if (menue.state.equals(STATES.PL_ARMY_CREATE)) {
		cosm_menue.army_create(bufferGraphics);
		BackGr.backstage(bufferGraphics);
		}
		
		if (menue.state.equals(STATES.PL_ARMY_ROTATE)) {
		cosm_menue.army_attack(bufferGraphics);
		BackGr.backstage(bufferGraphics);
		} else {CosmMenue.army_info_attack = -1;}
		
		if (menue.state.equals(STATES.PL_ARMY_BLOCK)) {
		cosm_menue.planet_block(bufferGraphics);
		BackGr.backstage(bufferGraphics);
		}
		
	}

	public static void swapBuffers() {
		Graphics2D g = (Graphics2D) content.getGraphics();
		g.drawImage(buffer, 0, 0, null);
	}
	
		public static void addInputListener(Input inputListener) {
		window.add(inputListener);
		}

}