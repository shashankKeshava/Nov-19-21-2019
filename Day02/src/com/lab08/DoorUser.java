package com.lab08;

public class DoorUser {

	public static void main(String[] args) {
		//Alarm alarm = new Alarm();
		Alarm alarm  = new SoundAlarm();
		
		
		Door door = new Door(new SoundAlarm());
		door.open();
		door.close();
		
		System.out.println("Changing the alarm");
		
		door.setAlarm(new VisualAlarm());
		door.open();
		door.close();
		
		System.out.println("Changing the alarm");
		
		door.setAlarm(new MessagingAlarm());
		door.open();
		door.close();

	}

}
