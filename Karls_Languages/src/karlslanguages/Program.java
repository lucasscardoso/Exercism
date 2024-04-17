package karlslanguages;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> language = new ArrayList<>();

		Karls_Languages k = new Karls_Languages(language);

		k.isEmpty();

		k.languageList("phyton");
		k.languageList("javascript");
		k.languageList("php");
		// k.languageList("java");
		// k.languageList("kotlin");
		k.languageList("sql");

		k.isEmpty();

		k.removeLanguage("ingles");

		k.isEmpty();

		k.firstItem();
		k.quantityList();

		k.containsLanguage("l");
		k.isExciting();
	}

}
