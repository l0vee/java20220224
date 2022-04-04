package chap18.lecture.p07network;

import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class App05Client {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.0.7", 38080));
		
		boolean run = true;
		while(run) {
			Socket socket = serverSocket.accept();
			Thread thread = new Thread(()->{
				
				try(
				InputStream is = socket.getInputStream();
				Reader rd = new InputStreamReader(is);
				bufferedReader br = new BufferedReader(rd);
						){
					
					String data = "";
					while(!(data = br.readLine()).equals("exit")) {
						System.out.println(socket.getKeepAlive()'
								
								
								"[클라이언트왈]:" + data);
					}
					
					System.out.println("[클라이언트채팅 종료]");
					
				} catch(Exception e) {
					e.printStackTrace();
				}
				
				
			})
	}

}
	
}
