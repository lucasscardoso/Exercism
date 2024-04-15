package program;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		//test for Bird_Watcher
		
		Scanner sc = new Scanner(System.in);
		
		Bird_Watcher bird = new Bird_Watcher();
		
		bird.getLastWeek();
		bird.getToday();
		bird.incrementTodaysCount();
		bird.hasDayWithoutBirds();
		
		System.out.println("Enter the number of days you would like to add: ");
		int num =  sc.nextInt();
		
		System.out.println(bird.getCountForFirstDays(num));
		
		bird.getBusyDays();
		
		sc.close();
	}
	
	
	
}
