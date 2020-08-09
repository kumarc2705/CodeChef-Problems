package com.practice;
import java.util.*;
public class ChefSteps {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T=0;
		String ans=null;
		long N=0,K=0;
		long [] arr=null;
		if(sc.hasNext())
			T=sc.nextInt();
		sc.nextLine();
		while(T-->0) {
			ans=new String();
			if(sc.hasNext())
				N=sc.nextLong();
			if(sc.hasNext())
				K=sc.nextLong();
			if(N==0) {
				return;
			}
			arr=new long[(int)N];
			for(int i=0;i<N;i++) {
				if(sc.hasNext()) {
					arr[i]=sc.nextLong();
					if(arr[i]%K==0) {
						ans+="1";
					}else {
						ans+="0";
					}
				}
			}
			System.out.println(ans);
		}
		sc.close();
	}
}
