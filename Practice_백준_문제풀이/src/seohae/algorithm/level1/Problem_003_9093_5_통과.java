package seohae.algorithm.level1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

/**
 * 단어 뒤집기
 * https://www.acmicpc.net/problem/9093
 */
public class Problem_003_9093_5_통과 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        Stack<Character> stack = new Stack<Character>();
        sc.nextLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (num-- > 0) {
            String input = sc.nextLine();
            input += " "; /* 마지막 단어도 걸리도록 추가 */

            for (char ch : input.toCharArray()) {
                if (ch == ' ' || ch == '\n') {
                    while (!stack.isEmpty()) {
                        bw.write(stack.pop());
                    }

                    bw.write(ch); // 공백
                } else
                    stack.push(ch);
            }

            bw.flush();
        }
    }
}
