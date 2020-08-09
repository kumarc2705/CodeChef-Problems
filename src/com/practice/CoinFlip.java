package com.practice;
import java.util.*;
public class CoinFlip {
	public static void main (String [] args) throws Exception {
		int T=0;
		int G=0;
		List<Integer> output = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		T=sc.nextInt();
		int count=T;
		while(count-->0) {
			if(sc.hasNext()) {
				G=sc.nextInt();
				sc.nextLine();
			}
			int [][] INQ = new int[G][3]; 
			for(int i=0;i<G;i++) {
				for(int j=0;j<3;j++) {
					if(sc.hasNext())
						INQ[i][j]= sc.nextInt(); 
					}
				sc.nextLine();
				output.add(findTheAnswer(INQ[i]));
			}	

	}
		sc.close();
		for(int op: output) {
			System.out.println(op);
		}
	}

	
	public static int findTheAnswer(int [] a) {
		int sameface=0;
		int changedface=0;
		int N=a[1];
		if(N%2==0) {
			sameface=N/2;
		}else {
			sameface=(N-1)/2;
		}
		changedface=N-sameface;
		if(a[0]==a[2]) {
			return sameface;
		}else {
			return changedface;
		}
}
}
