package chap12.book.exercise.exercise02;

public class ThreadExample {
	public static void main(String[] args) {
		MovieThread thread1 = new MovieThread();
		thread1.start();
		
		Thread thread2 = new Thread(new MusicRunnable());
		thread2.start();
	}

}

//sleep하고 surround method