package com.practice;
import java.util.*;
public class UEFAProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T=0,N=0;
		String str=null;
		if(sc.hasNext()) {
			T=sc.nextInt();
		}
		for(int i=0;i<T;i++) {
			if(sc.hasNext()) {
				N=sc.nextInt();
				sc.nextLine();
				str= sc.nextLine();
			}

			int a=0,b=0,answer=2*N;
			for(int j=0;j<str.length();j++) {
				if(j%2==0) {
					if(str.charAt(j)=='1') {
						a++;
					}
					if(a>(N-(j/2)+b)) {
						answer=j+1;
						break;
					}
					if(b>(N-(j/2+1)+a)) {
						answer=j+1;
						break;
					}
				}else {
					if(str.charAt(j)=='1') {
						b++;
					}
					if(b>(N-(j/2+1)+a)) {
						answer=j+1;
						break;
					}
					if(a>(N-(j/2+1)+b)) {
						answer=j+1;
						break;
					}
				}
			}
			System.out.println(answer);
		}
		sc.close();
	}

}
