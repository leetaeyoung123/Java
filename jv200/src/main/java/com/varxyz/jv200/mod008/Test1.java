package com.varxyz.jv200.mod008;

/*
 *소수인지 아닌지 try catch 써서 소수이면 소수이다라고 출력
 *아니면 6은 2*3이므로 소수가 아닙니다 라고 출력
 * */

public class Test1 {
	public static void PrimeNumber(int num) throws MyException, PrimeException {
		
		if (num <= 0 ) {
			System.out.println("0 또는 음수는 입력할 수 없습니다.");
			throw new MyException();
		}
		
		int count = 0;
		if ( num == 1 || num == 3 ) {
			System.out.println(num + "은(는) 소수입니다.");
		} else {
			for (int i = 2; i <= num; i++) {
				for (int j = 2; j <= num; j++) {
					if( i % j == 0 ) {
						count++;
					}
				}
				if ( count > 1 ) {
					count = 0;
				}
			}
			if ( count == 1) {
					System.out.println(num + "은(는) 소수입니다.");
				} else {
					System.out.println("입력하신 숫자" + num +"(은)는" + "소수가 아닙니다.");
					LeastCommonMultiple l = new LeastCommonMultiple();	// l이라는 객체 생성
					l.CommonMultiple(num);	// l객체에 CommonMultiple 메소드와 파라미터를 불러옴
					throw new PrimeException();
				}
			}
		}
	
		public static void main(String[] args) {
			try {
				PrimeNumber(8);
			} catch (MyException e) {
				e.printStackTrace();
			} catch (PrimeException e) {
				e.printStackTrace();
			}
	}
}
