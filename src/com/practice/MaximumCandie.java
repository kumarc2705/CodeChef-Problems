//https://www.codechef.com/problems/CHECHOC
package com.practice;
import java.util.*;
public class MaximumCandie {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=0,N=0,M=0,X=0,Y=0;
		long ans=0;
		if(sc.hasNext())
			T=sc.nextInt();
		while(T-->0) {
			ans=0;
			if(sc.hasNext())
				N=sc.nextInt();
			if(sc.hasNext())
				M=sc.nextInt();
			if(sc.hasNext())
				X=sc.nextInt();
			if(sc.hasNext())
				Y=sc.nextInt();
			
			if(Y<=X) {
				if((N*M)%2==0) {
				    ans=(Y*N*M)/2;
			    }else if(N*M==1) {
				    ans=X;
			    }else {
				    ans=((M-1)*(N-1)*Y)/2+Y+((M-1)*Y)/2+((N-1)*Y)/2;
			    }
			}else if(Y>X && Y<2*X) {
			    if((N*M)%2==0) {
				    ans=(Y*N*M)/2;
			    }else if(N*M==1) {
				    ans=X;
			    }else {
				    ans=((M-1)*(N-1)*Y)/2+X+((M-1)*Y)/2+((N-1)*Y)/2;
			    }
			}else {
				ans=X*N*M;
			}
			System.out.println(ans);
		}
		sc.close();
		
	}

}
