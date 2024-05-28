
public class DisplayFaceObject extends MyFrame{
	public void run() {
		Face face1=new Face(50,50);  //xとy
		face1.draw(this);           //drawでの計算
		
		Face face2=new Face(250,50);
		face2.draw(this);
		
		Face face3=new Face(150,150);
		face3.draw(this);
	}
}
