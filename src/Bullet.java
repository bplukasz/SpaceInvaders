
public class Bullet {
	private int x;
	private int y;
	private int stepSize=5;
	Direction direction;
	private int sceneHeight;
	
	private void Move(){
		if(direction==Direction.Down && y<sceneHeight)
			y+=stepSize;
		else if(direction==Direction.Up && y>0)
			y-=stepSize;
	}
	
	public Bullet(int x,int y, Direction direction, int sceneHeight){
		this.x=x;
		this.y=y;
		this.direction=direction;
		this.sceneHeight=sceneHeight;
	}

}
