package com.practice;
import java.util.*;
public class ChefString {

	public static void main(String[] args) {
		int T=0,count=0;
		String str=null;
		Scanner sc = new Scanner(System.in);
		if(sc.hasNext()) {
			T=sc.nextInt();
			sc.nextLine();
		while(T-->0) {
			count=0;
			str=sc.nextLine();
			if(null!=str && !str.contains("xy") && !str.contains("yx")) {
					count=0;
			}else {
				for(int i=0;i<str.length()-1;i++) {
					if(str.charAt(i)!=str.charAt(i+1)) {
						count++;
						i++;
					}	
				}
			}
			System.out.println(count);
		}
		sc.close();
	}
	}
}
