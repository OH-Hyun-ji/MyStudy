package chap10;

import java.util.Scanner;

public class Main {

	public int[] solution(String text,char ch) {
		char[] arr = text.toCharArray();
		int[] arr1 = new int[arr.length];
		int center =1000;
		
		for(int i=0; i<text.length();i++) {
			if(arr[i]== ch) {
				center = 0;
				arr1[i]= center;
			}
			else {
				center++;
				arr1[i]= center;
			}
			
		}
		
		for(int i=text.length()-1;i>=0;i--) {
			if(arr[i]==ch) center=0;
			else {
				center++;
				arr1[i] =Math.min(arr1[i], center);
			}
		}
		
		return arr1;
		
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		char ch = sc.next().charAt(0);
		
		Main T = new Main();
		for(int s : T.solution(text, ch)) {
			System.out.print(s+" ");
		}
	}
}
