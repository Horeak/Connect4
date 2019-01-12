
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.util.concurrent.CopyOnWriteArrayList;

public class UI
{
	public static CopyOnWriteArrayList<Button> buttons = new CopyOnWriteArrayList<>();
	
	public static boolean isMouseOnButton(){
		for(Button btn : buttons){
			if(btn.isMouseOver()){
				return true;
			}
		}
		
		return false;
	}
	
	public static void addButtons() { }
}
