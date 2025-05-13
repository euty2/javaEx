import java.util.Scanner;

public class $03 {
    public static void main(String[] args) {
        // 3. 7명의 학생의 학점을 입력받고 총점과 평균을 출력하세요
        final int STUDENT_NUM = 7;

        Scanner sc = new Scanner(System.in);

        int[] score = new int[STUDENT_NUM];
        for(int i = 0;i < score.length;i++){
            System.out.print((i+1) + "번째 학생 학점 입력하세요 : ");
            score[i] = sc.nextInt();
        }

        int total = 0;
        for(int i = 0;i<score.length;i++){
            total += score[i];
        }

        double avg = (double) total / score.length;

        System.out.println("총점 : " + total);
        System.out.printf("평균 : %.2f\n", avg);

        sc.close();
    }
}
