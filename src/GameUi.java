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
		buttons.clear();
		
		int width = Main.canvas.getWidth();
		int height = Main.canvas.getHeight();
		Rectangle rectangle = new Rectangle(20,20,width - 40, height - (height / 4));
		
		int buttonSizeX = ((rectangle.width - (5 * GameRound.SIZEX)) / GameRound.SIZEX);
		int buttonSizeY = ((rectangle.height - (5 * GameRound.SIZEY)) / GameRound.SIZEY);
		
		for(int x = 0; x < GameRound.SIZEX; x++){
			for(int y = 0; y < GameRound.SIZEY; y++){
				buttons.add(new CircleButton(this, rectangle.x + (x * buttonSizeX) + ((x + 1) * 5), rectangle.y + (y * buttonSizeY) + ((y + 1) * 5), buttonSizeX, buttonSizeY, x, y));
			}
		}
	}
	
	@Override
	public void render( Graphics g )
	{
		addButtons();
		
		Graphics2D g2 = (Graphics2D)g;
		
		int width = Main.canvas.getWidth();
		int height = Main.canvas.getHeight();
		
		Rectangle rectangle = new Rectangle(20,20,width - 40, height - (height / 4));
		Rectangle infoBox = new Rectangle(20,height - (height / 4) + 30,width - 40, height / 5);
		
		g2.setColor(Color.black);
		g2.fill(rectangle);
		
		g2.setColor(Color.darkGray);
		g2.fill(infoBox);
	}
}
