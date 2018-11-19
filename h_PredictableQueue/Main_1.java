package h_PredictableQueue;

import java.util.Scanner;

public class Main_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt(); // �ؾ��ϴ� ��
		int t = scan.nextInt(); // �Է¹��� �ð�

		long[] works = new long[w];
		long[] time = new long[t];

		for (int i = 0; i < w; i++) {
			int tmp = scan.nextInt();
			if (i == 0) {
				works[i] = tmp;
			} else {
				works[i] = tmp + works[i - 1];
			}
		}

		for (int i = 0; i < t; i++) {
			time[i] = scan.nextInt();
		}
		
		for (int i = 0; i < t; i++) {
			if (time[i] >= works[w - 1]) {
				System.out.println(w);
			} else {
				int j = 0;
				while (works[j] <= time[i]) {
					j++;
				}
				System.out.println(j);
			}
		}

	}
}
