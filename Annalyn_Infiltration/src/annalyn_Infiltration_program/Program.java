package annalyn_Infiltration_program;

public class Program {

	public static void main(String[] args) {
		
		AnnalynInfiltration ann = new AnnalynInfiltration();
		
		//annalyn can fast attack?
		//ann.canFastAttack(true);
		//ann.canFastAttack(false);
		
		// annalyn can spy?
		//ann.canSpy(false, false, false);
		
		//annalyn can bird sing?
		//ann.canSignalPrisoner(true, false);
		
		//analyn can rescue prisioner?
		ann.canFreePrisoner(true, false, true, true);
	}

}


//true acordado
//false dormindo