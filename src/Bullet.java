
public class Bullet {
	private int x;
	private int y;
	private int stepSize=5;
	Direction direction;
	
	private void Move(){
		if(direction==Direction.Down)
		y+=stepSize;
		else if(direction==Direction.Up)
			y-=stepSize;
		
	}
	
	
	
	public Bullet(int x,int y, Direction direction){
		this.x=x;
		this.y=y;
		this.direction=direction;
	}

}
