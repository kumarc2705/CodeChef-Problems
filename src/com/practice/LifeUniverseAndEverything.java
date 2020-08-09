package com.practice;
import java.util.*;


public class LifeUniverseAndEverything {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		boolean loopbreaker=true;
		while(loopbreaker) {
			if(sc.hasNext()) {
				int i=sc.nextInt();
				if(i==42) {
					break;
				}
				System.out.println(i);
			}
		}
		sc.close();

	}

}
