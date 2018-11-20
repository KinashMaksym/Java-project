package main;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Timer;

import display.Display;

public class Main {
	
		public static int width;
		public static int height;

		public static void main(String []args) {
		
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		width = /*gd.getDisplayMode().getWidth();*/1000;
		height = /*gd.getDisplayMode().getHeight();*/700;	
		
		Display.create(width,height, "Tanks");

		Timer t = new Timer(1000/60, new AbstractAction() {
			
			public void actionPerformed(ActionEvent e) {
				Display.clear();
				Display.update();
				Display.render();
				Display.swapBuffers();
			}

		});

		t.setRepeats(true);
		t.start();
		}
	
}