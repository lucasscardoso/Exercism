package karlslanguages;

import java.util.ArrayList;
import java.util.List;

public class Karls_Languages {

	private List<String> language;

	public Karls_Languages() {
	}

	public Karls_Languages(List<String> language) {
		super();
		this.language = language;
	}

	public void isEmpty() {

		if (language.isEmpty()) {
			System.out.println("This List Is Empty");
		} else {
			System.out.println("This List Is Not Empty");
		}

	}

	public void languageList(String idioma) {

		language.add(idioma);
		System.out.println("language added: " + idioma);

	}

	public void removeLanguage(String idioma) {

		if (language.contains(idioma)) {
			language.remove(idioma);
		}
	}

	public void firstItem() {
		System.out.println("the first item is: " + language.get(0));
	}

	public void quantityList() {
		System.out.println("the size of the list is: " + language.size());
	}

	public void containsLanguage(String idioma) {

		boolean containsLanguage = true;

		if (language.contains(idioma)) {
			System.out.println("This Language exist! " + containsLanguage);

		} else {
			containsLanguage = false;
			System.out.println("This Language is not exist " + containsLanguage);

		}

	}

	public void isExciting() {

		boolean isExciting;
		if (language.contains("java") || language.contains("kotlin")) {
			isExciting = true;
			System.out.println("cool!  " + isExciting);
		} else {
			isExciting = false;
		}
	}

}
