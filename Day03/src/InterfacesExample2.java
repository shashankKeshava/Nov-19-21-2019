interface Cricketer {
	void playCricket();
}

interface Pianist {
	void playPiano();
}

interface Musician extends Cricketer, Pianist {
	
}

class CarnaticMusician implements Musician {
	public void playPiano() {
	}

	public void playCricket() {
	}
}

class HindustaniClassicalMusician implements Musician {
	public void playPiano() {
	}

	public void playCricket() {
	}
}

class Sportsman implements Cricketer, Pianist {

	public void playPiano() {
	}

	public void playCricket() {
	}
	
}


public class InterfacesExample2 {

	public static void main(String[] args) {

	}

}
