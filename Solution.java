package com.java;

import java.util.*;
public class Solution {
	public static ArrayList<ArrayList<String>> partition(String s){
		ArrayList<ArrayList<String>> lists = new ArrayList<>();
	    ArrayList<String> list = new ArrayList<>();
	    partitionHepler(lists, list, s);
	    return lists;
	}
	
	public static void partitionHepler(ArrayList<ArrayList<String>> lists, ArrayList<String> list, String s){
		if(s == null || s.length() == 0){
			lists.add(new ArrayList<>(list));
			return;
		}
		int len = s.length();
		for(int i = 0; i <= len; i++){
			String subStr = s.substring(0,i);
			if(isPalindrome(subStr)){
				list.add(subStr);
				partitionHepler(lists, list, s.substring(i,len));
				list.remove(list.size()-1);
			}
		}
	}
	public static boolean isPalindrome(String s){
		if(s == null || s.length() == 0){
			return false;
		}
		int len = s.length();
		int middle = len/2;
		for(int i = 0 ; i < middle; i++){
			if(s.charAt(i) != s.charAt(len - i -1)){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String s = "aab";
		ArrayList<ArrayList<String>> subS = partition(s);
		for (ArrayList<String> arrayList : subS) {
			for (String string : arrayList) {
				System.out.print(string+",");
			}
			System.out.println();
		}
	}
}

