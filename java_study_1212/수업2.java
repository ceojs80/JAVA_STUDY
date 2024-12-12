package java_study_1212;

class Person{
	//필드변수
	String name;
	int age;
	
	Person(String name, int age){ //생성자 : 클래스가 생성될 때(new 불러올 때) 초기화를 위해 실행되는 특별한 '메소드'
		
		/*
		 * 생성자 특징
		 * 1. 생성자 이름과 클래스 이름은 동일해야합니다.
		 * 2. 생성자는 리턴타입이 없는 '메소드' 입니다.
		 * 3. 생성자는 파라미터 타입만 있고, 기본(default) 생성자는 아무것도 받지 않습니다.
		 
		   생성자 파라미터의 역할
		   받은 값을 필드변수에 대입함
		 */
	     this.name = name;
	     this.age = age;
	     //this.x = 10; => 필드변수에 x라는 변수가 없으므로 해당코드는 에러난다.
	}
	
	// void : 리턴타입이 없는 메소드 'celebrateBirthday' 생성
	public void celebrateBirthday(String name) {
		++age; //증감연산
		//메소드에서 필드변수 접근 가능
	}
    }

public class 수업2 {

	public static void main(String[] args) {
		
		Person p = new Person(); //Person 클래스 불러오기
		p.name = "김철수";
		p.age = 20;
		System.out.println();

	}

}
