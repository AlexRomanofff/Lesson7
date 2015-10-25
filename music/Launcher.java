package music;

public class Launcher {

	public static void main(String[] args) {

		Musician m = new Musician();
		Instrument i = new Instrument();
		Flute f = new Flute();
		 m.play(i);
		 m.play(f);
	
	}
    
}
