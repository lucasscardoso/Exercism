package program;

public class Program {

	public static void main(String[] args) {

		Squeaky_Clean s = new Squeaky_Clean();
		
		s.SqueakyClean("my   teste");
		s.SqueakyCleanKebaCase("my-test-e");
		s.SqueakyCleanLeetspeak("h3110 73s73 410");
		s.SqueakyCleanOmitCharacters("h@#$%%aaass12556b");
	}
}

