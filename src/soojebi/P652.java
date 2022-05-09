package soojebi;

public class P652 {
	public static void main(String[] args) {
		int i= 1;
		int sum=0;
		do {
			sum = sum+i;
			i++;
			
		} while(i<0);
		
		System.out.println(sum);
	}
	
} //do는 무조건 실행 (i=2고 sum은 1)