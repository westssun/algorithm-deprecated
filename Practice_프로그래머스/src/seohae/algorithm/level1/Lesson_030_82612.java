package seohae.algorithm.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 음양 더하기
 * https://programmers.co.kr/learn/courses/30/lessons/76501
 */
public class Lesson_030_82612 {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (!signs[i]) {
                sum += absolutes[i] * (-1);
            } else {
                sum += absolutes[i];
            }
        }

        return sum;
    }
}