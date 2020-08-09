package com.practice;
import java.util.*;
public class Lapindrome {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int T=0;
			T = sc.nextInt();
			if(sc.hasNext())
				sc.nextLine();
		int aa=T;
		String [] inputStringList = new String[T];
		while(T-->0) {
			if(sc.hasNext()) {
				String candidate = sc.nextLine();
				inputStringList[aa-T-1]=candidate;
			}
		}
		for(int j=0;j<inputStringList.length;j++) {
			if(isLapindrome(inputStringList[j])) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
	public static boolean isLapindrome(String a) {
		int length=0;
		String s1=null;
		String s2=null;
		if(null!=a && a.length()!=0) {
			length=a.length();
			boolean splitlogic = isNumberEven(length);
			if(splitlogic) {
				s1=a.substring(0,length/2);
				s2=a.substring(length/2,length);
			}else {
				s1=a.substring(0,(length-1)/2);
				s2=a.substring((length+1)/2,length);
			}
			HashMap<Character,List<Integer>> hashMapS= new HashMap<>();
			for(int i=0; i< s1.length();i++) {
				char ch1 = s1.charAt(i);
				char ch2= s2.charAt(i);
				if(hashMapS.containsKey(ch1)) {
					List<Integer> valueList = hashMapS.get(ch1);
					Integer valueS1=valueList.get(0);
					valueS1++;
					valueList.set(0,valueS1);
					hashMapS.replace(ch1,valueList);
				}else {
					List<Integer> valueList = new ArrayList<Integer>();
					valueList.add(1);
					valueList.add(0);
					hashMapS.put(ch1,valueList);
				}
				
				if(hashMapS.containsKey(ch2)) {
					List<Integer> valueList = hashMapS.get(ch2);
					Integer valueS2=valueList.get(1);
					valueS2++;
					valueList.set(1,valueS2);
					hashMapS.replace(ch2,valueList);
				}else {
					List<Integer> valueList = new ArrayList<Integer>();
					valueList.add(0);
					valueList.add(1);
					hashMapS.put(ch2,valueList);
				}
			}
			boolean returnvalue=true;
			for(Map.Entry<Character,List<Integer>> entry : hashMapS.entrySet()) {
				List<Integer> valueList = entry.getValue();
				if(valueList.get(0)!=valueList.get(1)) {
					returnvalue = false;
					break;
				}
			}
			return returnvalue;
		}
		return true;
	}
	public static boolean isNumberEven(Integer n){
		if(n%2==0) {
			return true;
		}
		return false;
	}
}
