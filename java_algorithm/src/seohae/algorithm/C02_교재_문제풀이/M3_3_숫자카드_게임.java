package seohae.algorithm.C02_교재_문제풀이;

import java.util.Scanner;

/**
 * 여러 개의 숫자 카드 중에서 가장 높은 숫자가 쓰인 카드 한장을 뽑는 게임이다.
   먼저 뽑고자 하는 카드가 포함되어 있는 행을 선택한다.
   그 다음 선택된 행에 포함된 카드들 중 가장 숫자가 낮은 카드를 뽑아야한다.
   처음에 카드를 골라낼 행을 선택할때, 이후에 해당 행에서 가장 작은 숫자의 카드를 뽑을 것을 고려하여
   최종적으로 가장 높은 숫자의 카드를 뽑을 수 있도록 전략을 세워야한다.
 */
public class M3_3_숫자카드_게임 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N, M을 공백을 기준으로 구분하여 입력 받기
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;

        /* start */
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int minValue = Integer.MAX_VALUE;
            for (int j = 1; j < m; j++) {
                // 한줄 입력 받기
                int x = sc.nextInt();

                // 한 줄에서 가장 최소값 저장
                if (minValue > x) {
                    minValue = x;
                }
            }

            // 최소값 중에서 큰 수 찾기
            if (maxValue < minValue) {
                maxValue = minValue;
                result = minValue;
            }
        }

        System.out.println(result); // 최종 답안 출력
    }

    /**
     * 답안 : https://github.com/ndb796/python-for-coding-test/blob/master/3/4.java
     */
    private void bookAnswer() {
        Scanner sc = new Scanner(System.in);

        // N, M을 공백을 기준으로 구분하여 입력 받기
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;

        /* start */
        for (int i = 0; i < n; i++) {
            // 현재 줄에서 '가장 작은 수' 찾기
            int min_value = 10001;
            for (int j = 0; j < m; j++) {
                int x = sc.nextInt();
                min_value = Math.min(min_value, x);
            }
            // '가장 작은 수'들 중에서 가장 큰 수 찾기
            result = Math.max(result, min_value);
        }

        System.out.println(result); // 최종 답안 출력
    }
}
