package TankArray;


public class TankPropertis {
	 

	public static void main(String[] args) {
		
     
       Tank[] tank = new Tank[5];
       tank [0] = new Tank();
       tank [0].setColor("black");
       tank [0].setCrew(5);
       tank [0].setMaxSpeed(100);
       tank [2] = new Tank();
       printTankInfo(tank);
	}

      
 static void printTankInfo (Tank[] tank) {

	 for (int i = 0; i < tank.length; i++) {
		 if (tank[i] != null) {
			 System.out.println("Color of tank: " + tank[i].getColor() + "; Crew: " + tank[i].getCrew() + "; Max Speed: " + tank[i].getMaxSpeed());
		 }
	 }
 }

}
