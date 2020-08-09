package com.practice;
import java.util.*;

public class ReverseNumber {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int T=0;
		if(sc.hasNext()) {
			T = sc.nextInt();
		}
		int a=T;
		int N=0;
		List<Integer> listint = new ArrayList<Integer>();
		while(a-->0) {
			if(sc.hasNext()) {
				N=sc.nextInt();
			}
			String temp = String.valueOf(N);
			StringBuilder sb = new StringBuilder(temp);
			temp=sb.reverse().toString();
			N = Integer.parseInt(temp);
			listint.add(N);
		}
		sc.close();
		for(int eachel : listint) {
			System.out.println(eachel);
		}
	}
}
