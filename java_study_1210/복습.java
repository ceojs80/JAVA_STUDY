package java_study_1210;

public class 복습 {

	public static void main(String[] args) {
		//연산자
		/*
		 * 가장 많이 사용하는 연산자
		 * 1. 대입연산자
		 * 2. 사칙연산자(+,-,/,%)
		 * 3. 증감연산자
		 */
		int x = 10; //초기 선언식
		x = 30;
		System.out.println("x의 최종 값은 ?" + x);
        
		String s = "123";
		String s2 = "456";
		String result = s + s2;//문자가 합쳐짐
		System.out.println("결과: " + result);
		
		int num = Integer.parseInt(result); //문자가 숫자로 변환
		System.out.println("결과: " +num);
		
		int count = 0;
		++count; //1씩 증가됨
	    count++;
	    ++count;
	    System.out.println("결과 : " + count);
	    
	    //제어문
	    /*
	     * if문 -> 95%
	     * switch문 -> 5%
	     * 
	     * 조건문? : 특정 조건을 평가하여 그 결과에 따른 다른 코드를 실행한다.
	     * 
	     * if(조건식){ <=true or false
	     *   //코드 작성(조건이 참(true)일 때 실행할 코드)
	     * }
	     * 
	     * if-else문 : 조건이 참일 때와 거짓일 때 각각 다른 코드를 실행
	     * 
	     * else-if문 : 여러 개의 조건을 평가
	     * if(조건식){
	     *   //조건식1이 참일 때 실행
	     * }else if(
	     
	     //무엇이 출력되고 그 이유는 무엇인지 작성하기
	     //=> 답) 출력 A,
	     boolean isData = false;
	     if(!isData){
	        System.out.println("출력 A"); 
	     }else {
	        System.out.println("출력 B");
	     } 
	     
	     //두 비밀번호 비교하기
	     String password = "123"; //비밀번호
	     String repassword = "456"; //비밀번호 재입력
	     // '==' : 비교연산자
	     //자바에서는 문자를 비교할땐 비교연산자가 아니라 equals(동등한)를 사용합니다.
	     if(password.equals(rePassword)) { //문자열 함수로 문자를 비교한다.
	        System.out.println("비밀번호가 일치합니다."); 
	     }
	     
	     if(10 !=5) {//10하고 5가 다르다면?
	        System.out.println("A출력");
	     }else {
	        System.out.println("B출력");
	     } 
	     
	     //반복문 복습
	     /*
	      *반복문 : 특정 블록의 코드를 여러 번 반복해서 실행.
	      *for : 반복 횟수가 정해져 있을 때 사용
	      *while : 조건이 참인 동안 반복실행(반복횟수 x)
	      *
	      *for(초기화(1); 조건식(2); 증감식(4)){
	      *  //반복할 코드(3)
	      * }
	      * 
	      *while(조건식(1)){
	      *  //반복할 코드(2)
	      * }
	      */
	     //1부터 10까지의 숫자를 출력하고자 합니다.
	     for(int i =1; i<=10; i++) {
	    	 //1부터 10까지 숫자 중 짝수만 출력
	    	 System.out.println(i);
	    	 if(i % 2 == 0) {//2로 나눠서 나머지가 0이라면? (짝수)
	    		 System.out.println("짝수 : "+i);
	    	 }
	     }
	      
	     
	     /*배열 : 동일한 데이터 타입의 여러 데이터를 하나의 변수로 관리할 수 있게 해주는 자료구조
	       쉽게 말해, 같은 종류의 데이터들을 한 줄로 나열해 놓은 것!
	       for문하고 절친 
	     */
	     
	     //1. 배열 선언 및 초기화
	     int [] array = {1,2,3,4}; //첫번째 방법
	     int [] array2 = new int[4];//두번째 방법 (v)
	     //2. 배열 요소(아이템) 접근 및 조작
	     
	     System.out.println("0번 index : "+array[0]+"요소(아이템)");
	     System.out.println("1번 index : "+array[1]+"요소(아이템)");
	     System.out.println("2번 index : "+array[2]+"요소(아이템)");
	     System.out.println("3번 index : "+array[3]+"요소(아이템)");
	     //인덱스 번호로 배열 요쇼 출력(사용) 가능
	     for(int i=0; i<array.length; i++) { 
	         System.out.println(i+"번 index : "+array[i]+"요소(아이템)");
	     }
         
	     //배열 요소 값 변경하기
	     System.out.println("2번 index : "+array[2]+"요소(아이템)");
	     array[2] = 50; //2번째 요소에 50값 대입 (기존에 값은 없어짐)
	     System.out.println("2번 index : "+array[2]+"요소(아이템)");
	     
	     //같이풀기 1. myScore보다 점수 높은 사람 카운트하기
	     int []score = {50,80,100,100,90}; //점수 배열
	     int myScore = 77; //내 점수
	     int scoreCount = 0; //카운트
	     
	     for(int i=0; i<score.length; i++) {
	    	 int temp = score[i];
	    	 System.out.println("배열에서 가져온 점수 : "+temp);
	    	 if(temp > myScore) {//if로 비교하기
	    		 ++scoreCount; //증감연산자 이용
	    	 }
	     }
	    	 System.out.println("최종 값:"+ scoreCount);
	    	 
	     //같이풀기 3. 닉네임 중복체크하기
	     String[] nickNames = {"사과", "바나나", "오렌지", "포도", "키위"};
	     String userNickName = "사과"; //입력받은 닉네임
	     //nickNames 배열에 입력받은 닉네임이 있다면 "닉네임이 중복됩니다" 라는 메세지를 출력하시오.
	     boolean isFlag = false;
	     for(int i=0; i<nickNames.length; i++) {
	    	 String temp = nickNames[i]; //배열 요소 temp에 대입
	    	 if(temp.equals(userNickName)) { //동일하다면?
	    		 isFlag = true;
	    	 }
	     }
	     
	     //같이풀기 4. 배열의 모든 요소의 합 구하기(for-each로 풀기)	     
	     int[] numbers2 = {5,10,15,20,25};
	     int sum = 0;
	     for(int i : numbers2) { //for each
	    	 System.out.println("배열 요소 출력 : " + i);
	    	 sum += i; //요소 총합 구하기
	     }
	     System.out.println("요소 총합 : " + sum);
	     
	     
	}
	
}