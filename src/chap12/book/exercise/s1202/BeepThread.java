package chap12.book.exercise.s1202;

import java.awt.Toolkit;

public class BeepThread extends Thread {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				sleep(500);
			} catch (Exception e) {
			}
		}
	}
}
