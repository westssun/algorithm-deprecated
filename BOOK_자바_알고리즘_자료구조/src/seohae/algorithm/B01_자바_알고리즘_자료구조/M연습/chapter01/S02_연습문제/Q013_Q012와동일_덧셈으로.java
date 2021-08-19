package seohae.algorithm.B01_자바_알고리즘_자료구조.M연습.chapter01.S02_연습문제;

class Q013_Q012와동일_덧셈으로 {
	public static void main(String[] args) {

		System.out.print("   |");
		for (int i = 1; i <= 9; i++)
			System.out.printf("%3d", i);
		System.out.println("\n---+---------------------------");

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d |", i);
			for (int j = 1; j <= 9; j++)
				System.out.printf("%3d", i + j);
			System.out.println();
		}
	}
}