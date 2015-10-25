package library;

public enum Genre {
	FANTASY(1), FOOD(2), COMPUTER(3), DRAMA(4), HISTORY(5), DETECTIVE(0);
	
	private int id;
	
	private Genre (int id) {
		this.id = id;		
	}
	public int getID () {
		return id;
	}

}
