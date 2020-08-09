package com.practice;

import java.util.*;

public class IceCream {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if (sc.hasNext()) {
			int T = sc.nextInt();
			int N = 0,P=0;
			int [] Ps;
			int count5 = 0, count10 = 0;
			String ans = "YES";
			while (T-- > 0) {
				N = 0;
				ans = "YES";
				count5 = 0;
				count10 = 0;
				if (sc.hasNext()) {
					N = sc.nextInt();
					Ps=new int[N];
					for(int u=0;u<N;u++) {
						if (sc.hasNext()) {
							Ps[u] = sc.nextInt();
						}
					}
					for (int i = 0; i < N; i++) {
							P=Ps[i];
							if (P != 5 && i == 0) {
								ans = "NO";
								break;
							}
							if (P == 15 && i == 1) {
								ans = "NO";
								break;
							}
							if (P == 5) {
								count5++;
							} else if (P == 10) {
								count10++;
								if (count5 == 0) {
									ans = "NO";
									break;
								} else {
									count5--;
								}
							} else if (P == 15) {
								if (count10 == 0 && count5 < 2) {
									ans = "NO";
									break;
								} else if (count10 > 0) {
									count10--;
								} else if (count5 >= 2) {
									count5--;
									count5--;
								}
							}
						}
					}
				System.out.println(ans);
				}
			}
			sc.close();
	}
}
