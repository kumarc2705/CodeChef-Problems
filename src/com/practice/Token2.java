package com.practice;
import java.util.*;
public class Token2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T=0,N=0;
		Scanner sc = new Scanner(System.in);
		if(sc.hasNext())
			T=sc.nextInt();
		while(T-->0) {
			if(sc.hasNext())
				N=sc.nextInt();
			int [] arr = new int[N];
			for(int i=0;i<N;i++) {
				if(sc.hasNext())
					arr[i]=sc.nextInt();
			}
			long ans=(long)arr[0];
			int l=arr[0];
			for(int i=1;i<N;i++) {
				if(l>arr[i]) {
					l=arr[i];
				}
				ans+=l;
			}
			System.out.println(ans);
		}
		
		sc.close();
	}

}
