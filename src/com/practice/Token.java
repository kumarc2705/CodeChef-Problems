package com.practice;
import java.util.*;
public class Token {

	public static void main(String[] args) {
		long T=0,N=0,tokencnt=0;
		Scanner sc = new Scanner(System.in);
		long [] arr=null;
		if(sc.hasNext())
			T=sc.nextLong();
		for(int t=0;t<T;t++) {
			tokencnt=0;
			N=sc.nextLong();
			arr=new long[(int) N];
			for(int i=0;i<N;i++) {
				if(sc.hasNext())
					arr[i]=sc.nextInt();
			}
			long k=N-1;
			long prev=minNum(arr,k)[0];
			tokencnt=N*(prev);
			k=minNum(arr,k)[1]-1;
			while(k!=-1) {
				tokencnt+=((minNum(arr,k)[0]-prev)*(minNum(arr,k)[1]+1));
				prev=minNum(arr,k)[0];
				k=minNum(arr,k)[1]-1;
			}
			System.out.println(tokencnt);
		}
		sc.close();
	}
	
	public static long [] minNum (long [] arr,long index){
		long [] min=new long[2];
		min[0]=0;
		min[1]=0;
		if(index== -1) {
			return min;
		}
		min[0]=arr[0];
		for(long i=0;i<=index;i++) {
			if(arr[(int) i]<min[0]) {
				min[0]=arr[(int) i];
				min[1]=i;
			}
		}
		return min;
	}
}
