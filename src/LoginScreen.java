import java.awt.*;

public class LoginScreen extends UI
{
	InputBox player1UserName = null, player2UserName = null;
	InputBox player1Password = null, player2Password = null;
	
	StartButton button = null;
	
	Player player1 = null;
	Player player2 = null;
	
	@Override
	public void addButtons()
	{
		player1UserName = new InputBox(0,0,0, 20, false, "Username");
		player2UserName = new InputBox(0,0,0, 20, false, "Username");
		
		player1Password = new InputBox(0,0,0, 20, true, "Password");
		player2Password = new InputBox(0,0,0, 20, true, "Password");
		
		buttons.add(player1UserName);
		buttons.add(player1Password);
		
		buttons.add(player2UserName);
		buttons.add(player2Password);
		
		int width = Main.canvas.getWidth();
		int height = Main.canvas.getHeight();
		
		int btWidth = width / 5;
		
		button = new StartButton(width / 2 - (btWidth / 2), height / 2, btWidth, 50);
		buttons.add(button);
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
		
		Font f = g2.getFont();
		
		g2.setFont(new Font("Arial", 0, 94));
		g2.setColor(Color.black);
		drawCenteredString(g, Main.name, title);
		
		g2.setFont(f);
		
		g2.setClip(null);
		
		int playerWindowSizeX = width / 4;
		int playerWindowSizeY = height / 4;
		
		Rectangle player1 = new Rectangle(5,height - (playerWindowSizeY + 5),playerWindowSizeX,playerWindowSizeY);
		Rectangle player2 = new Rectangle(width - (playerWindowSizeX + 5),height - (playerWindowSizeY + 5),playerWindowSizeX,playerWindowSizeY);
		
		player1UserName.x = player1.x + 5;
		player1UserName.y = player1.y + (playerWindowSizeY / 3);
		player1UserName.width =  player1.width - 10;
		
		player2UserName.x = player2.x + 5;
		player2UserName.y = player2.y + (playerWindowSizeY / 3);
		player2UserName.width =  player2.width - 10;
		
		player1Password.x = player1.x + 5;
		player1Password.y = player1.y + (playerWindowSizeY / 3)  + 30;
		player1Password.width =  player1.width - 10;
		
		player2Password.x = player2.x + 5;
		player2Password.y = player2.y + (playerWindowSizeY / 3) + 30;
		player2Password.width =  player2.width - 10;
		
		int btWidth = width / 5;
		button.x = width / 2 - (btWidth / 2);
		button.y = height / 2;
		button.width = btWidth;
		
		g2.setColor(Color.white);
		g2.fill(player1);
		g2.fill(player2);
		
		g2.setColor(Color.darkGray);
		g2.draw(player1);
		g2.draw(player2);
		
		if(this.player1 == null){
			f = g2.getFont();
			g2.setFont(new Font("Arial", 0, 20));
			g2.setColor(Color.black);
			g2.drawString("No player 1 detected!", player1.x + 5, player1.y + 20);
			g2.drawString("Please log in:", player1.x + 5, player1.y + 40);
			g2.setFont(f);
		}
		
		if(this.player2 == null){
			f = g2.getFont();
			g2.setFont(new Font("Arial", 0, 20));
			g2.setColor(Color.black);
			g2.drawString("No player 2 detected!", player2.x + 5, player2.y + 20);
			g2.drawString("Please log in:", player2.x + 5, player2.y + 40);
			g2.setFont(f);
		}
	}
}
