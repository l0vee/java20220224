package chap12.book.exercise.s1202;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } 
			catch (Exception e) {}
		}
	}	
}
//
//	//Runnable 익명 객체 사용
//	Thread thread = new Thread(new Runnable() {
//		@override
//		public void run() {
//			Toolkit toolkit = Toolkit.getDefaultToolkit();
//			for(int i=0; i<5; i++) {
//				toolkit.beep();
//				try { Thread.sleep(500); } catch(Exception e) {}
//				
//			}
//		}
//});
//	
//	//람다식 이용
//	
//	Thread thread = new Thread(() -> {
//		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		for(int i=0; i<5; i++) {
//			toolkit.beep();
//			try { Thread.sleep(500); } catch(Exception e) {}
//		}});
