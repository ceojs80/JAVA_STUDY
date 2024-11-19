package java_study_1114;


public class javastudy1114_2 {

	
	public static void main(String[] args) {
		int number = 10;
		/*
		 * int :  정수형 데이터 타입
		 * number : 식별자(변수형)
		 * = : 대입
		 * 10 : 정수형 데이터
		 * ; : 문단 종료
		 */
		
		/*
		 * 자바는 기본데이터타입 8개와 레퍼런스타입 1개 총 9개의 데이터타입을 가지고있다.
		 * String은 레퍼런스 타입
		 * 레퍼런스란 다음시간에 뱌워보겠습니다.
		 */
		
		int x = 10;
		System.out.println("정수형 데이터타입 : " + x);
		double y = 10.5555;
		System.out.println("실수형 데이터타입 : " + y);
		boolean z = true; //true(참) 혹은 false(거짓)만 올 수 있다.
		System.out.println("논리형 데이터타입 : "+z);
		char a = 'a'; //문자 데이터타입 (문자열 아님)
		System.out.println("문자 데이터타입 : "+a);
		Staring s = "Hello World";
		System.out.println("문자열 데이터타입 :" +s);
		/*
		 * 문자와 문자열 차이점
		 * 문자는 한단어만 입력가능, 문자열은 여러 단어 입력가능
		 */
		
		
		final double PI = 3.14; //원주율(파이)은 3.14 -> 고정된 값을 상수라 함
		//상수는 데이터타입 앞에 'final' 이라는 키워드를 작성합니다.
		//상수에 식별자(변수명)은 대문자로 입력합니다.
		
		//형변환
		int num = 10; //int는 4바이트
		double num2 = num; //double은 8바이트
		//위에 코드설명 : 정수형 변수 num에 10을 대입함.
		//실수형 변수 num2에 num을 대입함
		//작은 바이트크기에서 큰 바이트크기로 대입할 때 자동으로 형변환이 됩니다.
		//즉, int num이 double로 변환됨
		
	}
}
