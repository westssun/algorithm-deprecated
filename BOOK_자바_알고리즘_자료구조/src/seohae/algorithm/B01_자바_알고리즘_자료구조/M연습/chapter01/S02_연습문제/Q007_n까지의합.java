package seohae.algorithm.B01_자바_알고리즘_자료구조.M연습.chapter01.S02_연습문제;
import java.util.Scanner;
// 1, 2, …, n의 합을 구합니다  (식1 + 2 + … + n = 999라고 출력함)

class Q007_n까지의합 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값：");
		int n = stdIn.nextInt();

		int sum = 0; // 합

		for (int i = 1; i <= n; i++) {
			if(i < n)
				System.out.print(i + " + ");
			else
				System.out.print(i);
			sum += i; // sum에 i를 더함
		}
		System.out.println(" = " + sum);
	}
}
