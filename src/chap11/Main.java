package chap11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public String solution(String text) {
		String answer ="";
		text=text+" ";
		int num =0;
		for(int i=0;i<text.length()-1;i++) {
			if(text.charAt(i)== text.charAt(i+1)) num++;
			else {
				answer += text.charAt(i);
				if(num > 1) answer += String.valueOf(num);
				num=1;
			}
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
