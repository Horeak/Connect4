import java.awt.*;

public class InputBox extends Button
{
	int x, y, width, heigth;
	
	public InputBox( int x, int y, int width, int heigth )
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.heigth = heigth;
	}
	
	@Override
	public void onClicked()
	{
	
	}
	
	@Override
	public void render( Graphics g )
	{
	
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
