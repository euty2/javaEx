import java.util.Scanner;

public class $17 {
    public static void main(String[] args) {
        // 17. 양의 정수 입력받고 그 수만큼 3의 배수 출력하세요
        //     예를 들어 5를 입력받으면 3 6 9 12 15를 출력하면 됩니다
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요 : ");
        int num = sc.nextInt();

        for(int i = 1;i <= num;i++){
            System.out.println(i*3);
        }

        sc.close();
    }
}
