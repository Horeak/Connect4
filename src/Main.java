import javax.swing.*;
import java.awt.*;

public class Main
{
	public static final String name = "Connect4";
	public static JFrame frame;
	public static GameCanvas canvas;
	
	public static UI currentUI = null;
	
	public static void main(String[] args){
		frame = new JFrame(name);
		frame.setPreferredSize(new Dimension(900, 800));
		frame.setMinimumSize(new Dimension(900, 800));
		frame.setResizable(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		canvas = new GameCanvas();
		frame.getContentPane().add(canvas);
		
		frame.pack();
		frame.setVisible(true);
		
		currentUI = new LoginScreen();
	}
}
