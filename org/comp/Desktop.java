package org.comp;

public class Desktop extends Computer {
private void desktopSize() {
	System.out.println("Desktop Size is 14inch");

}
public static void main(String[] args) {
	Desktop c =new Desktop();
	c.computerModel();
	c.desktopSize();
	
}
}
