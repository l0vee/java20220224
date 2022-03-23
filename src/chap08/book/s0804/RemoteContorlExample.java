package chap08.book.s0804;

import chap08.book.s0802.RemoteControl;
import chap08.book.s0803.Television;

public class RemoteContorlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		
		
		RemoteControl.changeBattery();
	}

}
