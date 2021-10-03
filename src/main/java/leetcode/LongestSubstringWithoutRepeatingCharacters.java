package main.java.leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String data = sc.nextLine();
		int a = lengthOfLongestSubstring(data);
		System.out.println(a);
		sc.close();
	}
	
	 public static int lengthOfLongestSubstring(String s) {
	        int i = 0;
	        int length = 0;
	        int finalLength = 0;
	        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	        
	        while(i < s.length()) {
	        	if(map.containsKey(s.charAt(i))) {
	        		if(finalLength < length)
	        			finalLength = length;
	        		length = 0;
	        		i = map.get(s.charAt(i)) + 1;
	        		map = new HashMap<Character, Integer>();
	        	}
	        	map.put(s.charAt(i), i);
	        	++length;
	        	++i;
	        }
	        if(finalLength < length)
    			finalLength = length;
	        
	        return finalLength;
	 }

}
