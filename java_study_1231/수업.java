package java_study_1231;

import java.util.ArrayList;
import java.util.HashSet;

public class 수업 {

	public static void main(String[] args) {
		
		//***제네릭과 컬렉션즈 (배열하고 같은개념)
		// 배열기초 -> 객체배열 -> 제네릭과 컬렉션즈 (공부순서)
		
		/*
		 * 제네릭과 컬렉션즈란?
		 * 배열처럼 데이터를 저장함
		 * 빠른 접근 속도와 '동적 크기' 조절이 가능한 장점들이 있습니다.
		 */
		int [] array = new int[6]; //배열은 저장 공간을 작성해야 했음.
		array [0] =10;
		array [5] = 7;
		array [6] = 5; //에러 발생 사이즈가 넘어감
		//배열 큰 단점은 삭제 기능이 없음..
		array [2] = 0; //나름 삭제..?
		
		//ArrayList 컬렉션
		ArrayList<Integer> list = new ArrayList<Integer>(); //ctrl + shift + o 임포트 하기
		/*
		 * 제네릭(<>) 특징
		 * 1. 클래스 타입만 넣을 수 있음. int 형을 담고 싶으면 int에 클래스 타입인 Integer를 작성
		 */
		list.add(10); //0번째에 10추가
		list.add(5); //1번째에 5추가
		list.add(34); //2번째에 24추가
		
		int num2 = list.get(1); //1번째 값 가져오기
		System.out.println("조회 : " + num2);
		
		//list 사이즈 조회
		System.out.println("사이즈 조회: " + list.size());
		list.add(5);
		System.out.println("사이즈 조회: " + list.size()); //사이즈가 동적으로 변경
		
		//제거
		list.remove(0); //0번째에 저장된 값 삭제
		System.out.println("0번째 요소 조회: " + list.get(0)); //10은 삭제되고 5가 출력
		System.out.println("사이즈 조회: " + list.size());
		
		//수정
		list.set(0, 100); //0번째 요소에 100으로 수정
		System.out.println("0번째 요소 조회: " + list.get(0)); //100!
		
		//전체 출력
		for(int i : list) {
			System.out.println("저장된 값은: " + i);
		}
		
		//List에 저장된 총합과 평균구하기
		list.add(40);
		int sum = 0; //총합
		int avg = 0; //평균
		for(int i : list) {
			sum += i;
		}
		System.out.println("list에 저장된 총합 : " + sum);
		System.out.println("list 평균: " + sum / list.size());
		
		//HashSet 컬렉션즈
		/*
		 * HashSet : 중복 제거가 필요하거나 집합 연산을 수행해야 할 때 유용하게 사용됨
		 * 1. 중복을 허용하지 않는 고유한 요소만 저장
		 */
		HashSet<Integer> set = new HashSet<Integer>(); //ctrl + shift + o 임포트 하기
		set.add(10); //0번째 요소에 10추가
		set.add(20); //1번째 요소에 20추가
		set.add(10); //2번째 요소에 10추가 -> 중복된 값은 무시됨
		
		System.out.println("HashSet 크기 : " + set.size());
		
		//HashSet은 특정요소 조회 불가능 get이 없음
		//HashSet 요소 값
		
		set.contains(0);
		
		//삭제
		set.remove(0); //0번째 요소 삭제
		//즉, HashSet은 추가와 삭제만 가능함
		
		//HashMap 컬렉션즈
		/*
		 *HashMap은 마치 사전과 같습니다.
		 *사전에서 단어
		 */
	}

}
