package com.practice;
import java.util.*;
public class Ceiling {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int T=0,K=0,N=0,P=0,loss=0;
		T=sc.nextInt();
		sc.nextLine();
		while(T>0) {
			T--;
			loss=0;
			N=sc.nextInt();
			K=sc.nextInt();
			sc.nextLine();
			for (int i = 0; i < N; i++) {
				P=0;
				P = sc.nextInt();
				if (P - K > 0) {
					loss += (P - K);
				}
			}
			sc.nextLine();
			System.out.println(loss);
		}
		sc.close();
	}
}
