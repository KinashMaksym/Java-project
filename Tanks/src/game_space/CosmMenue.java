package game_space;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;

import Menue.Buttons;
import display.Display;
import game.BackGr;
import main.Main;

public class CosmMenue {
	
	public static int x = Main.width/2-300;
	public static int y = Main.height/2-300;
	
	public static BufferedImage army_icon = null;
	public static BufferedImage army_icon_1 = null;
	public static BufferedImage army_icon_2 = null;
	
	public static BufferedImage armymenue_back;
	public static BufferedImage startgame_back;
	
	public static int[][] army_number = new int[6][2];

	public static BufferedImage game_menue;
	public static BufferedImage[] image = new BufferedImage[20]; 
	
	public static String planet_name;
	public static boolean game_start_planet_use;
	
	public static String start_massege = "ВИБЕРИ ПЛАНЕТУ";
	
	public static BufferedImage planet_icon;
	
	public static int army_info_attack = -1;
	
	public static String propertis_massege = "УПРАВЛІННЯ";
	public static String resours_massege = "РЕСУРСИ";
	
	public static String army_progres_massege = "Військова справа";
	public static String techno_progress_massege = "Технології";
	public static String polityka_progress_massege = "Політика";
	public static String torg_progress_massege = "Торгівля";
	
	public static String army_all_massege_1 = "Утворити флот";
	public static String army_all_massege_2 = "Атакувати/Направити флот";
	public static String army_all_massege_3 = "Захисні споруди";
	
	public static String block_planet_massege_1 = "Енергетичний щит";
	public static String block_planet_massege_2 = "Захисний флот";
	public static String block_planet_massege_3 = "Плазмові гармати";
	public static String block_planet_massege_4 = "Радар";
	
	public static String bpm = "Рівень";
	
	public static String bpm_1_2 = "Міць";
	public static String bpm_1_3 = "Заряд";
	
	public static String bpm_2_2 = "Кількість";
	public static String bpm_2_3 = "Досвід";
	
	public static String bpm_3_2 = "Точність";
	public static String bpm_3_3 = "Зона ураження";
	
	public static String bpm_4_2 = "Зона дії";
	public static String bpm_4_3 = "Шанс ураження";
	
	public void updata() {
		
	if(PlayerPropertis.Planet_ALL == 0) {game_start_planet_use = true;}else{game_start_planet_use = false;}
		
	}
	
	public CosmMenue() {
		
			try{army_icon = ImageIO.read (new File (Display.IMAGE_INPUT + "/image/cosm_world/Entity/guns_icon.png"));
			} catch (IOException e) {e.printStackTrace ();}	
			
			try {
			armymenue_back = ImageIO.read (new File (Display.IMAGE_INPUT + "/image/cosm_world/back/backmenue_army.jpg"));
			} catch (IOException e) {e.printStackTrace ();}	
			
			try {
			startgame_back = ImageIO.read (new File (Display.IMAGE_INPUT + "/image/cosm_world/back/startgame_back.jpg"));
			} catch (IOException e) {e.printStackTrace ();}	
			
			try {
			game_menue = ImageIO.read (new File (Display.IMAGE_INPUT + "/image/cosm_world/other/menue_buttons.png"));
			} catch (IOException e) {e.printStackTrace ();}	
			
			army_icon_1 = army_icon.getSubimage(0,0,75,75);
			army_icon_2 = army_icon.getSubimage(75,0,75,75);
			
			image[0] = game_menue.getSubimage(0,0,125,125);
			image[1] = game_menue.getSubimage(125,0,209,50);
			image[2] = game_menue.getSubimage(125,50,149,31);
			image[3] = game_menue.getSubimage(275,50,60,55);
			image[4] = game_menue.getSubimage(0,125,77,77);
			image[5] = game_menue.getSubimage(77,125,168,35);
			image[6] = game_menue.getSubimage(125,81,12,39);
			image[7] = game_menue.getSubimage(77,160,100,28);
			image[8] = game_menue.getSubimage(138,82,51,17);
			
			image[9] = game_menue.getSubimage(0,204,398,100);
			image[10] = game_menue.getSubimage(77,188,225,13);
			image[11] = game_menue.getSubimage(335,0,400,120);
			
			image[12] = game_menue.getSubimage(0,330,400,120);
			image[13] = game_menue.getSubimage(417,149,181,14);
			image[14] = game_menue.getSubimage(418,166,52,52);
			image[15] = game_menue.getSubimage(473,166,52,52);
			image[16] = game_menue.getSubimage(417,133,181,14);
			image[17] = game_menue.getSubimage(420,220,200,50);
			image[18] = game_menue.getSubimage(482,312,250,75);
			image[19] = game_menue.getSubimage(615,135,75,75);
		
	}

