package com.practice;
import java.util.*;
public class MultiThree {
	public static void main(String [] args) {
		int T=0;
		long K=0L;
		int d0=0;
		int d1=0;
		int d2=0;
		List<String> op = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		if(sc.hasNext()) {
			T=sc.nextInt();
			sc.nextLine();
		}
		for(int i=0;i<T;i++) {
			if(sc.hasNext()) {
				K=sc.nextLong();
				d0=sc.nextInt();
				d1=sc.nextInt();
			}
			d2=(d0+d1)%10;
			long quo = (K-3)/4;
			int rem = (int) ((K-3)%4);
			long sumArray = 20*quo + whatToAdd(rem,d2)+d0+d1+d2;
			if(d2==0 || d2==5) {
				sumArray=(d0+d1+d2);
			}
			if(sumArray%3==0) {
				op.add("YES");
			}else {
				op.add("NO");
			}
	}
		sc.close();
		for(String o : op) {
			System.out.println(o);
		}
	}
	public static long fibonacci(long j, int d0, int d1) {
		long answer = 0;
		if(j==0) {
			answer = d0;
		}
		else if(j==1) {
			answer=d1;			
		}else if(j==2) {
			answer=d0+d1;
		}else {
			answer=((int)Math.pow(2,j-2)*(d0+d1))%10;
		}
		return answer;
	}
	public static int whatToAdd(int rem,int d2) {
		int [] arr = new int [4];
		for(int i=0;i<4;i++) {
			if(i==0) {
				arr[i]=0;
			}else if(i==1) {
				arr[i]=(d2*2)%10;
			}else {
				arr[i]=(arr[i-1]*2)%10;
			}
		}
		switch(rem){
		case 0:
			return 0;
		case 1:
			return arr [1];
		case 2:
			return arr [1]+arr[2];
		case 3:
			return arr [1]+arr[2]+arr[3];
		default:
			return 0;
		}

	}
}
