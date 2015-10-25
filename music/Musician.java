package music;

public class Musician {
	
	
  public void play (Instrument i) {
	  i.sound();
	  if (i instanceof Flute) {
		Flute f = new Flute();
		f.test();
	  }
	 
  }
}
