import javax.swing.*;
import java.awt.*;

public class GameCanvas extends JPanel
{
	@Override
	public void paintComponent( Graphics gg ) {
		super.paintComponent(gg);
		
		if(Main.currentUI != null) {
			Main.currentUI.render(gg);
			
			for (Button bt : Main.currentUI.buttons) {
				if (bt.enabled) {
					bt.render(gg);
				}
				bt.update();
			}
		}
	}
}
