package program;

public class Program {

	public static void main(String[] args) {
		
		Calculator_Conundrum c = new Calculator_Conundrum();
		
		c.calculate(1, 1, "+");
		c.calculate(2, 1, "-");
		c.calculate(2, 2, "*");
		c.calculate(10, 2, "/");
		
		//testes das execptions
		/*
		c.calculate(10, 0, "/");
		c.calculate(1, 1, "");
		c.calculate(1, 1, null);
		c.calculate(1, 1, "?8");
		*/
		
	}

}
