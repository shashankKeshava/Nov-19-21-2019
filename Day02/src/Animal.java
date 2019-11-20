public abstract class Animal {
	private long lifeSpan;
	
	public Animal(long lifespan) {
		this.lifeSpan = lifespan;
	}
	
	public void eat() {
		System.out.println("****Eating");
	}
	
	abstract void makeNoise();
}

class Dog extends Animal {
	
	public Dog(long lifespan) {
		super(lifespan);
	}
	
	public void play() {
		System.out.println("Playing with humans");
	}

	public void makeNoise() {
		System.out.println("bow bow");
	}
	
	
}