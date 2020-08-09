//https://www.codechef.com/LRNDSA02/problems/ZCO12001
package com.practice;

import java.util.*;
import java.io.*;

public class Bracket {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int nd = 0, pos = 0, el = 0, pos2 = 0, N = 0;
			String a = br.readLine();
			N = Integer.parseInt(a);
			if (N == 0)
				return;
			int[] arr = new int[N];
			String[] str = null;
			str = br.readLine().split(" ");
			for (int i = 0; i < str.length; i++) {
				arr[i] = Integer.parseInt(str[i]);
			}
			Stack<Integer> st = new Stack<Integer>();
			int temp = 0;
			for (int i = 0; i < N; i++) {
				if (arr[i] == 1) {
					st.push(arr[i]);
					temp++;
					if (nd < st.size()) {
						nd = st.size();
						pos = i + 1;
					}
				} else {
					st.pop();
				}
				if (st.size() == 0) {
					if (2 * temp > el) {
						el = 2 * temp;
						pos2 = i + 2 - el;
					}
					temp = 0;
				}
			}
			System.out.print(nd + " ");
			System.out.print(pos + " ");
			System.out.print(el + " ");
			System.out.println(pos2);
		} catch (Exception e) {
			return;
		}
	}

}
