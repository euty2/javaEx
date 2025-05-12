import java.util.Scanner;

public class $14 {
    public static void main(String[] args) {
        // 14. 369게임을 작성합니다.
        //     1~99까지의 정수를 입력받고
        //     3,6,9중 하나가 있으면 "박수짝"을 출력하고
        //     2개가 있으면 "박수짝짝"을 출력하세요
        //     예를 들어 13은 "박수짝"
        //     36인 경우는 "박수짝짝"을 출력하면 됩니다.
        Scanner sc = new Scanner(System.in);
        System.out.print("1~99중 정수 하나를 입력해주세요 : ");
        int num = sc.nextInt();

        if(num % 3 == 0 || num % 6 == 0 || num % 9 == 0){
            System.out.println("박수짝");
        }
        else if(num % 3 == 0 && num % 6 == 0){
            System.out.println("박수짝짝")
        }
    }
}
