package program;

public class ElonToyCar {

	private int distance;
	private int batteryPercentage;
	
	private ElonToyCar() {
		this.distance  = 0;
		this.batteryPercentage = 100;
	}
	
	public static  ElonToyCar buy() {
		return new ElonToyCar();
	}
	
	public String DrivenDistanceDisplay () {
		return "Drive " + distance + " meters";
	}
	
	public String BatteryDisplay() {
		if(this.batteryPercentage > 0) {
			return "Battery at " + batteryPercentage + "%";
		}
		else {
			return "Battery empty";
		}
	}
	
	public void drive() {
		if(batteryPercentage > 0) {
			this.distance += 20;
			this.batteryPercentage -= 1;
		}
	}
}
