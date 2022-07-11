package com.varxyz.jv200.mod007;

//대학의 모든 도서정보(책)는 하나의 도서관(저장소)에 보관 및 등록된다고 가정하자.
//각 학과(학부)에서 구매한 책들은 모두 이 도서관 도서정보에 등록되어야 한다고 가정하자.
//책을 대출할 때 책의 고유번호(serial)를 통해 검색되어 대출된다고 가정하자.
//도서관에서 책을 보관할 수 있는 정보의 최대치는 100권이며 초과시 자동으로 이전 저장소 크기의 2배로 증가된다고 가정하자.
//
//도서관 = Libary
//책 = Book
//책정보 등록 = addBook(Book book)
//책 대출 = getBook(int serial)



public class Test1 {

	public static void main(String[] args) {
		Book prince = new Book(500, "어린왕자");
		Book demian = new Book(617, "데미안");
		Book coding = new Book(720, "코딩");
		Library.addBook(prince);
		Library.addBook(demian);
		Library.addBook(coding);
		Library.getBook(500);
		Library.getBook(617);
		Library.getBook(1);
	}
}
