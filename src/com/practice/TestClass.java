package com.practice;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes

*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner s = new Scanner(System.in);
        String name=null;
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        if(s.hasNext())
            name = s.nextLine();
        int length = name.length();
        int count =length;
        String substring=null;
        for(int i=0;i<length-1;i++){
        	int j=i+2;
            for(;j<=length;j++){
                substring = name.substring(i,j);
                if(map.containsKey(substring)) {
                	count++;
                }else if(substring.length()!=1){
                    int k=0;
                    for(k=0;k<substring.length()-1;k++){
                        if(substring.charAt(k)==substring.charAt(k+1)){
                            continue;
                        }else if(substring.length()%2!=0 
                        && (k==(substring.length()-3)/2)){
                        	if(substring.charAt(k)==substring.charAt(k+2))
                        		k++;
                        		continue;
                        }else{
                            break;
                        }
                    }
                    if(k==substring.length()-1){
                        count++; 
                        map.put(substring,1);
                    }
                    
                }
            }
        }
        System.out.println(count);
        s.close();
    }
}
