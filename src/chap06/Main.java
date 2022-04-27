package chap06;

import java.util.Scanner;

public class Main {

	public String solution(String text) {
		
		char[] arr = text.toCharArray();
		String result ="";
		for(int i=0;i<text.length();i++) {
			if(text.indexOf(text.charAt(i))== i) result +=text.charAt(i);
		}
		
		return result;

		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main T = new Main();
		
		String text = sc.next();
		
		System.out.println(T.solution(text));
	}
}
