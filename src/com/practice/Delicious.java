package com.practice;

import java.util.*;

public class Delicious {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 0, N = 0, count = 1, xpointer = 0, ypointer = 0;
		int[][] answerarray = null;
		if (sc.hasNext()) {
			T = sc.nextInt();
		}
		while (T-- > 0) {
			count = 1;
			xpointer = 0;
			ypointer = -1;
			if (sc.hasNext()) {
				N = sc.nextInt();
				answerarray = new int[N][N];
			}
			for (int a = N; a > 0;) {
				for (int k = 0; k < a; k++) {
					ypointer++;
					answerarray[xpointer][ypointer] = count;
					if(a==N) {
						System.out.print(count);
						if (k != N - 1) {
							System.out.print(" ");
						}
					}
					count++;
				}
				a--;
				for (int k = 0; k < a; k++) {
					xpointer++;
					answerarray[xpointer][ypointer] = count;
					count++;
				}
				for (int k = 0; k < a; k++) {
					ypointer--;
					answerarray[xpointer][ypointer] = count;
					count++;
				}
				a--;
				for (int k = 0; k < a; k++) {
					xpointer--;
					answerarray[xpointer][ypointer] = count;
					count++;
				}
			}
			for (int i = 0; i < N; i++) {
				System.out.println();
				for (int j = 0; j < N; j++) {
					System.out.print(answerarray[i][j]);
					if (j != N - 1) {
						System.out.print(" ");
					}
				}
			}
		}
		sc.close();

}

}
