package com.practice;
import java.util.*;
public class TomJerry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int T=0;
	long TS=0L,minNumber=0L,answer=0L;
	T=sc.nextInt();
	while(T-->0) {
		minNumber=0L;
		answer=0L;
		TS=sc.nextInt();
		minNumber=(long)Math.pow(2,power2(TS));	
		answer=(long)(TS/minNumber);
		System.out.println(answer);
	}
	sc.close();
	}	
	public static long power2(long a) {
		long initialNumber=a;
		long answer=0;
		while(initialNumber%2==0) {
			initialNumber=initialNumber/2;
			answer++;
		}
		return answer+1;
	}
}
