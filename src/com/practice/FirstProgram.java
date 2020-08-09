package com.practice;
import java.util.Scanner;
public class FirstProgram {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int [] Ns = new int[T];
		int [][] pos = new int [T][];
		for(int i=0;i<T;i++) {
			if(sc.hasNext()) {
				Ns[i] = sc.nextInt();
				int temp[] = new int[Ns[i]];
				for(int j=0; j < Ns[i];j++) {
					if(sc.hasNext()) {
						temp[j]=sc.nextInt();
					}
				}
				pos[i]=temp;
			}
		}
		Boolean yesOrNo=true;
		for(int i=0;i<T;i++) {
			int N = Ns[i];
		   int[] queue = pos[i];
		   int prevpos= -7;
		   int currentpos=0;
		   int posn=0;
		   for(currentpos=0;currentpos<queue.length;currentpos++) {
			   posn=pos[i][currentpos];
			   if(posn==1) {
				  if(currentpos-prevpos<6 && currentpos-prevpos !=0) {
					  yesOrNo=false;
					  break;
			      }
				  yesOrNo=true;
				  prevpos=currentpos;				  
			   }
		   }
		   System.out.println(currentpos+ "  "+ prevpos);
		   
			if(yesOrNo) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		   
		}

	}
}
