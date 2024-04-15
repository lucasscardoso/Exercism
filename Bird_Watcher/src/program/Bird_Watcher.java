package program;

import java.util.Arrays;

public class Bird_Watcher {

	private int[] LastWeek = {0, 2, 5, 3, 7, 8, 4};
	private int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
	
	
	public Bird_Watcher() {
		
	}
	
	public Bird_Watcher(int[] lastWeek,int [] birdsPerDay) {
		super();
		this.LastWeek = lastWeek;
		this.birdsPerDay = birdsPerDay;
	}



	public void getLastWeek() {
		System.out.println(Arrays.toString(LastWeek));
	}
	
	public void getToday() {
		System.out.println(getFinal(birdsPerDay));
	}

	public void incrementTodaysCount() {
		System.out.println(birdsPerDay[0]);
	}
	
	public void hasDayWithoutBirds() {
		
		boolean hasDayWithoutBirds = false;
		
		for(int birds : birdsPerDay) {
			if(birds == 0) {
				hasDayWithoutBirds = true;
				break;
			}else {
				hasDayWithoutBirds = false;
			}
		}
		
		System.out.println(hasDayWithoutBirds);
	}
	
	public int getCountForFirstDays(int numDays) {
		int result = 0;
		for(int i = 0 ; i < numDays; i++) {
	    result += birdsPerDay[i];; 
		}
		
		return result;
	}
	
	public void getBusyDays() {
		int cont = 0;
		for(int i = 0; i < birdsPerDay.length; i++) {
			if(birdsPerDay[i] >= 5) {
				cont ++;
			}
		}
		System.out.println(cont);
	}
	
	
	//metodo auxiliar para sempre retornar o primeiro dia.
		public int getFinal(int[] matriz) {
			return matriz[matriz.length -1] ;
		}
	
}
