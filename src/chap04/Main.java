package chap04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public ArrayList<String> solution(String[] arr, int count){
		ArrayList<String> list = new ArrayList<String>();
		for(String str : arr) {
			int st=0, rt=str.length()-1;
			char[] c = str.toCharArray();
			
			while(st<rt) {
				char s = c[st];
				c[st] = c[rt];
				c[rt] = s;
				st++;
				rt--;
			}
			String text = String.valueOf(c);
			list.add(text);
			
		}
		return list;
	}

	public static void main(String[] args){	
		Scanner sc = new Scanner(System.in);
		Main T = new Main();
		int count = sc.nextInt();
		String[] arr = new String[count];
		
		for(int i=0;i<count;i++) {
			arr[i] = sc.next();	
		}
		
		ArrayList<String> arr1 = T.solution(arr, count);
		for(String x : arr1 ) {
			System.out.println(x);
		}
	}
	
}