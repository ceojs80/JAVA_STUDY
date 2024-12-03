package java_study_1203;

public class 복습 {

	public static void main(String[] args) {
		
		//1. 1부터 100까지의 숫자 중 짝수만 출력하는 프로그램을 작성하세요.
		//1부터 100까지 범위 => for(반복문)
		//반복문 종류 1.for 2.while 3. do-while(본적 없음)
		
		for(int i=1; i<=100; i++) {
			//% : 나머지 값 구하기
			// == : 비교연산자
			//if를 이용해 짝수 판단
			//코드가 한줄일 때 중괄호 생략가능
			if(i % 2 == 0) System.out.println("짝수는 : " + i);
		}
		
		//2. 1부터 10까지의 합을 구하시오
		// 1+2+3./......+10 == 55
		int sum = 0;
		for(int i=1; i<=10; i++) {
			//+=(복합연산자) => sum = sum + i;
			sum += i;
		}
		System.out.println(sum);
		
		//3. 배열, apple이 총 몇개인지 출력하기
		String[] array = {"apple","apple","apple","banana"};
		//총 몇개? count(증감연산자 사용 확률 높음)
		int count = 0;
		for(String i : array) { //for-each
			if(i.equals("apple")) {//자바에서 문자비교는 'equals'
				++count; //증감연산자
			}
		}
        System.out.println(count);
        /*
         * oo옷가게는 10만원 이상 사면 5%, 30만원 이상 사면 10%,
           50만원 이상 사면 20%를 할인해줍니다.
           구매한 옷의 가격 price변수에 580,000 주어질 때,
           지불해야 할 금액을 출력하도록 코드를 완성해보세요
         */
        double price = 580000;
        if(price >= 500000) {
        	price = price * 0.8; //20%할인
        }else if(price >=300000) {
        	price = price * 0.9; //10%할인
        }else if(price >=100000) {
        	price = price * 0.95;
        }
        
        /* [문자열 문제]
         * 문자열 my_string에 "hello"가 주어질 때
         * my_string에 들어있는 각 문자를 n만큼 반복한 문자열 출력하기
         * n에 3이 주어짐
         */
        String my_string = "hello";
        int n = 3;
        //결과 : hhheeellllllooo
        //힌트 : for문 -> 이중 for문
        String result = "";
        for(int i=0; i<my_string.length();i++) {//문자 길이만큼 반복
        	String word = my_string.substring(i,i+1);
        	for(int j=0; j<n; j++) {//이중 for문 //n만큼 반복reslt +=word;
        	}
        }
        System.out.println("결과:"+ result);
        
        //repeat : 특정 문자를 반복하다.
        String s = "Hello";
        System.out.println(s.repeat(3));
        
        //repeat활용해서 위 문제 다시 풀어보기
        String[] strArray = my_string.split("");
        String result2 = "";
        for(String i : strArray) {
         result2 += i.repeat(n);//repeat 활용
        }
        System.out.println(result2);
        
        //[배열]짝수, 홀수 개수 구하기
        /*
         * 정수형 배열 num_list가 주어질 때 num_list의
         원소중 짝수와 홀수의 개수를
         * 담은 정수형 배열 answer_list를 완성하기.
         * 
         */
        int[] num_list = {1,3,5,7};
        int[] answer_list = new int[2];
        /*
         * answer_list : 결과
         * [0,4]즉, 0번째 인덱스엔 짝수,1번째 인덱스엔 홀수 개수가 옴
         */
        int 짝수카운트 = 0;
        int 홀수카운트 = 0;
        for(int i: num_list) {//forEach
        	if(i %2 ==0) {//짝수?
        		++짝수카운트;
        		answer_list[0] = 짝수카운트;//0번째 인덱스(순서)에 값 대입
        	}else {//홀수?
        		++홀수카운트;
        		answer_list[1] = 홀수카운트;//1번째 인덱스(순서)에 값 대입
        	}
        }
	}

}
