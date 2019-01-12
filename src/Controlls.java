
import com.sun.javafx.geom.Vec2d;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Controlls
{
	public static int lastX = -1, lastY = -1;
	private static int startX = -1, startY = -1;
	private static int curButton = -1;
	
	public static void mousePressed( int key ) {
		if (key == MouseEvent.BUTTON1) {
			if(Main.currentUI != null) {
				
				if(Main.currentUI.selectedInputBox != null){
					Main.currentUI.selectedInputBox = null;
				}
				
				for (Button button : Main.currentUI.buttons) {
					if (button.enabled) {
						if (button.getPos().contains(lastX, lastY)) {
							if (button instanceof InputBox) {
								Main.currentUI.selectedInputBox = (InputBox) button;
							} else
								button.onClicked();
							
							return;
						}
					}
				}
			}
		}
	}
	
	public static void init( JFrame frame, GameCanvas canvas ) {
		canvas.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mousePressed( MouseEvent e ) {
				lastX = e.getX();
				lastY = e.getY();
				
				curButton = e.getButton();
				Controlls.mousePressed(e.getButton());
			}
			
			@Override
			public void mouseReleased( MouseEvent e ) {
				curButton = -1;
			}
		});
		
		frame.addComponentListener(new ComponentListener()
		{
			@Override
			public void componentResized( ComponentEvent e ) {
//				UI.buttons.clear();
//				UI.addButtons();
			}
			
			@Override
			public void componentMoved( ComponentEvent e ) { }
			
			@Override
			public void componentShown( ComponentEvent e ) {}
			
			@Override
			public void componentHidden( ComponentEvent e ) { }
		});
		
		frame.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped( KeyEvent e ) {

			}
			
			@Override
			public void keyPressed( KeyEvent e ) {
				if(Main.currentUI != null){
					if(Main.currentUI.selectedInputBox != null){
						
						if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE){
							if(Main.currentUI.selectedInputBox.currentText.length() > 0) {
								Main.currentUI.selectedInputBox.currentText = Main.currentUI.selectedInputBox.currentText.substring(0, Main.currentUI.selectedInputBox.currentText.length() - 1);
							}
						}else {
							Main.currentUI.selectedInputBox.currentText += e.getKeyChar(); //TODO Backspace wont work
						}
					}
				}
			}
			
			@Override
			public void keyReleased( KeyEvent e ) {
			
			}
		});
	}
	
	
}
