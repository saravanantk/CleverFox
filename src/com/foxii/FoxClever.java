package com.foxii;

public class FoxClever {
	
public static void main(String[] args) {
		
		String s = "Chidambaranar Street";
		
		
		int length = s.length();
		System.out.println(length);
		
		char charAt = s.charAt(9);
		System.out.println(charAt);
		
		int indexof = s.indexOf('m');
		System.out.println(indexof);
		
		String touppercase = s.toUpperCase();
		System.out.println(touppercase);
		
		String tolowercase = s.toLowerCase();
		System.out.println(tolowercase);
		
		boolean isempty = s.isEmpty();
		System.out.println(isempty);
		
		boolean startswith = s.startsWith("chid");
		System.out.println(startswith);
		
		boolean endswith = s.endsWith("eet");
		System.out.println(endswith);
		
		int lastindexof = s.lastIndexOf("t");
		System.out.println(lastindexof);
		
		boolean contains = s.contains("Street");
		System.out.println(contains);
		
		String replace = s.replace('a', 'j');
		System.out.println(replace);
		
		String replaceAll = s.replaceAll("Street", "Town");
		System.out.println(replaceAll);
		
		String trim = s.trim();
		System.err.println(trim);
		
		String substring = s.substring(9);
		System.out.println(substring);
		
		String substring2 =  s.substring(11, 18);
		System.out.println(substring2);
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
