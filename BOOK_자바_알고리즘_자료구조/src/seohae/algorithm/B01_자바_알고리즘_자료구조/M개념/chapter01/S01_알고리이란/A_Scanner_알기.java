package seohae.algorithm.B01_자바_알고리즘_자료구조.M개념.chapter01.S01_알고리이란;

import java.util.Scanner;

public class A_Scanner_알기 {
    public static void main(String[] args) {
        /* 키보드와 연결된 표준 입력 스트림 (standard input stream) */
        /**
         * stdIn 의 역할
         * - 연결된 표준 입력 스트림에서 문자나 숫자를 꺼내는 장치 역할을 한다.
         */
        Scanner stdIn = new Scanner(System.in);
        stdIn.nextInt(); /* 정수값 얻기 */
    }
}
