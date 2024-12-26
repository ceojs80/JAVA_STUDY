package java_study_1226;


/*
 * 인터페이스는 '기능 선언'만 가능합니다.
 * 보통 인터페이스 명명규칙 뒤에 'Service' 붙임
 */
public interface LibraryService {
	void addBook(Book book); //도서 추가
	void searchBook(String keyword);
}
