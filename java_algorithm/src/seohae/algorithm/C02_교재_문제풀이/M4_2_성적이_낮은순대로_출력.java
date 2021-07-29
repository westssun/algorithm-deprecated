package seohae.algorithm.C02_교재_문제풀이;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 학생 정보에 이름/성적으로 구분되는데, 성적이 낮은 순서대로 학생의 이름을 출력하라.
 - 입력 : 홍길동 95 / 이순신 77
 - 출력 : 이순신 홍길동
 */
public class M4_2_성적이_낮은순대로_출력 {

    public static void main(String[] args) {
        /* start */
        Scanner sc = new Scanner(System.in);

        // N을 입력받기
        int n = sc.nextInt();

        // N명의 학생 정보를 입력받아 리스트에 저장
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();

            students.add(new Student(name, score));
        }

        Collections.sort(students);

        for (int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i).getName() + " ");
        }

    }

    /**
     * 답안 : https://github.com/ndb796/python-for-coding-test/blob/master/6/11.java
     */
    private void bookAnswer() {
        /* main 과 동일 */
    }
}

class Student implements Comparable<Student> {

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    // 정렬 기준은 '점수가 낮은 순서'
    @Override
    public int compareTo(Student other) {
        if (this.score < other.score) {
            return -1;
        }
        return 1;
    }
}