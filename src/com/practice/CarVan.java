package com.practice;
import java.util.*;
public class CarVan {
	public static void main (String [] args) {
		int T=0;
		int N=0;
		int speed=0;
		Scanner sc= new Scanner(System.in);
		List<Integer> inputarray = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> output = new ArrayList<Integer>();
		if(sc.hasNext()) {
			T = sc.nextInt();
		}
		while(T-->0) {
			if (sc.hasNext()) {
					N=sc.nextInt();
					for(int i=0;i<N;i++) {
						if(sc.hasNext()) {
							speed = sc.nextInt();
						}
						if(i!=0 && inputarray.get(i-1)<speed) {
							inputarray.add(inputarray.get(i-1));
						} else {
							inputarray.add(speed);
						}
						set.add(inputarray.get(i));
					}
					//System.out.println(inputarray);
					//System.out.println(set);
					output.add(set.size());
				}
			set.clear();
			inputarray.clear();
			}
		for(int op : output) {
			System.out.println(op);
		}
			sc.close();
		}
	}

