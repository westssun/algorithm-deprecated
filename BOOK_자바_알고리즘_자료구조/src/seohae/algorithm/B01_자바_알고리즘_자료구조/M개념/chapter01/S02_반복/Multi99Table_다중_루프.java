package seohae.algorithm.B01_자바_알고리즘_자료구조.M개념.chapter01.S02_반복;
// 곱셈표를 출력합니다.

public class Multi99Table_다중_루프 {
	public static void main(String[] args) {
		System.out.println("----- 곱셈표 -----");

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++)
				System.out.printf("%3d", i * j);
			System.out.println();
		}
	}
}