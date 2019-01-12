import java.awt.*;

public class InputBox extends Button
{
	int x, y, width, heigth;
	boolean hide;
	
	String currentText = "";
	String defaultText;
	
	public InputBox( int x, int y, int width, int heigth, boolean hide, String defaultText )
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.heigth = heigth;
		this.hide = hide;
		this.defaultText = defaultText;
	}
	
	@Override
	public void onClicked()
	{
		System.out.println("Test: " + defaultText + ":" + currentText);
	}
	
	@Override
	public void render( Graphics g )
	{
		Graphics2D g2 = (Graphics2D)g;
		Rectangle rect = new Rectangle(x, y, width, heigth);
		
		g2.setClip(null);
		
		g2.setColor(Color.lightGray);
		g2.fill(rect);
		
		g2.setColor(Color.darkGray);
		g2.draw(rect);
		
		g2.setClip(new Rectangle(x, y, width - 2, heigth));
		g2.setColor(Color.black);
		
		String render = currentText;
		
		if(hide){
			render = "";
			
			for(int i = 0; i < currentText.length(); i++){
				render += "*";
			}
		}
		
		if(render.isEmpty()){
			if(defaultText != null && !defaultText.isEmpty()){
				render = defaultText;
				g2.setColor(Color.darkGray);
			}
		}
		
		g2.drawString(render, x + 2, (int)rect.getCenterY() + 5);
	}
	
	@Override
	public Rectangle getPos()
	{
		return new Rectangle(x, y, width, heigth);
	}
	
	@Override
	public void update()
	{
	
	}
}
