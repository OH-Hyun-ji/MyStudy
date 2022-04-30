package chap05;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public String solution(String text) {
		char[] arr =text.toCharArray();
		
		int st=0, rt = text.length()-1;
		char tmp = 0;
			while(st<rt) {
				if(!Character.isAlphabetic(arr[st])) st++;
				else if(!Character.isAlphabetic(arr[rt])) rt--;
				else {
					tmp = arr[st];
					arr[st] = arr[rt];
					arr[rt] =tmp;
					st++;
					rt--;
				}
			}
		
		String result =String.valueOf(arr);
		return result;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main T = new Main();
		String text = sc.next();
		
		System.out.println(T.solution(text));
	}
	
	
	///////////////////////////////////////////////
/*	
	public static void main(String[] args){

        final Scanner in = new Scanner(System.in);
        final String next = in.next();
        final AlphabetReverser reverser = new AlphabetReverser(next);
        System.out.println(reverser.getResult());
        final AlphabetReverser2 reverser2 = new AlphabetReverser2(next);
        System.out.println(reverser2.getResult());
        return;
    }

    public static class AlphabetReverser {

        private final char[] chars;
        private final Stack<Character> stack = new Stack<>();
        final StringBuilder sb = new StringBuilder();

        public AlphabetReverser(final String input) {
            this.chars = input.toCharArray();
        }

        public boolean isAlphabet(final char ch) {
            return ('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z');
        }

        private void pushAllAlphabet() {
            for (char ch : chars) {
                if(isAlphabet(ch))
                    stack.push(ch);
            }
        }

        private String getResult() {
            pushAllAlphabet();
            for (char ch : chars) {
                if(isAlphabet(ch))
                    sb.append(stack.pop());
                else
                    sb.append(ch);
            }
            return sb.toString();
        }

    }

    public static class AlphabetReverser2 {

        private final char[] chars;
        private final int length;
        private final char[] result;

        public AlphabetReverser2(final String input) {
            this.chars = input.toCharArray();
            this.length = chars.length;
            this.result = new char[length];
        }

        public boolean isAlphabet(final char ch) {
            return ('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z');
        }

        private String getResult() {
            for (int i=1; i<=length; i++) {
                if(isAlphabet(chars[i-1])) {
                    result[length-i] = chars[i-1];
                } else {
                    result[length-i] = chars[length-i];
                }
            }
            return new String(result);
        }

    }
    
    */
}
