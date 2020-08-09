//https://www.codechef.com/problems/HMAPPY2
package com.practice;
import java.io.*;
import java.util.*;

public class AppyContest{

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T=0;
			long K=0,N=0,A=0,B=0;
			T=Integer.parseInt(br.readLine());
			while(T-->0) {
				StringTokenizer st= new StringTokenizer(br.readLine());
				N=Long.parseLong(st.nextToken());
				A=Long.parseLong(st.nextToken());
				B=Long.parseLong(st.nextToken());
				K=Long.parseLong(st.nextToken());

					if(((long)(N/A)+(long)(N/B))-2*(long)(N/(lcm(A,B)))>=K) {
						System.out.println("Win");
					}else {
						System.out.println("Lose");
					}
			}			
		}catch(Exception e) {
			return;
		}
	}
    static long gcd(long a, long b) 
    { 
    if (a == 0) 
        return b;  
    return gcd((long)(b % a), a);  
    } 
      
    // method to return LCM of two numbers 
    static long lcm(long a, long b) 
    { 
        return (a*b)/gcd(a, b); 
    } 
      

}
