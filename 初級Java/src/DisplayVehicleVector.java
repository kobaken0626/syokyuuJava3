import java.util.Vector;

public class DisplayVehicleVector extends MyFrame{
	public void run() {
	Vector<Vehicle> vehicles=new Vector<Vehicle>();
	vehicles.add(new Car(70,30,3,0));
	vehicles.add(new Car(130,80,-3,0));
	vehicles.add(new Train(190,150,5,0));
	vehicles.add(new Train(100,230,-5,0));
	vehicles.add(new Truck(20,280,7,0));
	vehicles.add(new Truck(140,320,7,0));
	
	    for(int i=0;i<30;i++) {
	     clear();
		    for(int j=0;j<vehicles.size();j++) {
			vehicles.get(j).draw(this);
			vehicles.get(j).move();
		 }
		 sleep(0.1);
	   }
	}
}
