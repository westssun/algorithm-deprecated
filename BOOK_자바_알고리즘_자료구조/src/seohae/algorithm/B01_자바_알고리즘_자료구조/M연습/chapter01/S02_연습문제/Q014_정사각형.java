package seohae.algorithm.B01_자바_알고리즘_자료구조.M연습.chapter01.S02_연습문제;
import java.util.Scanner;
// 정사각형 모양을 나타냄

public class Q014_정사각형 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("정사각형 모양으로 나타냅니다.");

		do {
			System.out.print("단수는：");
			n = stdIn.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}