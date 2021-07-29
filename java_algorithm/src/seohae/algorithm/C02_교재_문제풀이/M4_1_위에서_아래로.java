package seohae.algorithm.C02_교재_문제풀이;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 수열을 내림차순으로 정렬해라.
 */
public class M4_1_위에서_아래로 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N을 입력받기
        int n = sc.nextInt();

        // N개의 정수를 입력받아 리스트에 저장
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        /* start */
        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * 답안 : https://github.com/ndb796/python-for-coding-test/blob/master/6/10.java
     */
    private void bookAnswer() {
        /* main 과 동일 */
    }
}
