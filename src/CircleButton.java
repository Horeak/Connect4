import java.awt.*;

public class CircleButton extends Button
{
	GameUi ui;
	int x, y, width, heigth;
	int mapX, mapY;
	
	public CircleButton( GameUi ui, int x, int y, int width, int heigth, int mapX, int mapY )
	{
		this.ui = ui;
		this.x = x;
		this.y = y;
		this.width = width;
		this.heigth = heigth;
		this.mapX = mapX;
		this.mapY = mapY;
	}
	
	@Override
	public void onClicked()
	{
		Node nd = Main.gameRound.nodes[mapX][mapY];
		
		if(nd != null){
			if(nd.state == EnumState.EMPTY){
				if(Main.gameRound.currentTurn == 1){
					nd.state = EnumState.CAPTURED_PLAYER1;
					Main.gameRound.currentTurn = 2;
					
				}else if(Main.gameRound.currentTurn == 2){
					nd.state = EnumState.CAPTURED_PLAYER2;
					Main.gameRound.currentTurn = 1;
				}
				
			}
		}
	}
	
	@Override
	public void render( Graphics g )
	{
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		
		if(isMouseOver()){
			g2.setColor(Color.lightGray);
		}else{
			g2.setColor(Color.darkGray);
		}
		
		Node nd = Main.gameRound.nodes[mapX][mapY];
		
		if(nd != null){
			if(nd.state == EnumState.CAPTURED_PLAYER1){
				g2.setColor(Main.gameRound.player1.userColor);
				
			}else if(nd.state == EnumState.CAPTURED_PLAYER2){
				g2.setColor(Main.gameRound.player2.userColor);
			}
		}
		
		g2.fillOval(x, y, width, heigth);
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
