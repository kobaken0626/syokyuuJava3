
public class Face {
	
	int x,y,vx,vy,xyz;
	
	public Face(int x,int y,int vx,int vy,int xyz) {
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
		this.xyz=xyz;
	}
	
	public void draw(MyFrame frame) {
		
		frame.fillRect(x+10,y+50,vx+10,vy+20);
		frame.fillRect(x,y+60,vx+30,vy+10);
		frame.fillOval(x+5,y+70,vx,vy+10);
		frame.fillOval(x+25,y+70,vx,vy+10);
	}
	public void move() {
		x+=xyz;
	}
}
