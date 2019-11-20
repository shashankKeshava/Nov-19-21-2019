public class Car {
	private String model;
	private int year;
	private long miles;
	
	public Car(String model, int year) {
		this.model = model;
		this.year = year;
	}
	
	public void drive() {
		miles++;
	}
	
	public void printSummary() {
		System.out.println("Total number of miles driven: " + miles);
	}
	
	
	public String getModel() {
		return model;
	}
	
	
	
	
//	public void setModel(String model) {
//		this.model = model;
//	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year < 2000) {
			System.out.println("Very old car");
			return;
		}
		this.year = year;
	}
	
}
