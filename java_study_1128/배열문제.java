package java_study_1128;

import java.util.Random;

public class 배열문제 {

	public static void main(String[] args) {
		/*
		 *
		 * 1번)
		 10개의 정수를 저장하는 배열을 선언하고 1부터 10까지의 값으로 초기화한 후,
		 2번째 인덱스와 5번째 인덱스를 곱한 값을 출력하시오.
		 */
         int[] array = {1,2,3,4,5,6,7,8,9,10}; //첫번째 방법
         int[] array2= new int[10]; //2번째 방법
         for(int i=0; i<array2.length; i++) { // for문 이용해서 값 초기화
        	 array2[i] = i+1;
        	 System.out.println(array2[i]);
         }
         int result = array2[2] * array2[5]; // 2번째 인덱스 * 5번째 인덱스
         System.out.println("1번 정답: "+ result);
         
         /* 4번)
		 크기가 10인 정수 배열을 선언하고 랜덤한 값(1~100)으로 초기한 후,
		 최댓값을 구하는 프로그램을 작성하세요.
		 hint) for, if
          */
         
         //렌덤한 값
         Random random = new Random(); //ctrl + shift + o
         //배열값 초기화
         int[] array3 = new int[10]; //크기가 10인 정수 배열을 선언
         for(int i=0; i<array3.length; i++) {
        	 array3[i] = random.nextInt(100) + 1; //1~100까지 랜덤값 대입
        }
         //최댓값 구하기
         int max = 0; //최댓값 변수
         for(int i=0; i<array3.length; i++) {
         if(max <array3[i]) { //max가 배열값보다 작다면?
        	max = array3[i]; // 최댓값변수에 값 대입!
           }
         }
	     System.out.println("최댓값은?" + max);
	     
	     
	}
	

}
