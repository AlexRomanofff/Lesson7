package tanks;

public class BT7 extends Tanks {
	
	public BT7 () {		
		maxSpeed = 72;
		color = "blue";
		crew = 4;
		}
	@Override
	public String toString() {
		
		return ("BT7 - max Speed: "+maxSpeed + ", crew: " + crew + ", color: "+color) ;
	}
	public void move () {
		System.out.println("BT7 is moved on 1 quadrant");
		super.move();
	}
}