package seohae.algorithm.C02_교재_문제풀이;

/**
 * 거스름돈 500원, 100원, 50원, 10원짜리 동전이 무한이 존재한다고 가정한다.
   손님에게 거슬러 줘야할 돈이 N원 일때 거슬러줘야할 동전의 최소 개수를 구하라.
 */
public class M3_1_거스름돈 {

    public static void main(String[] args) {
        int n = 1260;
        int cnt = 0;
        int[] coinTypes = {500, 100, 50, 10};

        /* start */
        for (int coin : coinTypes) {
            cnt = cnt + (n / coin);
            n = n % coin;
        }

        System.out.println(cnt);
    }

    /**
     * 답안 : https://github.com/ndb796/python-for-coding-test/blob/master/3/1.java
     */
    private void bookAnswer() {
        int n = 1260;
        int cnt = 0;
        int[] coinTypes = {500, 100, 50, 10};

        for (int i = 0; i < 4; i++) {
            int coin = coinTypes[i];
            cnt += n / coin;
            n %= coin;
        }

        System.out.println(cnt);
    }
}