	public void new_game_draw(Graphics2D g) {
	
	g.drawImage(startgame_back,BackGr.x_BACK,BackGr.y_BACK,1000,100,null);
		
	long length_x_1 = (int) g.getFontMetrics().getStringBounds(start_massege,g).getWidth();
	long length_y_1 = (int) g.getFontMetrics().getStringBounds(start_massege,g).getHeight();
	
	g.drawString(start_massege,BackGr.x_BACK+500-length_x_1/2,BackGr.y_BACK+50+length_y_1/3);
	
	}
	
	public void game_menue(Graphics2D g) {
		
	g.drawImage(image[0],BackGr.x_BACK+20,(BackGr.y_BACK+700)-120,100,100,null);
	g.drawImage(image[1],BackGr.x_BACK+140,(BackGr.y_BACK+700)-110,130,30,null);
	g.drawImage(image[1],BackGr.x_BACK+140,(BackGr.y_BACK+700)-60,130,30,null);
	
	g.drawImage(image[0],BackGr.x_BACK+20,BackGr.y_BACK+20,125,125,null);
	g.drawImage(image[2],BackGr.x_BACK+169,BackGr.y_BACK+20,149,31,null);
	g.drawImage(image[2],BackGr.x_BACK+169,BackGr.y_BACK+67,149,31,null);
	g.drawImage(image[2],BackGr.x_BACK+169,BackGr.y_BACK+114,149,31,null);
	
	g.drawImage(image[3],(BackGr.x_BACK+1000)-60,BackGr.y_BACK+20,40,36,null);
	
	g.setFont(new Font("",Font.BOLD,12));
	
	long length_x = (int) g.getFontMetrics().getStringBounds(propertis_massege,g).getWidth();
	long length_y = (int) g.getFontMetrics().getStringBounds(propertis_massege,g).getHeight();
	
	g.drawString(propertis_massege,BackGr.x_BACK+205-length_x/2,(BackGr.y_BACK+700)-95+length_y/3);
	
	length_x = (int) g.getFontMetrics().getStringBounds(resours_massege,g).getWidth();
	length_y = (int) g.getFontMetrics().getStringBounds(resours_massege,g).getHeight();
	
	g.drawString(resours_massege,BackGr.x_BACK+205-length_x/2,(BackGr.y_BACK+700)-45+length_y/3);
	
	g.drawImage(planet_icon,BackGr.x_BACK+35,(BackGr.y_BACK+700)-105,70,70,null);
	
	g.setFont(new Font("",Font.BOLD,14));
	
	length_x = (int) g.getFontMetrics().getStringBounds("" + Resours.money,g).getWidth();
	length_y = (int) g.getFontMetrics().getStringBounds("" + Resours.money,g).getHeight();
	
	g.drawString("" + Resours.money,BackGr.x_BACK+200,BackGr.y_BACK+35+length_y/3);
	
	length_x = (int) g.getFontMetrics().getStringBounds("" + Resours.people,g).getWidth();
	length_y = (int) g.getFontMetrics().getStringBounds("" + Resours.people,g).getHeight();
	
	g.drawString("" + Resours.people,BackGr.x_BACK+200,BackGr.y_BACK+82+length_y/3);
	
	length_x = (int) g.getFontMetrics().getStringBounds("" + Resours.money,g).getWidth();
	length_y = (int) g.getFontMetrics().getStringBounds("" + Resours.money,g).getHeight();
	
	g.drawString("" + Resours.reagen,BackGr.x_BACK+200,BackGr.y_BACK+129+length_y/3);
	
	Buttons.str_menue(1);
	
	}
	
