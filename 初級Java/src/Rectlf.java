
public class Rectlf extends MyFrame{
	public void run() {
		int x=30;
		int z=10;
		setColor(0,128,0);
		int i;
		for(i=0;i<9;i++) {
			if(i==0) {
				fillRect(x,80,10,z);
		    }else {
				fillRect(x,80,10,z);
			}
			x+=20;
			z+=20;
		}
	}	
}
