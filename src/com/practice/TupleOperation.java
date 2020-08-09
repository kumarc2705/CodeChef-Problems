package com.practice;

import java.util.*;

public class TupleOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = 0, a = 0, answer = 0, index = -1;
		int[] iparray = new int[3], oparray = new int[3];
		Integer[] diffarray = new Integer[3], factorarray = new Integer[3], percentageArray = new Integer[3];
		if (sc.hasNext()) {
			T = sc.nextInt();
		}
		while (T-- > 0) {
			answer = 3;
			for (int i = 0; i < 3; i++) {
				if (sc.hasNext()) {
					a = sc.nextInt();
				}
				iparray[i] = a;
			}
			for (int i = 0; i < 3; i++) {
				if (sc.hasNext()) {
					a = sc.nextInt();
				}
				oparray[i] = a;
				if (a == iparray[i % 3]) {
					index = i % 3;
					answer--;
				}
				diffarray[i % 3] = a - iparray[i % 3];
				if (a % iparray[i % 3] == 0) {
					factorarray[i % 3] = a / iparray[i % 3];
				}
				percentageArray[i % 3] = a % iparray[i % 3];
			}
			if (answer == 2) {
				List<Integer> dsubarray = new ArrayList<Integer>();
				List<Integer> fsubarray = new ArrayList<Integer>();
				for (int i = 0; i < 3; i++) {
					if (i == index) {
						continue;
					}
					if (null != diffarray[i])
						dsubarray.add(diffarray[i]);
					if (null != diffarray[i])
						fsubarray.add(factorarray[i]);
				}
				if (null != dsubarray && dsubarray.size() == 2 && dsubarray.get(0) == dsubarray.get(1)) {
					answer--;
				} else if (null != fsubarray && fsubarray.size() == 2 && fsubarray.get(0) == fsubarray.get(1)) {
					answer--;
				}
			} else if (answer == 3) {
				int i = 0;
				int j = 0;
				int countd = 0;
				int countf = 0;
				int countp = 0;
				while (i <= 1) {
					j = i + 1;
					while (j > i && j < 3) {
						if (null != diffarray[i] && null != diffarray[i + 1] && diffarray[i] == diffarray[j]) {
							countd++;
						}
						if (null != factorarray[i] && null != factorarray[i + 1] && factorarray[i] == factorarray[j]) {
							countf++;
						}
						if (null != percentageArray[i] && null != percentageArray[i + 1]
								&& percentageArray[i] == percentageArray[j]) {
							countp++;
						}
						j++;
					}
					i++;
				}
				i = 0;
				j = 0;
				if (Math.max(countd, countf) == 1) {
					answer=2;
				} else if (Math.max(countd, countf) == 2 || Math.max(countd, countf) == 3) {
					answer=1;
				} else if (countp!=0) {
					answer=2;
				}
			}
			System.out.println(answer);
		}
		sc.close();
	}

}
