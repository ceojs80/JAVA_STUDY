package java_study_1210;

//클래스 이름 : 수업
//클래스이름은 앞에 대문자로 작성한다.
public class 수업 {
	
	int x = 10; //필드변수(전역변수)
	
	public 수업() { //생성자
		
	}
	public int getx() { //메소드
		return x;
	}
	public static void main(String[] args) { //메소드(메인)
		//객체지향 : 유지보수하기 쉽게 코드를 나눈다

	    //붕어빵 클레스를 호출(파일 불러오기)
		//new : 클래스 호출
		//x : 붕어빵 클래스 변수이름
		붕어빵 x = new 붕어빵();
		x.붕어빵종류 = "팥"; //붕어빵 클래스에 있는 붕어빵종류 변수 사용
		x.붕어빵가격 = 500; //붕어빵 클래스에 있는 붕어빵가격 변수 사용
		//.:접근하다
		System.out.println("붕어빵 종류 : " + x.붕어빵종류);
		System.out.println("붕어빵 가격 : " + x.붕어빵가격);
	}

}
