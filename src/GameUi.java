import java.awt.*;

public class GameUi extends UI
{
	public GameUi()
	{
		Player player1 = new Player("Player1", Color.red);
		Player player2 = new Player("Player2", Color.green);
		
		Main.gameRound = new GameRound(player1, player2);
	}
	
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
		
		Rectangle rectangle = new Rectangle(20,20,width - 40, height - (height / 4));
		Rectangle infoBox = new Rectangle(20,height - (height / 4) + 30,width - 40, height / 5);
		
		
		g2.setColor(Color.black);
		g2.fill(rectangle);
		
		g2.setColor(Color.darkGray);
		g2.fill(infoBox);
		
		int buttonSizeX = rectangle.width / GameRound.SIZEX;
		int buttonSizeY = rectangle.height / GameRound.SIZEY;
		
	}
}
