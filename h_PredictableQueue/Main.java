package h_PredictableQueue;

import java.util.Scanner;

public class Main {

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
			if (time[i] >= works[w-1]) {System.out.println(w);			}
			for (int j = 0; j < w - 1; j++) {
				if (works[j] <= time[i] && time[i] < works[j + 1]) {
					System.out.println(j + 1);
				}
			}
		}
	}
}
