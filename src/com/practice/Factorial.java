package com.practice;
import java.util.*;

public class Factorial {
	public static void main (String [] args){
		int T=0;
		int N=0;
		List<Integer> list= new ArrayList<Integer> (); 
		Scanner sc = new Scanner(System.in);
		if(sc.hasNext()) {
			T=sc.nextInt();
		}
		while(T-->0) {
			if(sc.hasNext()) {
				N=sc.nextInt();
			list.add(noOfZeroedInFactorial(N));
			}
		}
		for(int el : list) {
			System.out.println(el);
		}
		sc.close();
	}

public static int noOfZeroedInFactorial(int a) {
	int output=0;
	int K = a;
	int power=1;
	while(K!=0) {
		K = (int) (a/Math.pow(5,power));
		output+=K;
		power++;
	}
	return output;
}
}