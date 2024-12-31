package java_study_1231;

import java.util.Scanner;

class A{//A클래스 선언
	private int x;//전역변수 선언
	private int y;
	
	public int getX() {//get: 전역변수 리턴
		return x;
	}
	public void setX(int x) {//set: 전역변수 값 초기화
		this.x=x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}

public class 복습 {

	public static void main(String[] args) {
		
		//플래그(깃발)값 => true or false
		boolean isFlag = false;
		
		String inputWord = "사과"; //입력받은 문자(가정)
		if(inputWord.equals("사과")) {//inputWord가 '사과'라면?
			isFlag = true;
		}
		if(isFlag) {
			//플래그값을 이용해서 특정 코드를 실행할 수 있습니다.
			System.out.println("플래그 값 변경");
		}
		
		//예시
		boolean isFlag2 = false;
		String book[] = {"책1","책2","책3"}; //배열선언
		Scanner scan = new Scanner(System.in);
		
		System.out.println("찾을 책을 입력하세요 :");
		String search = scan.next();//문자 입력받기
		
		for(String s :book) {
			if(s.equals(search)) {//배열안에 있는값과 입력한값이 동일하다면
				isFlag2 = true;
			}
		}
		
		if(!isFlag2) {//isFlag2가 false일 때 실행하는 if 코드
			System.out.println("입력한 도서는 해당 도서관에 없습니다.");
		}
		
		
		
		

	}

}
