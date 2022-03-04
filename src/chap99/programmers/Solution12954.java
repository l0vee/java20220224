package chap99.programmers;

public class Solution12954 {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];

//		for (int i = 1; i <= n; i++) {
//			answer[i - 1] = x * (long) i;
//		} 이것도 되고 밑에도 됨
		
		for (int i = 0; i < n; i++) {
			answer[i] = x * (i + 1L);
		}

		return answer;
	}
}