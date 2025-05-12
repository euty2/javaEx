import java.util.Scanner;

public class $16 {
    public static void main(String[] args) {
        // 16. 양의 정수를 입력받고 그 수만큼 "감사합니다"를 출력하세요
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요: ");
        int num = sc.nextInt();

        for(int i = 1;i <= num;i++){
            System.out.println("감사합니다");
        }
    }
}
