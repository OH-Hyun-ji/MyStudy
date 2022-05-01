package chap08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	final static String SUCCESS = "YES";
	final static String FAIL = "NO";
	
	public String solution(String text) {
		
		text = text.toUpperCase();
		String[] text1= text.split(" ");
		String text2 ="";
		
		for(String s : text1) {
			text2+=s;
		}
		
		char[] arr = text2.toCharArray();
		List<Character> arr1 = new ArrayList<Character>();
		
	
		for(int i=0; i < text2.length();i++) {
			if(checkList(arr[i])) {
				arr1.add(arr[i]);
			}
		}
	
		int st=0, rt=arr1.size()-1,count =0;
		while(st<rt) {
			if(arr1.get(st) == arr1.get(rt)) {
				st++;
				rt--;
				count++;
			}else {
				break;
			}
		}
		
		if(count== (arr1.size()/2)) return SUCCESS;
		System.out.println("arr1.size() :" + arr1.size());
		System.out.println("count :" + count);
		System.out.println((arr1.size()/2));
		return FAIL;
		
	}
	
	public boolean checkList(char ch) {
		return ('A' <=ch && 'Z' >= ch);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		
		Main T = new Main();
		System.out.println(T.solution(text));
	}
}