	public void progress_menue(Graphics2D g) {
		
	g.drawImage(armymenue_back, x, y, null);
	
	g.drawImage(image[4], x+250, y+30,100,100,null);
	g.drawImage(image[9], x+99, y+130,398,100,null);
	
	g.drawImage(image[10], x+43, y+270,225,13,null);
	g.drawImage(image[10], x+333, y+270,225,13,null);
	g.drawImage(image[10], x+43, y+360,225,13,null);
	g.drawImage(image[10], x+333, y+360,225,13,null);
	
	g.drawImage(image[9], x+99, y+590,398,-100,null);
	
	g.setColor(Color.BLACK);
	
	g.setFont(new Font("",1,15));
	
	long length_x = (int) g.getFontMetrics().getStringBounds(army_progres_massege,g).getWidth();
	
	g.drawString(army_progres_massege,(x+156)-length_x/2,y+260);
	
	length_x = (int) g.getFontMetrics().getStringBounds(techno_progress_massege,g).getWidth();
	
	g.drawString(techno_progress_massege,(x+456)-length_x/2,y+260);
	
	length_x = (int) g.getFontMetrics().getStringBounds(torg_progress_massege,g).getWidth();
	
	g.drawString(torg_progress_massege,(x+156)-length_x/2,y+350);
	
	length_x = (int) g.getFontMetrics().getStringBounds(polityka_progress_massege,g).getWidth();
	
	g.drawString(polityka_progress_massege,(x+456)-length_x/2,y+350);
	
	g.drawImage(image[8], x+534, y+15,51,17,null);
	
	Buttons.str_menue(2);
	}
	
	public void army_attack (Graphics2D g) {
	
	g.drawImage(armymenue_back, x, y, null);
	
	g.drawImage(image[18], x+25, y+375,250,75,null);
	
	int line = 0;
	int leng = 0;
	
	for(int i=0;i<18;i++,leng++) {
	
	if(leng > 2) {leng = 0; line ++;}
	
	g.drawImage(image[19],x+315 + (leng*75),y+50+(line*75),75,75,null);
		
	}
	
	line = 0;
	leng = 0;
	
	for (int i=0;i<CosLibrary.army_ALL;i++) {
		
	if (Display.armytype.get(i).getplanet() == CosLibrary.planet_NOW) {
	
	if(leng > 2) {leng = 0; line ++;}
		
	g.drawImage(Display.armytype.get(i).icon(),x+315 + (leng*75),y+50+(line*75),75,75,null);
	
	Buttons.block_army_attack(i,x+315 + (leng*75),y+50+(line*75));
	
	leng++;
		
	}
		
	}
	
	if(army_info_attack != -1) {
		
	g.drawImage(Display.armytype.get(army_info_attack).getImage_info(),x+5,y+60,300,300,null);
	
	}
	
	g.drawImage(image[17],x+325,y+510,200,50,null);
	
	g.drawImage(image[8], x+534, y+15,51,17,null);
	
	Buttons.str_menue(3);
	}
	
