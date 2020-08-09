package com.practice;

import java.util.*;

public class Delicious1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 0, N = 0, count = 0;
		if (sc.hasNext()) {
			T = sc.nextInt();
		}
		while (T-- > 0) {
			if (sc.hasNext()) {
				N = sc.nextInt();
			}
			count = 0;
			for (int i = 0; i < N; i++) {
				if (N % 2 != 0) {
					for (int j = 0; j < N; j++) {
						count++;
						System.out.print(count + " ");
					}
				} else {
					for (int j = 0; j < N; j++) {
						if (i % 2 == 0) {
							count++;
							System.out.print(count + " ");
						} else {
							System.out.print(((2 * i + 1) * N + -count) + " ");
							count++;
						}
					}
				}
				System.out.println();
			}
		}
		sc.close();
	}
}
