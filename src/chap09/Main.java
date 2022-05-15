package chap09;

import java.util.Scanner;

public class Main {

	public Integer solution(String text) {
		

		String result = text.replaceAll("[^0-9]", "");
		int answer =0; 
		
		char[] arr = result.toCharArray();
		for(char c : arr) {
			if(c >=48 || c<=57) answer = answer * 10 + (c-48);
			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		Main T = new Main();
		
		System.out.println(T.solution(text));
	}
}
