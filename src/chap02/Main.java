package chap02;

import java.util.Scanner;

public class Main {
	public String solution(String input) {
		String answer = ""; 
		
		for(char x : input.toCharArray()) {
			if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
			else answer += Character.toLowerCase(x);
		}
		return answer;
		
/* 나의 풀이
 * 		String result ="";
 
		char[] arr = input.toCharArray();
		
		for (int i=0;i<arr.length;i++) {
			if(arr[i] == Character.toUpperCase(arr[i])) {
				arr[i] = Character.toLowerCase(arr[i]);
				
			}else {
				arr[i] = Character.toUpperCase(arr[i]);
			}
			System.out.println("arr[i] : " +arr[i]);
			result += arr[i];
		}			
		return result;
*/
	}
	
	public static void main(String[] args){
	    Scanner sc =new Scanner(System.in);
	    
	    String text = sc.nextLine();
	    
	    Main T = new Main();
	    
	  
	    System.out.println( T.solution(text));
	    
    }
}