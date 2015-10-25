
public class Car {
	
	private String MANUFACTURER;
	private Colors color;
	private int countOfDoor;
	private int maxSpeed;
	
	
	public Car (Colors color, int countOfDoor, int maxSpeed) {
		this.color = color;
		this.countOfDoor= countOfDoor;
		this.maxSpeed = maxSpeed;
	}
	
	public void startEngine () {
		System.out.println("this method start engine");
	}
	public void stopEngine () { 
		System.out.println("this method stop engine");
	}
	public void startMotion () {
		System.out.println("this method begin motion of car");
	}
    public void stopTheCar () {
    	System.out.println("this method stop the car after driving");
    }
    public void openTheWindow() {
    	System.out.println( "this method open window in car");
    }
    public void clotheTheWindow() {
    	System.out.println("this method close window in car");
    }
}
