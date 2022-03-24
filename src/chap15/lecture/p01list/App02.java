package chap15.lecture.p01list;

import java.util.ArrayList;

public class App02 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(8);
		list.add(2);

		//최대값. 최소값 구하는 코드 만들기

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < list.size(); i++) {
			//이것도		Math.max(list.get(i),max);
			//가능  		Math.min(list.get(i),min);

			max = list.get(i) > max ? list.get(i) : max;
			if (list.get(i) < min) {
				min = list.get(i);
			}
		}

		System.out.println(max);
		System.out.println(min);

		// 향상된 for
		for (Integer e : list) {
			max = Math.max(e, max);
			min = Math.min(e, min);
		}

		System.out.println(max);
		System.out.println(min);

	}

}
