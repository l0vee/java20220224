package soojebi.exam;

public class X03 {
	public static void main(String[] args) {
		int i=3;
		int k=1;
		
		switch(i) {
		case 0:
		case 1:
		case 2:
		case 3: k=0;
		case 4: k+=3;
		case 5: k-=10;
		default: k--;
		}
		
		System.out.println(k);
	}
}

//참거짓 따져서 넘어가는 거 아니고
//break나 답 나올때까지
//시키는거 다해요
