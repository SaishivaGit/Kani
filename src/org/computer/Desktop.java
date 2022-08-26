package org.computer;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("size is 12*10");

	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.desktopSize();
		d.computerModel();
	}

}
