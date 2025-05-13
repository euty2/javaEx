import java.util.Scanner;

public class $14 {
    public static void main(String[] args) {
        // 14. 369게임을 작성합니다.
        //     1~99까지의 정수를 입력받고
        //     3,6,9중 하나가 있으면 "박수짝"을 출력하고
        //     2개가 있으면 "박수짝짝"을 출력하세요
        //     예를 들어 13은 "박수짝"
        //     36인 경우는 "박수짝짝"을 출력하면 됩니다.

        Scanner scanner = new Scanner(System.in);

        // 정수 입력 받기
        System.out.print("1~99 사이의 정수를 입력하세요: ");
        int number = scanner.nextInt();

        // 유효성 검사
        if (number < 1 || number > 99) {
            System.out.println("입력 값은 1~99 사이여야 합니다.");
        } else {
            int clapCount = 0;

            // 1의 자리와 10의 자리를 나눠서 각각 검사
            int tens = number / 10;
            int ones = number % 10;

            if (tens == 3 || tens == 6 || tens == 9) clapCount++;
            if (ones == 3 || ones == 6 || ones == 9) clapCount++;

            // 결과 출력
            if (clapCount == 1) {
                System.out.println("박수짝");
            } else if (clapCount == 2) {
                System.out.println("박수짝짝");
            } else {
                System.out.println("박수 없음");
            }
        }

        scanner.close();
    }
}
