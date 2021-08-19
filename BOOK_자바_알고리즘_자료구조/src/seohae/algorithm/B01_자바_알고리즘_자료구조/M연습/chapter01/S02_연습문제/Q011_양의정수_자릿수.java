package seohae.algorithm.B01_자바_알고리즘_자료구조.M연습.chapter01.S02_연습문제;
import java.util.Scanner;
// 양의 정수값의 자릿수를 구하여 나타냄

class Q011_양의정수_자릿수 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("양의 정수값의 자릿수를 구합니다.");

		int n;
		do {
			System.out.print("정수값：");
			n = stdIn.nextInt();
		} while (n <= 0);

		int no = 0; 			// 자릿수
		while (n > 0) {
			n /= 10; 			// n을 10으로 나눔
			no++;
		}

		System.out.println("그 수는 " + no + "자리입니다.");
	}
}