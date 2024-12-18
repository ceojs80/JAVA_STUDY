package java_study_1122;

public class 수업 {

	public static void main(String[] args) {
		
		for(int i=0; i<3; i++) { //for문 시작
			System.out.println("Hello World");
		}//for문 종료
		
		//퀴즈) "안녕하세요" 20번 출력하기
		for(int i=0; i<20; i++) { //for문 시작
			System.out.println("안녕하세요");
		}//for문 종료
		
		for(int i=0; i<9; i++) {
			System.out.println("i:" + i);
		}
		/*
		 * for문은 이것만 알아두자
		 * 1. for문 실행순서 초기식 -> 조건식 -> 코드 실행 -> 증감식
		 * 2. 조건식이 만족할 때 까지 반복함
		 */
		
		// 1~10까지 총 합구하기 => for문을 사용해야하는구나!
		// 1+2+3+4+5+6+7+8+9+10 = 55;
		int sum =0 ;
		for(int i=1; i<=10; i++) {//i가 10까지 동작하는 for문
			sum = sum + i;
			System.out.println(i);
		}
		System.out.println("1부터 10까지 총합은 : "+ sum);
		
		//1부터 20까지의 숫자중 짝수만 출력하기
		//여러분들이 1부터 20까지를 만족하는 for문을 작성.
		for(int i=1; i<=20; i++) {//1부터 20까지를 만족하는 for
			//for문에 안에 if/else, swich 등등 구현 가능!
			if(i % 2 == 0) { //1씩 증가하는 i를 2로 나눠서 나머지값이 0인지 확인
				System.out.println(i+ "는 짝수입니다.");
				}
		}
		//퀴즈) 1부터 30까지의 숫자중 5의 배수만 출력하기
		for(int i=1; i<=30; i++) { //
			if(i % 5 == 0) { //배수 판단
				System.out.println(i+"는 5의 배수입니다.");
			}
		}
	    
		//break; 많이 사용함
		for(int i=1; i<=5; i++) {
			if(i == 2) {
				System.out.println(i);
				break; //i가 2라면, break -> for문 탈출(끝)
			}
			System.out.println(i);
		}
		//구구단 출력해보기
		int 구구단 = 2;
		for(int i = 1; i<=9; i++) {
			
System.out.println(구구단+"*"+i+"="+구구단*i);
		}
		
		/*
		 * while 문은 조건이 참인 동안 코드 블록을 반복적으로 실행하는 반복문
		 */
		int i = 1; //초기식
		while(i <= 5) {//while문 시작 //조건식
			System.out.println("while문 i : " + i);
			i++; // 코드구현 + 증감식
		}//while문 종료
		
		//커피 자판기 예제
		int coffee = 10; //커피 10잔
		while(coffee > 0) {
			System.out.println("커피를 판매합니다. 남은 커피 : " + coffee);
			coffee--;
			if(coffee == 0) { //커피가 0잔이라면?
				System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다,");
				break; //for문과 마찬가지로 break문을 사용할 수 있습니다.
			}
		}
	    
		int x = 0;
		while(true) {
			x++;
			if(x==10)break;
		}
		//for문은 10kg빼기 위해서는 운동장 *10*바퀴 뛰어!
		//while문은 10kg뺄때까지 운동장 계속 뛰어!
		
		
		}
	}
	       