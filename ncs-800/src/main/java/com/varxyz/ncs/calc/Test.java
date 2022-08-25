package com.varxyz.ncs.calc;

import com.varxyz.ncs.util.StringsUtil;

public class Test {
	public static void main(String[] args) {
		StringsUtil test = new StringsUtil();
		
		//extractIntCharacters
		System.out.println(test.extractIntCharacters("ads54564asd1"));
		System.out.println(test.extractIntCharacters("asd6s14d5f6dsa4asd15"));
		System.out.println(test.extractIntCharacters("a1b2c3d4e5f6"));
		
		System.out.println("-------------------------------------------");
		
		//extractNum
		System.out.println(test.extractNum("a1e85tyh4gf2"));
		System.out.println(test.extractNum("h1e2l3l4o"));
		
		//숫자가 없는경우 0 출력
		System.out.println(test.extractNum("hello"));
		
	}
}