	public void army_all (Graphics2D g) {
		
	g.drawImage(armymenue_back, x, y, null);	
	
	g.setColor(Color.BLACK);
	
	g.drawImage(image[17],x+200,y+200,200,50,null);
	g.drawImage(image[17],x+200,y+275,200,50,null);
	g.drawImage(image[17],x+200,y+350,200,50,null);
	
	long length_x = (int) g.getFontMetrics().getStringBounds(army_all_massege_1,g).getWidth();
	long length_y = (int) g.getFontMetrics().getStringBounds(army_all_massege_1,g).getHeight();
	
	g.drawString(army_all_massege_1,(x+300)-length_x/2,(y+225)+length_y/3);
	
	length_x = (int) g.getFontMetrics().getStringBounds(army_all_massege_2,g).getWidth();
	length_y = (int) g.getFontMetrics().getStringBounds(army_all_massege_2,g).getHeight();
			
	g.drawString(army_all_massege_2,(x+300)-length_x/2,(y+300)+length_y/3);
	
	length_x = (int) g.getFontMetrics().getStringBounds(army_all_massege_3,g).getWidth();
	length_y = (int) g.getFontMetrics().getStringBounds(army_all_massege_3,g).getHeight();
	
	g.drawString(army_all_massege_3,(x+300)-length_x/2,(y+375)+length_y/3);
	
	g.drawImage(image[8], x+534, y+15,51,17,null);
	
	Buttons.str_menue(4);
	
	}
	
	public void army_create(Graphics2D g) {
		
	g.drawImage(armymenue_back, x, y, null);	
	
	g.drawImage(image[11], x+100, y+60,400,120,null);
	g.drawImage(image[11], x+100, y+180,400,120,null);
	g.drawImage(image[11], x+100, y+300,400,120,null);
	g.drawImage(image[11], x+100, y+420,400,120,null);
	
	g.drawImage(image[8], x+534, y+15,51,17,null);
	
	g.drawImage(army_icon_1, x+127, y+83,75,75,null);
	g.drawImage(army_icon_2, x+127, y+203,75,75,null);
	
	Buttons.str_menue(5);
	}
	
