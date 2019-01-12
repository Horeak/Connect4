import java.awt.*;

public class LoginScreen extends UI
{
	@Override
	public void addButtons()
	{
	
	}
	
	@Override
	public void render( Graphics g )
	{
		Graphics2D g2 = (Graphics2D)g;
		
		int width = Main.canvas.getWidth();
		int height = Main.canvas.getHeight();
	
		Rectangle background = new Rectangle(0, 0, width, height);
		Rectangle title = new Rectangle(20, 20, width - 40, height / 4);
		
		GradientPaint gradientPaint = new GradientPaint(0f,0f, Color.blue, (float)background.getMaxX(), (float)background.getMaxY(), Color.cyan);
		
		g2.setPaint(gradientPaint);
		g2.fill(background);
		g2.setPaint(null);
		
		g2.setColor(Color.green);
		g2.fillRect(20, 20, width - 40, height / 4);
		g2.setClip(title);
		
		
		g2.setRenderingHint(
				RenderingHints.KEY_TEXT_ANTIALIASING,
				RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		
		g2.setFont(new Font("Arial", 0, 94));
		g2.setColor(Color.black);
		drawCenteredString(g, Main.name, title);
		
		Rectangle player1 = new Rectangle(0,0,0,0);
		Rectangle player2 = new Rectangle(0,0,0,0);
	}
}
