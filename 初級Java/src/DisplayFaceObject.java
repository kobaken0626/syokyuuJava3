
public class DisplayFaceObject extends MyFrame{
	public void run() {
		Face face1=new Face(50,50);  //xとy
		face1.draw(this);           //drawでの計算
		
		Face face2=new Face(200,100);
		face2.draw(this);
	}
}
