package week3.day1.assigment5;

public class Automation extends MultipleLangauge implements Language, TestTool {

	public void selenium() {
		System.out.println("Implemting Selenium from Automation");
	}

	public void java() {
		System.out.println("Implemting JAVA from Automation");
	}

	@Override
	public void ruby() {
		System.out.println("Implemting Ruby from Automation");
	}


	public static void main(String[] args) {

		Automation lang = new Automation();
		lang.selenium();
		lang.java();
		lang.ruby();
		lang.python();

	}
}
