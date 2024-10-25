package program;

public class Program {

	public static void main(String[] args) {
		
		
		ElonToyCar car = ElonToyCar.buy();
		

	   //for(int i = 0; i < 100; i++) {
	//	   car.drive();
	  // }
		//2k battery is empty
		
		
		System.out.println(car.DrivenDistanceDisplay());
		System.out.println(car.BatteryDisplay());
		
		
	}

}
