package com.practice;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Assembler
{
    public static void main(String[] args)throws Exception{
        try{
          Scanner  sc=new Scanner(System.in);
		int ts=sc.nextInt();
		while(ts-- > 0){
			String str=sc.next();
			char[] ch=str.toCharArray();
			int n=ch.length;
			int count=0,max=0;
			 for(int i=0;i<n;i++){
			     if(ch[i]=='<'){
			         count++;
			     }
			     else{
			         count--;
			     }
			     if(count==0){
			         max=i+1;
			     }
			     else if(count<0){
			        break; 
			     }
			 }
			 System.out.println(max);
		}  
        }
        catch(Exception e){
            System.exit(0);
        }
    }
}
