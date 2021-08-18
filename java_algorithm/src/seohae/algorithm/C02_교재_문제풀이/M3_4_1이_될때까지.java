package seohae.algorithm.C02_교재_문제풀이;

import java.util.Scanner;

/**
 * 어떤 수 N이 1이 될때까지 다음의 두 과정 중 하나를 반복적으로 선택하여 수행한다.
   단, 두번째 연산은 N이 K로 나누어 떨어질 때에만 선택할 수 있다.

   1) N 에서 1을 뺀다.
   2) N 을 K 로 나눈다.

    N과 K가 주어질때 N이 1이 될때까지 1번 혹은 2번의 과정을 수행해야하는 최소 홧수를 구해라.
 */
public class M3_4_1이_될때까지 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N, K를 공백을 기준으로 구분하여 입력 받기
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 0;

        /* start */
        while (n >= k) {
            /* n 이 k 로 나누어 떨어질때까지 -1 */
            while (n % k != 0) {
                n -= 1;
                result += 1;
            }

            /* 나누어 떨어진다고 가정 */
            n = n / k;
            result += 1;
        }

        while (n > 1) {
            n = n - 1;
            result = result + 1;
        }

        System.out.println(result);
    }

    /**
     * 답안 : https://github.com/ndb796/python-for-coding-test/blob/master/3/6.java
     */
    private void bookAnswer() {
        Scanner sc = new Scanner(System.in);

        // N, K를 공백을 기준으로 구분하여 입력 받기
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 0;

        while (true) {
            // N이 K로 나누어 떨어지는 수가 될 때까지만 1씩 빼기
            int target = (n / k) * k;
            result += (n - target);
            n = target;
            // N이 K보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
            if (n < k) break;
            // K로 나누기
            result += 1;
            n /= k;
        }

        // 마지막으로 남은 수에 대하여 1씩 빼기
        result += (n - 1);
        System.out.println(result);
    }
}
