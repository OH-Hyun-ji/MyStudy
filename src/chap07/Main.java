package chap07;

import java.util.Scanner;

public class Main {

	final static String SUCCES = "YES";
	final static String FAIL = "NO";
	
	
	public String solution(String text) {
		text = text.toUpperCase();
		
		char[] arr = text.toCharArray();
		int st=0, rt = text.length()-1;
		int count =0;
		while(st<rt) {
			if(arr[st] == arr[rt]) {
				st++;
				rt--;
				count++;
			}else {
				break;
			}
		}
		if(count>0) {
			return SUCCES;
		}else return FAIL;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String text = sc.next();
		
		Main T = new Main();
		System.out.println(T.solution(text));
		
	}
}
