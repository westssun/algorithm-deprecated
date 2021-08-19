package seohae.algorithm.B01_자바_알고리즘_자료구조.M개념.chapter01.S02_반복;
import java.util.Scanner;
// 1, 2, …, n의 합을 구합니다.

class SumWhile_반복 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을구합니다.");
 		System.out.print("n의 값：");

		int n = stdIn.nextInt();

		int sum = 0;				// 합
		int i = 1;

		/**
		 * 사전 판단 반복 구조
		 * while (조건) 조건을 충족할 경우(true) 반복문을 실행한다.
		 * 반복문 빠져나오기 : break
		 */
		while (i <= n) {			// i가 n 이하면 반복합니다.
			sum += i;				// sum에 i를 더합니다.
			i++;					// i 값을 1만큼 증가시킵니다.
		}
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}
}