import com.game.production.main.Game;

import java.awt.*;

public abstract class Button
{
	public boolean enabled = true;
	
	public abstract void onClicked();
	
	public abstract void render( Graphics g );
	
	public abstract Rectangle getPos();
	
	public abstract void update();
	
	public boolean isMouseOver() {
		if (Main.canvas.getMousePosition() != null) {
			Point mouse = Main.canvas.getMousePosition();
			
			if (mouse != null) {
				return getPos().contains(mouse);
			}
		}
		
		return false;
	}
}
