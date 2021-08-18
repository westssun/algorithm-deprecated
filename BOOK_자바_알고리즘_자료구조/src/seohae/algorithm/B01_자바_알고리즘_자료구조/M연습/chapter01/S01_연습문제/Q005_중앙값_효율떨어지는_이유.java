package seohae.algorithm.B01_자바_알고리즘_자료구조.M연습.chapter01.S01_연습문제;

public class Q005_중앙값_효율떨어지는_이유 {
    static int med3 (int a, int b, int c) {
        if ((b >= a && c <= a) || (b <= a && c >= a)) {
            return a;
        } else if ((a > b && c < b) || (a < b && c > b)) {
            return b;
        }

        return c;
    }

    //	연습1-5 해답
    //	가장 처음의 if문의 판단
    //	if ((b >= a && c<= a) || (b <= a && c >= a))
    //	에 주목합니다. 여기서 b >= a 및 b <= a의 판단을 뒤집은 판단(실질적으로 같은 판단)을 이어지는 else 이후의
    //	else if ((a > b && c < b) || (b <= a && c > b))
    //	으로 수행합니다. 결국 가장 처음의 if가 성립한 경우 2 번째의 if에서도 (실질적으로)같은 판단을 수행하므로 효율이 나빠집니다.

}
