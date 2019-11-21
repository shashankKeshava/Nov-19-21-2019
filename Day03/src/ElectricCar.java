public interface ElectricCar {
	void start() throws BatteryDischargedException, FlatTyreException;
}


class BatteryDischargedException extends Exception {
}

class FlatTyreException extends Exception {
}