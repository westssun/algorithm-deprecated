package seohae.algorithm.B01_자바_알고리즘_자료구조.M개념.chapter01.S02_반복;
import java.util.Scanner;
// 1, 2, …, n의 합을 구합니다(양수만 입력).

class SumForPos_do_while문 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("1부터 n까지의 합을구합니다.");

		do {
			System.out.print("n의 값：");
			n = stdIn.nextInt();
		} while (n <= 0); // n 이 0 보다 클때까지 반복

		int sum = 0;		// 합

		for (int i = 1; i <= n; i++)
			sum += i;		// sum에 i를 더함

		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}
}