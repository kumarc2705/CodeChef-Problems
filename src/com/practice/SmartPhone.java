package com.practice;
import java.util.*;

public class SmartPhone{
	private static int T;
	private static long [] inputarray= new long[T];
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int a=0;
		if(sc.hasNext()) {
			T = sc.nextInt();
			a= T;
		}
	if(T>0){	
		inputarray= new long[(int)T];
		while(a-->0) {
			if(sc.hasNext()) {
				inputarray[T-a-1]=sc.nextLong();
			}
		}
		sc.close();
	    Arrays.sort(inputarray);
	    for(int i=0;i<inputarray.length;i++) {
		    inputarray[i]=(inputarray.length-i)*inputarray[i];
	    }
	    Arrays.sort(inputarray);
	    System.out.println(inputarray[inputarray.length-1]);
    }else{
        System.out.println(0);
    }
}
}
	


	

