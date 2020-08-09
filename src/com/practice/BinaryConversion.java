package com.practice;
import java.util.*;
import java.io.*;
public class BinaryConversion {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		try{
		int T = 0, N = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long[] arr = null;
		T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			N = Integer.parseInt(br.readLine());
			arr = new long[N];
			StringTokenizer st=new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
					arr[i] = Long.parseLong(st.nextToken());
			}
			Arrays.sort(arr);
			long max = 0;
			if(N<900){
			for(int i=0;i<N-1;i++) {
				for(int j=i+1;j<N;j++) {
					max=Math.max(max,binaryConversion(arr[i],arr[j]));
				}
			}}
			if(N>=900){
			int i=0,j=N-1;
			while(i<j){
			    int a1=dbi(arr[i]);
			    int a2=dbi(arr[j]);
                if(arr[i]!=arr[j])
			        max=Math.max(max,Math.abs(binaryConversion(arr[i],arr[j])));
			    if(a1<a2){//2 numbers with same no. of binary digits, larger number will be preferred for x,else small will be preferred
			        i++;
			    }else{
			        j--;
			    }
			}}
			System.out.println(max);
		}
		}catch(Exception e){
		    
		}
	}

	public static long binaryConversion(long x, long y) {
		int xk = 0, yk = 0;
		while ((x / (int) (1 << xk) != 0)) {
			xk++;
		}
		while ((y / (int) (1 << yk) != 0)) {
			yk++;
		}

		return Math.max((long) ((long) (x<<yk) + y - x - (long) (y<<xk)),
				(long) ((long) (y<<xk) + x - y - (long) (x<<yk)));
	}
	public static int dbi(long x){
	    int xk = 0;
		while ((x / (int) (1 << xk) != 0)) {
			xk++;
		}
	    return xk;
	}
}
