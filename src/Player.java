
public class Player {

	private int x;
	private int y;
	private int stepSize=5;
	
	public void Move(Direction direction){
		if(direction == Direction.Right)
			x+=stepSize;
		else if(direction == Direction.Left)
			x-=stepSize;
	}
	
	public Player(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
}
