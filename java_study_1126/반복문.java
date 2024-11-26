package java_study_1126;

public class 반복문 {

	public static void main(String[] args) {
	   
		/*
		 * 이중 for문 (중첩 반복)
		반복문이 다른 반복문을 내포하는 구조
		이론적으로 2중 3중 4중 ...... n중 까지 가능하나,
		너무 많은 중첩은 프로그램 구조를 복잡하게 된다. 그래서 2중 중첩이 적당하다.
		*/
		
		for(int i=0; i<3; i++) {//아우터 for문
			System.out.println("아우터 for문");
			for(int j=0; j<3; j++) {//이너 for문
				System.out.println("이너 for문");
			}
		}
		//아우터 for문이 먼저 실행 -> 이너 for 문은 모두 실행 -> 아우터 for문 실행 ....
		
		//구구단 (이중 for문 이용)
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
            System.out.println(i + "*"+ j +"= "+ i*j);
	    }
	}
		//직사각형 출력(이중 for문)
		int a = 5; //가로 길이
		int b = 3; //세로 길이
		for(int i=0; i<b; i++) {
			for(int j=0; j<a; j++) {
				System.out.println("*");//1n아님
			}
			System.out.println();//단순 공백 출력
		}
		/*
		 * 문제 9번
		   *
		   **
		   ***
		   ****
		   *****
		 */
		//9번. 5번 돌게하기
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
		        System.out.println("*");
			}
			System.out.println();
		}
		/*
		 * 문제 10번
		   *****
		   ****
		   ***
		   **
		   *
		 */
		//10번
		for(int i=5; i>0; i--) {
			for(int j=0; j<i; j++) {
		    System.out.println("*");
		    }
		    System.out.println();   
	    }
	}
}
