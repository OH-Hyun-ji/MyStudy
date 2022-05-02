package chap09;

import java.util.Scanner;

public class Main {

	public String solution(String text) {
		char[] arr = text.toCharArray();
		String result ="";
		for(char c : arr) {
			for(int i=0;i<10;i++) {
				System.out.println("c : "+ c);
				System.out.println("i : "+ i);
				if(c == i) result += String.valueOf(i);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		Main T = new Main();
		
		System.out.println(T.solution(text));
	}
}
