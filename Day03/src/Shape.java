public interface Shape {
	void draw();
}

interface RoundShape {
	
}

interface Circle extends Shape {
	double area();
}

class FootballGround implements Shape, RoundShape {

	public void draw() {
	}
	
}

class SemiCircle implements Circle {
	public void draw() {
		
	}
	public double area() {
		return 0;
	}
}
