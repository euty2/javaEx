import java.util.Arrays;

public class $09Array {
    public static void main(String[] args) {
        int[] scores = {100, 99, 28, 54, 56};
        int[] score1 = Arrays.copyOf(scores, scores.length);
        int[] score2 = Arrays.copyOf(scores, scores.length);

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
