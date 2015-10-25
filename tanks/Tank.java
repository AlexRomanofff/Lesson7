package tanks;

public class Tank {
	
	private String color;
	private int crew;
	private int maxSpeed;
	
	public Tank () {
		this("brown", 3, 300);
	}
	
	public Tank (String color, int crew, int maxSpeed) {
		
		this.color = color;
		this.crew = crew;
		this.maxSpeed = maxSpeed;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCrew() {
		return crew;
	}

	public void setCrew(int crew) {
		this.crew = crew;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

}
