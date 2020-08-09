package com.practice;
import java.util.*;
import java.io.*;


public class InfixToPostFix {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T= Integer.parseInt(br.readLine());
		Stack<Character> stk = new Stack<Character>();
		while(T-->0) {
			int N=Integer.parseInt(br.readLine());
			String str=br.readLine();
			str=str.substring(0,N);
			str='('+str+')';
			char [] chr=str.toCharArray();
			for(char ch:chr) {
				if(ch=='(') {
					stk.push(ch);
				}else if(Character.isLetter(ch)) {
					System.out.print(ch);
				}else if(ch==')'){
					while(!stk.isEmpty() && stk.peek()!='(') {
						System.out.print(stk.pop());
					}
					if(stk.peek()=='(') {
						stk.pop();
					}
				}else {
					stk.push(ch);
				}
			}
		}
		}catch(Exception e) {
			
		}
	}

}
