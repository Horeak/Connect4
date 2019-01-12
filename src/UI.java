
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class UI
{
	public CopyOnWriteArrayList<Button> buttons = new CopyOnWriteArrayList<>();
	
	public boolean isMouseOnButton(){
		for(Button btn : buttons){
			if(btn.isMouseOver()){
				return true;
			}
		}
		
		return false;
	}
	
	public abstract void addButtons();
	public abstract void render(Graphics g);
	
	public static void drawCenteredString(Graphics g, String text, Rectangle rect) {
		FontMetrics metrics = g.getFontMetrics(g.getFont());
		int x = rect.x + (rect.width - metrics.stringWidth(text)) / 2;
		int y = rect.y + ((rect.height - metrics.getHeight()) / 2) + metrics.getAscent();
		g.drawString(text, x, y);
	}
}
