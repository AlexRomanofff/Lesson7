package tanks;

public class Tiger extends Tanks {
	
	int armor;
	
	public Tiger () {
		maxSpeed = 36;
		armor = 1;
		color = "red";
	}
	
	@Override
	public String toString() {
		
		return ("Tiger - max Speed: "+maxSpeed + ", crew: " + crew + ", color: "+color+ ", armor: " + armor) ;
	}
	public void move () {
		System.out.println( "Tiger is moved on 1 quadrant");
	}

}
 