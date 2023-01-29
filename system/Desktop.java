package org.system;

public class Desktop extends Computer{
	
	public void desktopSize() {
		System.out.println("The Desktop size is 34*45");
	}

	public static void main(String[] args) {
		Desktop dd = new Desktop();
		dd.desktopSize();
		dd.computerModel();
	}

}
