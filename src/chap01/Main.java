package chap01;

import java.util.Scanner;

public class Main {
	
	//알파벳 갯수 찾기 (대소문자 구별없이)
	
	public int solution(String input1, char input2) {
		int count =0;
		input1 = input1.toUpperCase();
		input2 = Character.toUpperCase(input2);	
		for(char c : input1.toCharArray()) {
			if(c == input2) count++;
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
		Main main =new Main();
	//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		Character input2 = sc.next().charAt(0);
		
		int num = main.solution(input1, input2);
		
		System.out.println(main.solution(input1, input2));
	}
}
