package tanks;

public class Tanks {
	
	String color;
	int maxSpeed;
	int crew;
	
	public Tanks () {
		maxSpeed = 0;
		crew = 0;
		color = "green";
		
	}
	public String getColor() {
		return color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public int getCrew() {
		return crew;
	}
    @Override
    public String toString() {
    	
    	return ("Tanks - max Speed: "+maxSpeed + ", crew: " + crew + ", color: "+color) ;
    }
	public void move () {
		System.out.println("Tanks is moved on 1 quadrant");
	}
}
