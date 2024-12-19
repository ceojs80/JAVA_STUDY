package java_study_1219;


interface CC{
	//인터페이스는 클래스와 다르게 생성자가 없음
	/*
	 * 인터페이스
	 * 1. 메소드 선언만 가능 (구현 x)
	 * 2. 접근지정자는 'public'
	 */
}
class AA{
	public void 메시지보여주다() {
		System.out.println("안녕하세요.");
	}
}
/*
 * 자바는 다중 상속이 불가능합니다.
 * 그래서 다중 상속이 가능하다록 '특별한' 기능이 존재
 * implements를 실무에서 
 */
class BB extends AA implements CC{ //BB클래스는 AA클래스를 상속받았습니다.
	//BB클래스에서 AA클래스에 정의된 메소드를 사용 혹은 재사용할 수 있음.
	//implements : 구현하다
	//'클래스 BB는 인터페이스 CC를 구현하다' 라는 뜻이다.
	/*
	 * 인터페이스를 
	 */
	
	/*
	 * 정리(팩트체크),
	 * 자바는 다중상속을 지원하지 않는다.
	 * 인터페이스라는 방법으로 다중상속을 구현한다.
	 * 인터페이스에 정의된 메소드를 강제로
	 */
}
public class 수업 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
