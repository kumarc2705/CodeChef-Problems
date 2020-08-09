package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class SecondProgram {

	public static void main(String[] args) {
		int T = 0;
		Scanner sc = new Scanner(System.in);
		if (sc.hasNext()) {
			T = sc.nextInt();
		}
		int[] Ns = new int[T];
		long price[][] = new long[T][];

		for (int i = 0; i < T; i++) {
			if (sc.hasNext()) {
				Ns[i] = sc.nextInt();
				long pricecolumn[] = new long[Ns[i]];
				price[i]=pricecolumn;
				for (int j = 0; j < Ns[i]; j++) {
					price[i][j] = sc.nextLong();
				}
			}
		}
		sc.close();
		long profit = 0;
		long decrementcounter = 0;
		for (int k = 0; k < T; k++) {
			profit = 0;
			decrementcounter = 0;
			Arrays.sort(price[k]);
			for (int m = price[k].length-1; m >= 0; m--) {
				if(price[k][m]>decrementcounter){
					profit += (price[k][m] - decrementcounter);
					profit%=1000000007L; //Important line
				}else {
					
				}
				decrementcounter++;
			}
			System.out.println(profit);
		}
	}
}
