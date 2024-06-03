
 import java.util.Vector;

 public class DisplayFaceVector extends MyFrame{
	 public void run() {
		 
		Vector<Face> faces=new Vector<Face>();
		
		faces.add(new Face(30,50,10,0,1));
		faces.add(new Face(30,100,10,0,2));
		faces.add(new Face(30,150,10,0,3));
		faces.add(new Face(30,200,10,0,4));
		faces.add(new Face(30,250,10,0,5));
		
		
		for(int i=0; i<=5; i++) {
			
			clear();
			
			for(int j=0; j<faces.size();j++) {
				
				faces.get(j).draw(this);
				faces.get(j).move();
			}
			
			sleep(0.1);
		}
	}
}
