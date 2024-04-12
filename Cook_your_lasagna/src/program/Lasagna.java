package program;

public class Lasagna {

	private int minutesInOven;
	private int  layers;
	
	public Lasagna() {}
	
	public Lasagna(int min, int layers) {
		this.minutesInOven = minutesInOven;
		this.layers = layers;
	}
	
	public int expectedMinutesInOven() {
		return 40;
	}
	
	public int remainingMinutesInOven(int minutesInOven) {
		
		return expectedMinutesInOven() - minutesInOven;
	}
	
	public int preparationTimeInMinutes(int layers) {
		return layers * 2;
	}
	
	public int  totalTimeInMinutes( int layers , int minutesInOven) {
		return preparationTimeInMinutes(layers)  + minutesInOven;
	}
}
