public class GameRound
{
	public static int SIZEX = 7;
	public static int SIZEY = 6;
	
	public Player player1, player2;
	
	public Node[][] nodes = new Node[SIZEX][SIZEY];
	
	
	public GameRound( Player player1, Player player2 )
	{
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public void init(){
		for(int x = 0; x < SIZEX; x++){
			for(int y = 0; y < SIZEY; y++){
				nodes[x][y] = new Node(x, y);
			}
		}
	}
}
