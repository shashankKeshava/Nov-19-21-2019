package com.lab08;

//Abstract classes are like normal classes
//Can have variables, methods, constructors etc
//They can also have ABSTRACT methods
//THey cannot be instantiated
public abstract class Alarm {

	abstract public void activate();
	abstract public void deactivate();

}

//class BurglarAlarm extends Alarm {
//	
//}

class MessagingAlarm extends Alarm {
	
	public void activate() {
		System.out.println("***MessagingAlarm activated");
	}

	public void deactivate() {
		System.out.println("***MessagingAlarm deactivated");
	}
}

class VisualAlarm extends Alarm {
	
	public void activate() {
		System.out.println("***VisualAlarm activated");
	}

	public void deactivate() {
		System.out.println("***VisualAlarm deactivated");
	}
}

class SoundAlarm extends Alarm {
	
	public void activate() {
		System.out.println("***SoundAlarm activated");
	}

	public void deactivate() {
		System.out.println("***SoundAlarm deactivated");
	}
}
