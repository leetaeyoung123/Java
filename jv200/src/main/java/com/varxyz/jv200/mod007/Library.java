package com.varxyz.jv200.mod007;

public class Library {
	private static int leng = 100;	// 책 보관 최대치 개수
	private static Book bookInfo;
	private static Book[] bookArray = new Book[leng];	// 책 보관 배열길이 
	
	private static void Library() {
		
	}
	
	// 사용자로부터 시리얼번호를 받아 책정보를 출력해주는 메소드
	public static void getBook(int serial) {
		for (int i = 0; i < bookArray.length; i++) {
			if( bookArray[i] == null ) {
				System.out.println("잘못 된 시리얼 번호를 입력하셨습니다.");
				break;
			} else if ( serial == bookArray[i].getSerial()) {
				System.out.println("book name: " + bookArray[i].getName() + "\nbook serial: " + bookArray[i].getSerial());
				break;
			}
		}
	}
	
	//Library bookArray에 Book 객체를 넣어주는 메소드
	public static void addBook(Book bookInfo) {	// Book 클래스 안의 값들이 여기로 들어옴
		// bookArray 배열에 값이 할당되지 않았을때는 default로 null값이 할당
		for (int i = 0; i < bookArray.length; i++) {
			if( bookArray[i] == null ) {
				bookArray[i] = bookInfo;
				break;
		// bookArray에 공간이 꽉차면 2배로 공간을 늘려준다.
			} else if( bookArray[i] != null) {
				leng = leng * 2;
			}
		}
	}
}







