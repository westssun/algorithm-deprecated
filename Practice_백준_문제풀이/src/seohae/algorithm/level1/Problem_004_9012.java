package seohae.algorithm.level1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

/**
 * 괄호
 * https://www.acmicpc.net/problem/9012
 */
public class Problem_004_9012 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for(int i = 0; i < T; i++) {
            System.out.println(solution(in.next()));	// nextLine()쓰면 안된다.
        }
    }

    public static String solution(String s) {
        String result = "NO";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            /* '(' 일때 stack push */
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                /* ')' 일때 stack 에서 짝 '(' 을 꺼낸다 */
                if (!stack.isEmpty()) { /* 비어져있지 않을때 */
                    stack.pop(); /* '(' 1개 pop */
                    result = "YES";
                } else { /* stack 이 비어져있다면 닫히지 않는다는 의미 */
                    result = "NO";
                    break;
                }
            }
        }

        /* stack 이 비어져있지 않다면 '('가 남아있다는 의미 */
        if (!stack.isEmpty()) {
            result = "NO";
        }

        return result;
    }
}
