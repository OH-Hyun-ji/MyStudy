package chap03;

import java.util.Scanner;

public class Main {
	
	//문장에서 가장 긴 단어 추출하기 

	public String solution(String text) {
		String max ="";
		for(String voca : text.split(" ")) {
			if(max.length() < voca.length()) {
				max = voca;
			}
		}
		return max;
	}
	
	
	public static void main(String[] args){
	  
		Scanner sc =new Scanner(System.in);
		
		String text = sc.nextLine();
		
		Main T = new Main();
		
		System.out.println(T.solution(text));
		
		
		return ;
	}
}