package tanks;

public class T34 extends Tanks {
	
	public T34 () {
		maxSpeed = 50;
		color = super.getColor();
//		super.move();
	}
	@Override
	public String toString() {
		return super.toString();
//		return ("T34 - max Speed: "+maxSpeed + ", crew: " + crew + ", color: "+color) ;
	}

	@Override
	public void move() {
		System.out.println("T34 is moving on 1 quadrant");
		super.move();
	}
}
