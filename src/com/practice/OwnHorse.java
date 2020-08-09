package com.practice;
import java.util.*;
public class OwnHorse {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count=11;
		sc.close();
		while(--count>0) {
			System.out.println(N*(10-count+1));
		}		
	}
}
