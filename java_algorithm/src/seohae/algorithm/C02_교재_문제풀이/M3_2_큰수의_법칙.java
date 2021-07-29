package seohae.algorithm.C02_교재_문제풀이;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 큰 수의 법칙은 다양한 수로 이루어진 배열이 있을때 주어진 수들을 M번 더하여 가장 큰 수를 만드는 법칙이다.
   배열의 특정한 인덱스에 해당하는 수가 연속해서 K번 초과하여 더해질 수 없다.

   예로, 2, 4, 5, 4, 6 의 배열일때 M 8이고 K 3이다.
   6 + 6 + 6 + 5 + 6 + 6 + 6 + 5 = 46이다.
 */
public class M3_2_큰수의_법칙 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N, M, K를 공백을 기준으로 구분하여 입력 받기
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        // N개의 수를 공백을 기준으로 구분하여 입력 받기
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        /* start */
        // 리스트 오름차순 정렬
        Arrays.sort(arr);

        // 가장 큰 수를 구한다.
        int max = arr[n - 1];
        // 두번째 큰 수를 구한다.
        int secondMax = arr[n - 2];

        // 1) 반복해서 큰 수를 K번 더한다.
        // 2) 두번째 큰 수를 1번 더한다.
        // 위 로직을 M번 만큼 수행한다.
        int count = 0;
        int result = 0;

        int kNum = 1;
        while (count < m) {

            if (kNum <= k) {
                result += max;
                kNum += 1;
            } else {
                result += secondMax;
                kNum = 1;
            }

            count++;
        }

        System.out.println(result);
    }

    /**
     * 답안 : https://github.com/ndb796/python-for-coding-test/blob/master/3/2.java
     */
    private void bookAnswer() {
        Scanner sc = new Scanner(System.in);

        // N, M, K를 공백을 기준으로 구분하여 입력 받기
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        // N개의 수를 공백을 기준으로 구분하여 입력 받기
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // 입력 받은 수들 정렬하기
        int first = arr[n - 1]; // 가장 큰 수
        int second = arr[n - 2]; // 두 번째로 큰 수

        // 가장 큰 수가 더해지는 횟수 계산
        int cnt = (m / (k + 1)) * k;
        cnt += m % (k + 1);

        int result = 0;
        result += cnt * first; // 가장 큰 수 더하기
        result += (m - cnt) * second; // 두 번째로 큰 수 더하기

        System.out.println(result);
    }
}
