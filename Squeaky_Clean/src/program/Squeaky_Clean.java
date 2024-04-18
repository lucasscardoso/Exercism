package program;

public class Squeaky_Clean {

	private String word;

	public Squeaky_Clean() {
	}

	public Squeaky_Clean(String word) {

		this.word = word;
	}

	public void SqueakyClean(String word) {
		String replaceNullByUnderScor = word.replace(" ", "_");
		System.out.println(replaceNullByUnderScor);
	}

	public void SqueakyCleanKebaCase(String word) {

		StringBuilder result = new StringBuilder();
		boolean verificaLetra = false;

		for (char c : word.toCharArray()) {
			if (c == '-') {
				verificaLetra = true;
			} else {
				if (verificaLetra) {
					result.append(Character.toUpperCase(c));
					verificaLetra = false;
				} else {
					result.append(c);
				}
			}
		}

		System.out.println(result.toString());
	}

//  leetspeak 4 = A, 3 = E, 0 = O, 1 = L, 7 = T

	public void SqueakyCleanLeetspeak(String word) {

		boolean existeLeet = false;

		for (char w : word.toCharArray()) {
			if (w == '4' || w == '3' || w == 0 || w == 1 || w == 7) {
				existeLeet = true;
			} else {
				if (existeLeet) {
					word = word.replace('4', 'a');
					word = word.replace('3', 'e');
					word = word.replace('0', 'o');
					word = word.replace('1', 'l');
					word = word.replace('7', 't');
					existeLeet = false;
				}
			}
		}

		System.out.println(word);
	}
	
	// regex que substitui tudo que não são letras.
	
	public void SqueakyCleanOmitCharacters(String word) {
		
		System.out.println(word.replaceAll("[^a-zA-Z]", ""));
	}

}
