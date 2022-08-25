package com.varxyz.ncs.util;


public class StringsUtil {
	
	public String extractIntCharacters(String str) {
		char[] chs = str.toCharArray();
		String result = "";
		for(char c : chs) {
			if(c > 47 && c < 58) {
				result += c; 
			}
		}
		return result;
	}
	
	
	/**
	 * 주어진 문자열에 포함된 숫자(양수에 한함)문자열을 정수로 리턴한다.
	 * 숫자가 없을때 IllegalArguemntException 예외를 던진다.
	 * 
	 * ex) "abc432def" 입력시 432 출력
	 * @param target
	 * @return
	 */
	public int extractNum(String target) {
		try {
			char[] chs = target.toCharArray();
			String result = "";
			int result2 = 0;
			for(char c : chs) {
				if(c > 47 && c < 58) {
					result += c; 
				}
			}
			result2 = Integer.parseInt(result);
			return result2;	
			
		} catch (IllegalArgumentException e) {
			return 0;
		}
	}
}
