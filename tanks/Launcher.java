package tanks;

public class Launcher {

	public static void main(String[] args) {
		Tank t = new Tank();
		BT7 bt7 = new BT7();
		Tiger tiger = new Tiger();
		T34 t34 = new T34();
		
//		System.out.println("Tank - color: " + t.getColor()+ " crew: " + t.getCrew() + " Max speed: " + t.getMaxSpeed());
//		System.out.println("BT7 - color: " + bt7.color+ " crew: " + bt7.crew + " Max speed: " + bt7.maxSpeed);
//		System.out.println("Tiger - color: " + tiger.color+ " crew: " + tiger.crew + " Max speed: " + tiger.maxSpeed);
//		System.out.println(bt7.toString());
		System.out.println(t34.toString());
//		System.out.println(tiger.toString());
////		 
//		t.move();
//		bt7.move();
		t34.move();

//		tiger.move();
	}
}