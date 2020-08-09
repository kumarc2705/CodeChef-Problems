package com.practice;
import java.util.*;
public class ChefAndFood {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	int T=0,N=0;
	int [][] input;
	int [] profit;
	List<Integer> output = new ArrayList<Integer>();
	T=sc.nextInt();
	for(int i=0;i<T;i++) {
		N=sc.nextInt();
		input = new int [N][3];
		profit=new int[N];
		for(int j=0;j<N;j++) {
			input[j][0]=sc.nextInt();
			input[j][1]=sc.nextInt();
			input[j][2]=sc.nextInt();
			profit[j]=((int)input[j][1]/(input[j][0]+1)) * input[j][2];
		}
		Arrays.sort(profit);
		output.add(profit[N-1]);
	}
for(int op : output) {
	System.out.println(op);
}
}
}

