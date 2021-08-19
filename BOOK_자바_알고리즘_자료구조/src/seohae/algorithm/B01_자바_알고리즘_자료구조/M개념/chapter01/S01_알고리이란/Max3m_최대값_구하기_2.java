package seohae.algorithm.B01_자바_알고리즘_자료구조.M개념.chapter01.S01_알고리이란;
// 3개의 정숫값 가운데 최댓값을 구하여 출력합니다.

class Max3m_최대값_구하기_2 {
	// a, b, c의 최댓값을 구하여 반환합니다.

	/**
	 * 메서드 사용 (매개변수)
	 * 매개변수 : 메서드를 정의할 때 메서드에 전달되는 값을 저장하기 위해 선언된 변수
	 * 실인수 : 메서드를 호출할때 사용하는 매개변수의 값(value)
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	static int max3(int a, int b, int c) {
		int max = a;						// 최댓값
		if (b > max) 
			max = b;
		if (c > max) 
			max = c;

		return max;
	}

	public static void main(String[] args) {
		/**
		 * 여러 값에 대한 테스트는 System.in 을 사용해서 값을 입력받기 보다는,
		   아래처럼 직접 작성하는 것이 편하다.
		 */
		System.out.println("max3(3,2,1) = " + max3(3, 2, 1));		// [A] a＞b＞c
		System.out.println("max3(3,2,2) = " + max3(3, 2, 2));		// [B] a＞b＝c
		System.out.println("max3(3,1,2) = " + max3(3, 1, 2));		// [C] a＞c＞b
		System.out.println("max3(3,2,3) = " + max3(3, 2, 3));		// [D] a＝c＞b
		System.out.println("max3(2,1,3) = " + max3(2, 1, 3));		// [E] c＞a＞b
		System.out.println("max3(3,3,2) = " + max3(3, 3, 2));		// [F] a＝b＞c
		System.out.println("max3(3,3,3) = " + max3(3, 3, 3));		// [G] a＝b＝c
		System.out.println("max3(2,2,3) = " + max3(2, 2, 3));		// [H] c＞a＝b
		System.out.println("max3(2,3,1) = " + max3(2, 3, 1));		// [I] b＞a＞c
		System.out.println("max3(2,3,2) = " + max3(2, 3, 2));		// [J] b＞a＝c
		System.out.println("max3(1,3,2) = " + max3(1, 3, 2));		// [K] b＞c＞a
		System.out.println("max3(2,3,3) = " + max3(2, 3, 3));		// [L] b＝c＞a
		System.out.println("max3(1,2,3) = " + max3(1, 2, 3));		// [M] c＞b＞a
	}
}
