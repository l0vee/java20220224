package chap09.book.exercise.q06;

//지역클래스에서 local 변수를 쓰려고 했는데 effective final이 아니었다. 그래서 오류

public class Chatting {
	void startChat(String chatId) {
		String nickName = null;
		nickName = chatId;
		
		
		Chat chat = new Chat() {
			void start( ) {
			}
			
			void sendMessage(String message) {
				
			}
			
			
			
		}
	}

}