	public void planet_block(Graphics2D g) {
		
	g.drawImage(armymenue_back, x, y, null);	
	
	g.drawImage(image[12], x+100, y+60,400,120,null);
	
	g.setColor(Color.BLACK);
	g.setFont(new Font("",3,20));
	long length_y = (int) g.getFontMetrics().getStringBounds(block_planet_massege_1,g).getHeight();
	g.drawString(block_planet_massege_1,x+115,y+68+length_y);
	
	g.setFont(new Font("",Font.BOLD,14));
	length_y = (int) g.getFontMetrics().getStringBounds(bpm,g).getHeight();
	g.drawString(bpm,x+300, y+123+length_y/4);
	length_y = (int) g.getFontMetrics().getStringBounds(bpm_1_2,g).getHeight();
	g.drawString(bpm_1_2,x+300, y+141+length_y/4);
	length_y = (int) g.getFontMetrics().getStringBounds(bpm_1_3,g).getHeight();
	g.drawString(bpm_1_3,x+300, y+159+length_y/4);
	
	g.drawImage(image[14], x+430, y+68,52,52,null);
	g.drawImage(image[15], x+430, y+68+52,52,52,null);
	for(int i=0;i<3;i++) {g.drawImage(image[13], x+115, y+115+(i*14)+(i*4),181,14,null);}
	
	g.drawImage(image[12], x+100, y+180,400,120,null);
	
	g.setColor(Color.BLACK);
	g.setFont(new Font("",3,20));
	length_y = (int) g.getFontMetrics().getStringBounds(block_planet_massege_2,g).getHeight();
	g.drawString(block_planet_massege_2,x+115,y+188+length_y);
	
	g.setFont(new Font("",Font.BOLD,14));
	length_y = (int) g.getFontMetrics().getStringBounds(bpm,g).getHeight();
	g.drawString(bpm,x+300, y+243+length_y/4);
	length_y = (int) g.getFontMetrics().getStringBounds(bpm_2_2,g).getHeight();
	g.drawString(bpm_2_2,x+300, y+261+length_y/4);
	length_y = (int) g.getFontMetrics().getStringBounds(bpm_2_3,g).getHeight();
	g.drawString(bpm_2_3,x+300, y+279+length_y/4);
	
	g.drawImage(image[14], x+430, y+188,52,52,null);
	g.drawImage(image[15], x+430, y+188+52,52,52,null);
	for(int i=0;i<3;i++) {g.drawImage(image[13], x+115, y+235+(i*14)+(i*4),181,14,null);}
	
	g.drawImage(image[12], x+100, y+300,400,120,null);
	
	g.setColor(Color.BLACK);
	g.setFont(new Font("",3,20));
	length_y = (int) g.getFontMetrics().getStringBounds(block_planet_massege_3,g).getHeight();
	g.drawString(block_planet_massege_3,x+115,y+308+length_y);
	
	g.setFont(new Font("",Font.BOLD,14));
	length_y = (int) g.getFontMetrics().getStringBounds(bpm,g).getHeight();
	g.drawString(bpm,x+300, y+363+length_y/4);
	length_y = (int) g.getFontMetrics().getStringBounds(bpm_3_2,g).getHeight();
	g.drawString(bpm_3_2,x+300, y+381+length_y/4);
	length_y = (int) g.getFontMetrics().getStringBounds(bpm_3_3,g).getHeight();
	g.drawString(bpm_3_3,x+300, y+399+length_y/4);
	
	g.drawImage(image[14], x+430, y+308,52,52,null);
	g.drawImage(image[15], x+430, y+308+52,52,52,null);
	for(int i=0;i<3;i++) {g.drawImage(image[13], x+115, y+355+(i*14)+(i*4),181,14,null);}
	
	g.drawImage(image[12], x+100, y+420,400,120,null);
	
	g.setColor(Color.BLACK);
	g.setFont(new Font("",3,20));
	length_y = (int) g.getFontMetrics().getStringBounds(block_planet_massege_4,g).getHeight();
	g.drawString(block_planet_massege_4,x+115,y+428+length_y);
	
	g.setFont(new Font("",Font.BOLD,14));
	length_y = (int) g.getFontMetrics().getStringBounds(bpm,g).getHeight();
	g.drawString(bpm,x+300, y+483+length_y/4);
	length_y = (int) g.getFontMetrics().getStringBounds(bpm_4_2,g).getHeight();
	g.drawString(bpm_4_2,x+300, y+501+length_y/4);
	length_y = (int) g.getFontMetrics().getStringBounds(bpm_4_3,g).getHeight();
	g.drawString(bpm_4_3,x+300, y+519+length_y/4);
	
	g.drawImage(image[14], x+430, y+428,52,52,null);
	g.drawImage(image[15], x+430, y+428+52,52,52,null);
	for(int i=0;i<3;i++) {g.drawImage(image[13], x+115, y+475+(i*14)+(i*4),181,14,null);}
	
	for(int i=0;i<3;i++) {	
	int line = ((Display.planet.get(CosLibrary.planet_NOW).getBinfo(0,i))*181)/100;
	g.drawImage(image[16], x+115, y+115+(i*14)+(i*4),line,14,null);
	}
	
	for(int i=0;i<3;i++) {	
	int line = ((Display.planet.get(CosLibrary.planet_NOW).getBinfo(1,i))*181)/100;
	g.drawImage(image[16], x+115, y+235+(i*14)+(i*4),line,14,null);
	}
	
	for(int i=0;i<3;i++) {	
	int line = ((Display.planet.get(CosLibrary.planet_NOW).getBinfo(2,i))*181)/100;
	g.drawImage(image[16], x+115, y+355+(i*14)+(i*4),line,14,null);
	}
	
	for(int i=0;i<3;i++) {	
	int line = ((Display.planet.get(CosLibrary.planet_NOW).getBinfo(3,i))*181)/100;
	g.drawImage(image[16], x+115, y+475+(i*14)+(i*4),line,14,null);
	}
	
	g.drawImage(image[8], x+534, y+15,51,17,null);
	
	Buttons.str_menue(6);
	
	}
	
	public static void planet_info() {
		
	planet_icon = Display.planet.get(CosLibrary.planet_NOW).getIcon();
		
	}
	
	public static void army_info_attack(int index) {
		
	army_info_attack = index;
		
	}
}
