package chap18.lecture.p07network;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;


public class App03Server {
	public static void main(String[] args) {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("172.30.1.27", 38080));
		
		System.out.println("[클라이언트 연결 기다림]");
		Socket socket = serverSocket.accept();
		System.out.println("[클라이언트와 연결 성공]");
		
		System.out.println("[클라이언트가 보낸 파일 받기]");
		InputStream is = socket.getInputStream(); //파일 기준 받아야 하니까 input
		BufferedInputStream bis = new BufferedInputStream(is);
		
		byte[] datas = new byte[1024];
		int len = 0;
		
		String path = "output/NetWorkEx1.dat";
		FileOutputStream fos = new FileOutputStream(path);
		BuferedOutputStream bos = new BuferedOutputStream(fos);
		while((len = bis.read(datas)) != -1 ) {
			bos.write(datas,0,len);
			
		}
		
		System.out.println("[클라이언트가 받은 파일 다 받음]");
		bos.close();
		bis.close();
		is.close();
		socket.close();
		serverSocket.close();
		
		System.out.println("서버 프로그램 종료");
	}

}