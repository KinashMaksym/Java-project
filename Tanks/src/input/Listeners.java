package input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Listeners implements MouseListener, MouseMotionListener{
	
	public static int x;
	public static int y;
	
	public static boolean leftMouse = false;
	public static boolean rightMouse = false;

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	 x = e.getX();
	 y = e.getY();
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	if (e.getButton() == MouseEvent.BUTTON1) {		
	leftMouse = true;
	}
	if (e.getButton() == MouseEvent.BUTTON3) {		
	rightMouse = true;
	}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	if (e.getButton() == MouseEvent.BUTTON1) {		
	leftMouse = false;
	}
	if (e.getButton() == MouseEvent.BUTTON3) {		
	rightMouse = false;
	}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
