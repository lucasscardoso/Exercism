package program;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner  sc = new Scanner (System.in);
		int minutesInOven;
		int layers = 0;
		
		Lasagna la = new Lasagna();
		System.out.println("expected time is: " + la.expectedMinutesInOven());
		System.out.println();
		
		System.out.println("remainingMinutesInOven ?");
		minutesInOven = sc.nextInt();
		System.out.println("remaning time is: " + la.remainingMinutesInOven(minutesInOven));
		
		System.out.println("preparationTimeInMinutes ");
		layers = sc.nextInt();
		System.out.println("preparation time is: " + la.preparationTimeInMinutes(layers));
		
		System.out.println("totalTimeInMinutes");
		System.out.println(la.totalTimeInMinutes(layers, minutesInOven));
		
		
	}

}
