import java.awt.*;

public class StartButton extends Button
{
	int x, y, width, heigth;
	
	public StartButton( int x, int y, int width, int heigth)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.heigth = heigth;
	}
	
	@Override
	public void onClicked()
	{
		Main.setUI(new GameUi());
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
		
		g2.setClip(rect);
		g2.setColor(Color.black);
		UI.drawCenteredString(g2, "Start", rect);
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
