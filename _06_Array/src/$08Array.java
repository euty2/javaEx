import java.util.Arrays;

public class $08Array {
    public static void main(String[] args) {
        int[] scores = {100, 99, 28, 54, 56};
        // 얕은 복사(참조 해시코드를 복사해서 같은 힙공간을 가리키게 됨)
        int[] score1 = scores;
        int[] score2 = scores;

        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.toString(score1));
        System.out.println(Arrays.toString(score2));

        score1[2] = 99999;
        score2[3] = 11111;

        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.toString(score1));
        System.out.println(Arrays.toString(score2));
    }
}
