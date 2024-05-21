
public class Rectlf extends MyFrame{
	public void run() {
		int x=30;
		int y=160;
		int z=40;
		int a=300;
		setColor(0,128,0);
		int i;
		for(i=0;i<9;i++) {
			fillRect(x,80,10,y);
			fillRect(x,a,10,z);
		   x+=20;
		   y-=15;
		   z+=15;
		   a-=15;
		}
	}	
}
