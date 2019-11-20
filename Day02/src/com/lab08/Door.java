package com.lab08;

public class Door {
	
	private Alarm alarm;
	
	public void setAlarm(Alarm alarm) {
		this.alarm = alarm;
	}

	public Door(Alarm alarm) {
		this.alarm = alarm;
	}
	
	public void open() {
		alarm.activate();
	}
	
	public void close() {
		alarm.deactivate();
	}
	
}
