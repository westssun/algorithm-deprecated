package seohae.algorithm.C02_교재_문제풀이;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 두 배열은 N개의 원소로 구성되어 있고, 배열의 원소는 모두 자연수이다.
 * 최대 K번의 바꿔치기가 가능하다.
 * 배열 A, 배열 B 각 원소를 하나씩 골라서 서로 바꿀 수 있다.
 * 배열 A의 모든 원소의 합이 최대가 되도록 하는 것이다.

 */
public class M4_3_두_배열의_원소교체 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N과 K를 입력받기
        int n = sc.nextInt();
        int k = sc.nextInt();

        // 배열 A의 모든 원소를 입력받기
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // 배열 B의 모든 원소를 입력받기
        Integer[] b = new Integer[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        /* start */
        // 배열 A는 오름차순 정렬 수행
        Arrays.sort(a);
        // 배열 B는 내림차순 정렬 수행
        Arrays.sort(b, Collections.reverseOrder());

        // 첫 번째 인덱스부터 확인하며, 두 배열의 원소를 최대 K번 비교
        for (int i = 0; i < k; i++) {
            // A의 원소가 B의 원소보다 작은 경우
            if (a[i] < b[i]) {
                // 두 원소를 교체
                int temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }
            // A의 원소가 B의 원소보다 크거나 같을 때, 반복문을 탈출
            else break;
        }

        // 배열 A의 모든 원소의 합을 출력
        long result = 0;
        for (int i = 0; i < n; i++) {
            result += a[i];
        }
        System.out.println(result);
    }

    /**
     * 답안 : https://github.com/ndb796/python-for-coding-test/blob/master/6/12.java
     */
    private void bookAnswer() {
        /* main 과 동일 */
    }
}
