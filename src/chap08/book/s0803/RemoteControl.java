package chap08.book.s0803;

public interface RemoteControl {
	//상수
	public int MAX_VOLUME = 10;
	public int MiN_VOLUME = 0;
	
	//추상메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
//	public void setMute(boolean mute);
	
	//디폴트 메소드
	
}
