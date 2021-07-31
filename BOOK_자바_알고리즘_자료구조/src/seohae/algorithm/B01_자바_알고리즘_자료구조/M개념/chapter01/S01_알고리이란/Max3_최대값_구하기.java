package seohae.algorithm.B01_자바_알고리즘_자료구조.M개념.chapter01.S01_알고리이란;
import java.util.Scanner;
// 3개의 정숫값을 입력하고 최댓값을 구합니다.

class Max3_최대값_구하기 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값：");	int a = stdIn.nextInt();
		System.out.print("b의 값：");	int b = stdIn.nextInt();
		System.out.print("c의 값：");	int c = stdIn.nextInt();

		/* 순차적으로 실행 -> 순차적 구조 (concatenation) */
		int max = a;
		if (b > max) max = b; /* 선택 구조 : 평가 결과에 따라 프로그램의 실행 흐름을 변경 */
		if (c > max) max = c;

		System.out.println("최댓값은 " + max + "입니다.");
	}
}